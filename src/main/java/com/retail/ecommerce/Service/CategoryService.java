package com.retail.ecommerce.Service;

import com.retail.ecommerce.Model.Category;
import com.retail.ecommerce.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category getCategory(int id){
        Optional<Category> category=categoryRepository.findById(id);
        if(category.isPresent())
            return category.get();
        return null;
    }

    public boolean putcategory(Category category){
        categoryRepository.save(category);
        return true;
    }
}
