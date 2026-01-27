package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//        Laptop l1=new Laptop();
//        l1.setLid(1);
//        l1.setBrand("Asus");
//        l1.setModel("Rog");
//        l1.setRam(16);
//        Coder c=new Coder();
//        c.setCid(101);
//        c.setCname("Lavish");
//        c.setTech("java");
//        c.setLaptop(l1);
//        SessionFactory sf=new Configuration().configure().addAnnotatedClass(org.example.Laptop.class).addAnnotatedClass(org.example.Coder.class).buildSessionFactory();
//        Session s=sf.openSession();
//        Transaction t=s.beginTransaction();
//        s.persist(l1);
//        s.persist(c);
//        t.commit();
//        Coder c2=s.find(Coder.class,101);
//        System.out.println(c2);
//        s.close();
//        sf.close();
//    }  OnetoOne

    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);
        Laptop l2=new Laptop();
        l2.setLid(2);
        l2.setBrand("Asus");
        l2.setModel("vivobook");
        l2.setRam(16);
        Coder c=new Coder();
        c.setCid(101);
        c.setCname("Lavish");
        c.setTech("java");
        c.setLaptops(Arrays.asList(l1,l2));
        SessionFactory sf=new Configuration().configure().addAnnotatedClass(org.example.Laptop.class).addAnnotatedClass(org.example.Coder.class).buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        s.persist(l1);
        s.persist(c);
        t.commit();
        Coder c2=s.find(Coder.class,101);
        System.out.println(c2);
        s.close();
        sf.close();
    }
}
