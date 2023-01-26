package com.retail.ecommerce.controllers;

import com.retail.ecommerce.Model.Product;
import com.retail.ecommerce.Model.User;
import com.retail.ecommerce.Repository.ProductRepository;
import com.retail.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable("id") int id){
        return productService.getProduct(id);
    }

    @PutMapping("/put")
    public boolean putProduct(@RequestBody Product product){
        productService.putProduct(product);
        return true;
    }

}
