package com.ecommerce.shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ord_prod_id", nullable = false, updatable = false)
    private Integer ord_prod_id;
    private Integer user_id;
    private Integer product_id;
    private int quantity;

}
