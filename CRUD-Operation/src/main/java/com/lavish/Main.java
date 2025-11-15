package com.lavish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        student s = new student();
        s.setId(4);
        s.setName("Atul");
        s.setTech("Node Js");

//        Configuration config = new Configuration();
//        config.configure();
//        config.addAnnotatedClass(student.class);

        SessionFactory factory = new Configuration().addAnnotatedClass(com.lavish.student.class).configure().buildSessionFactory();
        Session session = factory.openSession();
//        session.merge(s); Update
        Transaction tx = session.beginTransaction();
//        student s=session.find(student.class, 4);
//        session.remove(s);
        session.persist(s);
        tx.commit();
//        student s= session.get(student.class, 1); eager fetching
//        student s= session.find(student.class, 2); lazy fetching
//        student s= session.find(student.class, 2); //eager fetching
//        tx.commit();
//        System.out.println(s);

        session.close();
        factory.close();
    }
}
