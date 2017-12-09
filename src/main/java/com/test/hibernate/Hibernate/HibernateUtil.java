package com.test.hibernate.Hibernate;


import com.test.hibernate.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ruzal on 4/12/2017.
 */
public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

                Map<String, String> settings = new HashMap<String, String>();
                settings.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
                settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/mydb");
                settings.put("hibernate.connection.username", "root");
                settings.put("hibernate.connection.password", "");
                settings.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

                registryBuilder.applySettings(settings);
                registry = registryBuilder.build();
                MetadataSources sources = new MetadataSources(registry).addAnnotatedClass(User.class);

                Metadata metadata = sources.getMetadataBuilder().build();
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }
}
