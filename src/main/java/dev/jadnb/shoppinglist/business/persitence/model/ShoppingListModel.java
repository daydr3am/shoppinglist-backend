package dev.jadnb.shoppinglist.business.persitence.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class ShoppingListModel {

    @Id
    @GeneratedValue
    private long id;

    private UUID resourceId;

    @OneToMany(
            mappedBy = "shoppingList",
            cascade = CascadeType.ALL
    )
    private List<ShoppingItemModel> items;

    private UUID userUuid;

    public void addItem(ShoppingItemModel item) {
        item.setShoppingList(this);
        items.add(item);
    }
}
