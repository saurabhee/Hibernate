package com.scp.Annotations;

import javax.sound.midi.Synthesizer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.classic.Session;

public class AnnotationMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HibernateAnnotations ha1=new HibernateAnnotations(10, "sauru1", "Good");
		HibernateAnnotations ha2=new HibernateAnnotations(20, "megha1", "Good");
		HibernateAnnotations ha3=new HibernateAnnotations(30, "niki1",  "Good");
		
		
		Configuration cf=new Configuration();
		SessionFactory sf=cf.configure().buildSessionFactory();
	    org.hibernate.Session s = sf.openSession();
	    Transaction tr=s.beginTransaction();
	    s.save(ha1);
	    s.save(ha2);
	    s.save(ha3);
	   
	  /* 
	   * 1.UPDATE AND MERGE
	   *  
	   *  
	   *  
	    HibernateAnnotations s1 = (HibernateAnnotations) s.get(HibernateAnnotations.class, 30);
	 // System.out.println(s1);
	 // s.close();
	  s1.setName("Vidya11");       // DB-vidya1 Detached object
	 
	    
	  tr.commit();
	   // s.flush();
	    s.close();
	    
	    
	   Session se1=sf.openSession(); 
	  Transaction tr1 = se1.beginTransaction();
	  HibernateAnnotations  s2=(HibernateAnnotations) se1.get(HibernateAnnotations.class, 30);
	  //System.out.println(s2);
	  s2.setName("Durga1");
	 // se1.evict(s2);
	  se1.merge(s1);
	 // se1.update(s1);
	  se1.flush();
	 tr1.commit();
	    */
	    
		
	    System.out.println(" Fetch object with Get");
	   Object ob1 = s.get(HibernateAnnotations.class, 10);
	   
	   System.out.println("Fetch objcet with load");
	  Object ob2 = s.load(HibernateAnnotations.class, 10);
	  
	  System.out.println(" witn get");
	  System.out.println(ob1);
	  
	  System.out.println("with load");
	  System.out.println(ob2);
	    
	    
	    
	    

	}

}
