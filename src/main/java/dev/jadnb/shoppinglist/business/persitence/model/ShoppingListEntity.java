package dev.jadnb.shoppinglist.business.persitence.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class ShoppingListEntity {

    @Id
    @GeneratedValue
    private long id;

    private UUID resourceId;

    @OneToMany(
            mappedBy = "shoppingList",
            cascade = CascadeType.ALL
    )
    private List<ShoppingItemEntity> items;

    private void addItem(ShoppingItemEntity item) {
        item.setShoppingList(this);
        items.add(item);
    }
}
