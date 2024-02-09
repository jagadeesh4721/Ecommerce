package com.example.Ecommerce.Apllication.Repository;

import com.example.Ecommerce.Apllication.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
