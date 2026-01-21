package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setsName("John");
        s.setRollno(105);
        s.setsAge(27);

        Configuration cfg = new Configuration();
        cfg.configure(); // loads hibernate.cfg.xml
        cfg.addAnnotatedClass(Student.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(s);
        tx.commit();

        session.close();
        sf.close();

        System.out.println(s);
    }
}
