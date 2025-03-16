package dev.jadnb.shoppinglist.business.persitence.respository;

import dev.jadnb.shoppinglist.business.persitence.model.ShoppingListModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ShoppingListRepository extends JpaRepository<ShoppingListModel, Long> {

    List<ShoppingListModel> findShoppingListModelsByUserUuid(UUID userUuid);
}
