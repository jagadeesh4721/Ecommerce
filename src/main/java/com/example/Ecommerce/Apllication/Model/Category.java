package com.example.Ecommerce.Apllication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
public class Category {
    @Id
    @GeneratedValue
    private int category_id;
    private String  category_name;
    private String category_descrption;

    @OneToMany(mappedBy = "",cascade = CascadeType.ALL)
    private List<Product>productlist=new ArrayList<Product>();

}
