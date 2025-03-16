package dev.jadnb.shoppinglist.business.persitence.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ShoppingItemModel {

    @GeneratedValue
    @Id
    private long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ShoppingListModel shoppingList;

    private long quantity;
}
