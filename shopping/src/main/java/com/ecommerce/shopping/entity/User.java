package com.ecommerce.shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@ToString
public class User {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false, updatable = false)
    private Integer user_id;
    private String email;
    private String fname;
    private String lname;
    private String password;
    private boolean active;
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



}
