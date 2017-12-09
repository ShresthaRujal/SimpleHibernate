package com.test.hibernate.Dao;

import com.test.hibernate.model.User;

import java.util.List;

/**
 * Created by Ruzal on 4/12/2017.
 */
public interface UserDao {

    void save(User user);
    List<User> display();
    void update(User user);
    void delete(int id);
    User search(String email,String password);
}
