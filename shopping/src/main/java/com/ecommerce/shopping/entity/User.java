package com.ecommerce.shopping.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false, updatable = false)
    private Integer user_id;
    private String email;
    private String fname;
    private String lname;
    private String password;
    private boolean active;
    //Update to Data time later
    private String createdon;
    private String address1;
    private String address2;
    private String state;
    private String city;
    private String zipcode;
    private String country;
    private String phone;
    private boolean isAdmin;
    private String image;

    @OneToMany(targetEntity=Order.class)
    private List<Order> orders;
}
