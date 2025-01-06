RETRIES=10
TIME_BETWEEN_TRIES=5

until pg_isready -h $DB_HOST -p $DB_PORT 2>&1 > /dev/null || [ $RETRIES -eq 0 ]
do
  echo "Connection failed, $RETRIES retries left"
  RETRIES=$(($RETRIES-1))
  sleep $TIME_BETWEEN_TRIES
done

if [ pg_isready -h $DB_HOST -p $DB_PORT > /dev/null 2>&1 ] ;
then
  exit 1
fi

export PGPASSWORD=$DB_PASS

psql -h $DB_HOST -p $DB_PORT -U $DB_USER <<EOF
  CREATE DATABASE $DB_DATABASE;
EOF
