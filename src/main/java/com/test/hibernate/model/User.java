package com.test.hibernate.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Ruzal on 4/12/2017.
 */
@Entity
@Table(name = "testdb")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name should not be blank.")
//    @Size(min = 5, max = 15, message = "Your Name must between 5 and 15 characters")
    @Column(name = "Name",nullable = false)
    private String name;

    @NotEmpty(message = "Please enter your email address.")
    @Column(name = "Email",unique = true,nullable = false)
    @Email(message = "Example : john@gmail.com")
    private String email;

    @NotEmpty(message = "Password should not be blank.")
//    @Size(min = 5, max = 15, message = "Your password must between 8 and 15")
    @Column(name = "Password",nullable = false)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


