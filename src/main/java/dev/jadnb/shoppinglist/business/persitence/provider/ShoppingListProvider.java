package dev.jadnb.shoppinglist.business.persitence.provider;

import dev.jadnb.shoppinglist.business.persitence.model.ShoppingListEntity;

import java.util.List;

public interface ShoppingListProvider {

    List<ShoppingListEntity> getAllShoppingListsForUser(String userId);

}
