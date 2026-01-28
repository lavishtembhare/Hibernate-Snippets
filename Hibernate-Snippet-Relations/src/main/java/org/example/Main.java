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
        Laptop l3=new Laptop();
        l3.setLid(3);
        l3.setBrand("Acer");
        l3.setModel("Aspire");
        l3.setRam(16);
        Coder c1=new Coder();
        c1.setCid(101);
        c1.setCname("Lavish");
        c1.setTech("java");
        c1.setLaptops(Arrays.asList(l1,l2));
        Coder c2=new Coder();
        c2.setCid(102);
        c2.setCname("Roy");
        c2.setTech("Python");
        c2.setLaptops(Arrays.asList(l2,l3));
        Coder c3=new Coder();
        c3.setCid(103);
        c3.setCname("Ron");
        c3.setTech("Node");
        c3.setLaptops(Arrays.asList(l1,l3));
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
