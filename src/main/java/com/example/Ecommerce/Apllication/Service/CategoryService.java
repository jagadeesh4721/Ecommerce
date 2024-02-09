package com.example.Ecommerce.Apllication.Service;

import com.example.Ecommerce.Apllication.Model.Category;
import com.example.Ecommerce.Apllication.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
     @Autowired
    CategoryRepository categoryrepo;
     public void addcategory(Category c){
         categoryrepo.save(c);
     }
     public Optional<Category> updateid(int id, Category c){
          Optional<Category> category= categoryrepo.findById(id);
          if(category.isEmpty()) return null;
          category.get().setCategory_name(c.getCategory_name());
          category.get().setCategory_descrption(c.getCategory_descrption());
          categoryrepo.save(category.get());
          return category;
     }
     public String deleteid(int id){
         Optional<Category> category=categoryrepo.findById(id);
         if(category.isEmpty()){
             return "id is already deleted";
         }
         categoryrepo.deleteById(id);
         return "id deleted";
     }
}
