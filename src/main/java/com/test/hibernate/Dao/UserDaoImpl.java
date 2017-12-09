package com.test.hibernate.Dao;

import com.test.hibernate.Hibernate.HibernateUtil;
import com.test.hibernate.model.User;
import org.hibernate.*;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Ruzal on 4/12/2017.
 */
@Repository
@Resource(name = "userDao")
public class UserDaoImpl implements UserDao {


    Session session = null;
    Transaction transaction = null;

    @Override
    public void save(User user) {


        try {
            session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("good session");
            transaction = session.beginTransaction();

            session.save(user);

            System.out.println("Inserted");

        } catch (Exception e) {
            e.printStackTrace();
            if (session == null || transaction != null) {
                System.out.println("\nSession is null;\n rolling back transaction");
                transaction.rollback();

            }
        } finally {

            session.flush();
            session.close();

        }

    }

    @Override
    public List<User> display() {

        Criteria criteria = HibernateUtil.getSessionFactory().openSession().createCriteria(User.class);
        return criteria.list();

    }

    @Override
    public void update(User user) {

        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {

            System.out.println(user.getId());
            System.out.println(user.getName());
            session.update(user);
            System.out.println("udpated");

        } catch (ObjectNotFoundException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

    }

    @Override
    public void delete(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try {

            User user = session.load(User.class, new Integer(id));
            System.out.println(id);
            if (user != null) {
                session.delete(user);
                System.out.println(user.getName());
                System.out.println("deleted");

            }
        } catch (ObjectNotFoundException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

    }

    @Override
    public User search(String email, String password) {

        System.out.println(email);
        System.out.println(password);
        List<User> list = display();
        User users = null;
        try {
            for (User user : list) {

                if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                    System.out.println("found");
                    users = user;
                    System.out.println(users.getName());
                }
            }

            System.out.println(users.getName());
            return users;

        } catch (Exception e) {
            return null;
        }

    }
}