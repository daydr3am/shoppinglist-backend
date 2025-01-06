package dev.jadnb.shoppinglist.business.persitence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class ItemEntity {

    @Id
    @GeneratedValue
    private long id;

    private UUID resourceId;

    private String name;

    private String ean;

    private String description;

    private String category;
}
