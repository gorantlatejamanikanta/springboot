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
public class SalesTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id", nullable = false, updatable = false)
    private Integer transaction_id;
    private Integer order_id;
    //Update to Data time later
    private String transaction_date;
    private double amount;
    private String cc_type;
    private String cc_number;
    private String response;

}
