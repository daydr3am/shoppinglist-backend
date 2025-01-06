package dev.jadnb.shoppinglist.business.persitence.respository;

import dev.jadnb.shoppinglist.business.persitence.model.ShoppingListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<ShoppingListEntity, Long> {
}
