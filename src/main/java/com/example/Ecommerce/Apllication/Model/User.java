package com.example.Ecommerce.Apllication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ecommerce-user")
public class User {
    @Id
    @GeneratedValue
    private int userid;
    private String userfname;
    private String userlname;
    private String useremail;
    private String password;
}
