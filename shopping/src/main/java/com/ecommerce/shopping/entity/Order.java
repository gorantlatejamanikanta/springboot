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
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false, updatable = false)
    private Integer order_id;
    private Integer user_id;
    //Update to Data time later
    private String order_date;
    private double total_price;

    @OneToMany(targetEntity=OrderProducts.class)
    private List<OrderProducts> orderProducts;
}
