package com.retail.ecommerce.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name= "Product")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name= "id",nullable = false,unique = true)
        private int productId;

        @Column(name="productName",unique = true,nullable = false)
        private String productName;
        @Column(name="productDescription",unique = false,nullable = true)
        private String productDescription;
}
