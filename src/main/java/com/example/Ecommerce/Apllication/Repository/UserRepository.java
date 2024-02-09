package com.example.Ecommerce.Apllication.Repository;

import com.example.Ecommerce.Apllication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
