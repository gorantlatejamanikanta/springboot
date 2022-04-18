package com.ecommerce.shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false, updatable = false)
    private Integer product_id;
    private String sku;
    private String product_name;
    private String description;
    private String quantity;
    private double regular_price;
    private double discounted_price;
    private int product_rating;
    private String product_review;

    @OneToMany(targetEntity=OrderProducts.class)
    private List<OrderProducts> orderProducts;
    @ManyToMany(targetEntity=Cart.class)
    private List cart;
}
