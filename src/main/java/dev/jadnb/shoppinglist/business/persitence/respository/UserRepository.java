package dev.jadnb.shoppinglist.business.persitence.respository;

import dev.jadnb.shoppinglist.business.persitence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUuid(String uuid);

}
