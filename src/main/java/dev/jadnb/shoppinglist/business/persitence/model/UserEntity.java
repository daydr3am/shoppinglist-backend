package dev.jadnb.shoppinglist.business.persitence.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "app_user")
public class UserEntity {

    @Id
    @GeneratedValue
    private long id;

    private String uuid;

    private String firstName;

    private String lastName;

    private String displayName;

    @OneToMany(
            mappedBy = "owner"
    )
    private List<ShoppingListEntity> shoppingLists;
}
