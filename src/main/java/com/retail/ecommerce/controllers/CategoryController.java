package com.retail.ecommerce.controllers;

import com.retail.ecommerce.Model.Category;
import com.retail.ecommerce.Model.User;
import com.retail.ecommerce.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get/all")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();

    }

    @GetMapping("/get/{id}")
    public Category getCategory(@PathVariable("id") int id){
        return categoryService.getCategory(id);
    }

    @PutMapping("/put")
    public boolean putcategory(@RequestBody Category category){
        System.out.println(category.toString());
        return categoryService.putcategory(category);
    }
}
