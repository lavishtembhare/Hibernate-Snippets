package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        Student s = new Student();
//        Student s2=null;
//        s.setsName("Johnny");
//        s.setRollno(106);
//        s.setsAge(21);

        Coder code=new Coder();
        code.setCid(101);
        code.setCname("Lavish");
        code.setTech("Java");
//        Configuration cfg = new Configuration();
//        cfg.configure(); // loads hibernate.cfg.xml
//        cfg.addAnnotatedClass(Student.class);

//        SessionFactory sf = cfg.buildSessionFactory();
        SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Coder.class).configure().buildSessionFactory();
        Session session = sf.openSession();

//        s2=session.find(Student.class,103);

        Transaction tx = session.beginTransaction();

//        session.persist(s);
        tx.commit();

        session.close();
        sf.close();
    }
}
