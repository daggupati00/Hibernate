package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class StoreData {

	public static void main(String[] args) {  
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory=meta.getSessionFactoryBuilder().build();	
Session sf=factory.openSession();
Transaction t=sf.beginTransaction();
//Employee emp=new Employee();
//emp.setName("Kishan");
//
//Contract e3=new Contract();  
//e3.setName("kumar");  
//e3.setPay_per_hour(2000);  
//e3.setContract_duration("20 hours");  
// 
//
//Regular e2=new Regular();  
//e2.setName("Kumar iyyar");  
//e2.setSal(100000);  
//e2.setBonus(1000);  
//
//sf.persist(emp);  
//sf.persist(e2);  
//sf.persist(e3);  
Query query=sf.createQuery("update Contract set pay_per_hour=n where contract_duration=b"); 
query.setParameter("n", 20f);
query.setParameter("b", 20);

int status=query.executeUpdate();
//List lst=query.list();
System.out.println(status);
//t.commit();  





sf.close();  
System.out.println("success"); 	
	}
}
