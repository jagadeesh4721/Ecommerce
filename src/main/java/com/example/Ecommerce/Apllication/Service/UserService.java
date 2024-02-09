package com.example.Ecommerce.Apllication.Service;

import com.example.Ecommerce.Apllication.Model.User;
import com.example.Ecommerce.Apllication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userrepo;
    public void signup(User u){
        userrepo.save(u);
    }
    public void login(User u){

    }
}
