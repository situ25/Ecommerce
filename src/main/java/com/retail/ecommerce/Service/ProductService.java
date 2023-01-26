package com.retail.ecommerce.Service;

import com.retail.ecommerce.Model.Product;
import com.retail.ecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProduct(int id){
        Optional<Product> product=productRepository.findById(id);
        if(product.isPresent())
            return product.get();
        return null;
    }

    public Product putProduct(Product product){
        return productRepository.save(product);
    }
}
