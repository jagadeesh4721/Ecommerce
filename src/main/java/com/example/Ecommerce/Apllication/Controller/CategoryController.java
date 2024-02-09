package com.example.Ecommerce.Apllication.Controller;

import com.example.Ecommerce.Apllication.Model.Category;
import com.example.Ecommerce.Apllication.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
      @Autowired
    CategoryService categoryservice;

     @PostMapping("/add_category")
     public void addcategory(@RequestBody Category c){
          categoryservice.addcategory(c);
     }
     @PutMapping("/updateid/{id}")
     public Optional<Category> updateid(@PathVariable int id, @RequestBody Category c){
              return categoryservice.updateid(id,c);
     }
     @DeleteMapping("/deletecategory/{id}")
     public String deleteid(@PathVariable int id){
         return categoryservice.deleteid(id);
     }
}
