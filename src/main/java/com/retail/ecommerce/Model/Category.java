package com.retail.ecommerce.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Getter
@Setter
@Entity
@Table(name= "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id", unique = true, nullable = false)
    private int categoryId;

    @Column(name="categoryName",unique= true, nullable = false)
    private String categoryName;

    @Column(name="categoryDescription", unique=true, nullable = false)
    private String categoryDescription;

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }
}
