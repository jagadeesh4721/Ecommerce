package com.example.Ecommerce.Apllication.Controller;

import com.example.Ecommerce.Apllication.Model.User;
import com.example.Ecommerce.Apllication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
     @Autowired
     UserService userservice;
     @PostMapping("/signup")
     public void signup(@RequestBody  User u){
         userservice.signup(u);
     }
     @PostMapping("/login")
     public void login(@RequestBody User u){

     }


}
