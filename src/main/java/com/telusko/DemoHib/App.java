package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    Alien al=new Alien();
    al.setAid(1);
    al.setAname("King");
    al.setColor("Red");
    Configuration con=new Configuration().configure();
    SessionFactory sf=con.buildSessionFactory();
    Session session=sf.openSession();
    session.save(al);
    }
}
