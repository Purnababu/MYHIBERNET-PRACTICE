package com.hibernet.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       Student ss= new Student();
       ss.setName("babu");
       ss.setPhno(7777777);
       ss.setCountryname("america");
       
       Configuration con =new Configuration();
       con.configure();
       SessionFactory sf =con.buildSessionFactory();
       Session se=sf.openSession();
       Transaction tr =se.beginTransaction();
       se.save(ss);
       tr.commit();
      
       
       
       
    }
}
