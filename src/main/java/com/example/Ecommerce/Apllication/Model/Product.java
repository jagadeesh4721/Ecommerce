package com.example.Ecommerce.Apllication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int product_id;
    private String product_name;
    private int price;
    private String product_descrption;

}
