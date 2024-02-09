package com.example.Ecommerce.Apllication.Controller;

import com.example.Ecommerce.Apllication.Model.Product;
import com.example.Ecommerce.Apllication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productservice;
    @PostMapping("/add-product")
    public void addproduct(@RequestBody Product p){
          productservice.addproduct(p);
    }
    @PutMapping("/update/{id}")
    public  Product updateproductid(@PathVariable int id,@RequestBody Product p){
       return productservice.updateproductid(id,p);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteid(@PathVariable int id){
        return productservice.deleteid(id);
    }
    @GetMapping("/getallproducts")
    public List<Product> getallproducts(){
        return productservice.getallproducts();
    }

}
