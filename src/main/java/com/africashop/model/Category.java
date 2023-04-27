package com.africashop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private int id;

    @Column(name="name")
    private String name;

}
