package com.lavish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        student s = new student();
        s.setId(1);
        s.setName("Lavish");
        s.setTech("Java");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(student.class);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(s);
        tx.commit();

        session.close();
        factory.close();
    }
}
