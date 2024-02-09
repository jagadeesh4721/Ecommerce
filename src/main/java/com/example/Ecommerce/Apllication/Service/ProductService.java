package com.example.Ecommerce.Apllication.Service;


import com.example.Ecommerce.Apllication.Model.Product;
import com.example.Ecommerce.Apllication.Repository.ProductRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepositoy productrepo;
    public void addproduct(Product p){
        productrepo.save(p);
    }
    public Product updateproductid(int id,Product p){
        Optional<Product> o=productrepo.findById(id);
        if(o.isEmpty()) return null;
       Product updatedproduct=productrepo.saveAndFlush(p);
       return updatedproduct;
    }
    public String deleteid(int id){
        Optional<Product>o=productrepo.findById(id);
        if(o.isEmpty()) return "id is not there ";
        return "id is deleted";
    }
    public List<Product>getallproducts(){
        return productrepo.findAll();
    }
//    public List<Product> getproductbyname(@RequestBody)

}
