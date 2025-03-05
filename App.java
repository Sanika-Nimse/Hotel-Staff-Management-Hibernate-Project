package com.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration configuration = new Configuration();
         configuration.configure("hibernate.cfg.xml");
         // Create session factory
         SessionFactory factory = configuration.buildSessionFactory();
         Session session = factory.openSession();
         Transaction t1= session.beginTransaction();
         Scanner sc= new Scanner(System.in);
       int opt =0;
       
         do {
           System.out.println("1. Manager");
           System.out.println("2. Staff");
           System.out.println("3. Chef");
           System.out.println("4. Show All ");
           System.out.println("5. Exit");
           System.out.println("Enter your Option");
            opt =sc.nextInt();
           switch(opt) {  

         case 1: System.out.println("Enter the Hotel Manager Id and name");
             int id=sc.nextInt();
             String name =sc.next();
             HotelManager l1=new HotelManager(id,name);
             session.save(l1);
             t1.commit();
             break;
           case 2:
             System.out.println("Enter the Hotel Staff ID and Name Duration & Shift ");
             id=sc.nextInt();
             name=sc.next();
             String duration=sc.next();
             String shift=sc.next();
             HotelStaff t2=new HotelStaff(id,name,shift,duration);
             session.save(t2);
             t1.commit();
             break;
             
           case 3: System.out.println("Enter the Hotel Chef ID and Name, Specialization and Rating  ");
           id=sc.nextInt();
           name=sc.next();
           String specialization=sc.next();
           int rating =sc.nextInt();
           HotelChef n1 = new HotelChef(id,name,specialization,rating);
           session.save(n1);
           t1.commit();
           break;
           case 4: 
           Query query= session.createQuery("From hotel");
           List emplist = query.list();
           Iterator i1= emplist.iterator();
           while(i1.hasNext()) {
             System.out.println(i1.next());
           }
           break;
           case 5:
           break;
           }
         }
         while(opt!=5);
    }
}
