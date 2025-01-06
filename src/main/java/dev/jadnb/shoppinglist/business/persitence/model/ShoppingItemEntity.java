package dev.jadnb.shoppinglist.business.persitence.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ShoppingItemEntity {

    @GeneratedValue
    @Id
    private long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ShoppingListEntity shoppingList;

    private long quantity;
}
