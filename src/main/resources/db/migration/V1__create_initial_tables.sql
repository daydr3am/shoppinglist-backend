BEGIN;

CREATE TABLE app_user
(
    id           bigserial PRIMARY KEY,
    first_name   varchar(100),
    last_name    varchar(100),
    display_name varchar(100)
);

CREATE TABLE shopping_list
(
    id          bigserial PRIMARY KEY,
    resource_id varchar(100) NOT NULL,
    owner       bigint       NOT NULL,
    CONSTRAINT FK_ShoppingList_User_Owner FOREIGN KEY (owner) REFERENCES app_user(id)
);

CREATE TABLE item
(
    id          bigserial PRIMARY KEY,
    ean         varchar(100),
    name        varchar(300) NOT NULL,
    description varchar(1000),
    category    varchar(100)
);

CREATE TABLE shopping_item
(
    id            bigserial PRIMARY KEY,
    item          bigint NOT NULL,
    quantity      int    NOT NULL,
    shopping_list bigint NOT NULL,
    CONSTRAINT FK_ShoppingItem_Item_Id FOREIGN KEY (item) REFERENCES item (id),
    CONSTRAINT FK_ShoppingItem_List_Id FOREIGN KEY (shopping_list) REFERENCES shopping_list (id)
);

COMMIT;