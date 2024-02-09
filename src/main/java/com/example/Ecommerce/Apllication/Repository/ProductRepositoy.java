package com.example.Ecommerce.Apllication.Repository;

import com.example.Ecommerce.Apllication.Model.Product;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoy extends JpaRepository<Product,Integer> {
}
