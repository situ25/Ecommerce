package com.retail.ecommerce.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false,unique = true)
    private int id;
    @Column(name="name",nullable = false,unique = true)
    private String name;
    @Column(name="email",nullable = true,unique = true)
    private String email;
    @Column(name="mobileNumber",nullable = true,unique = true)
    private String mobileNumber;
}
