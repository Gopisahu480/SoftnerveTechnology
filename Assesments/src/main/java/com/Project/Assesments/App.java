package com.Project.Assesments;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    		Patient p=new Patient();
    	    p.setPatientId(1);
    		p.setName("ramesh");
    		p.setPatientContactNumber("+91999000232");
    		
    		
    		Session ss=new Configuration().configure().buildSessionFactory().openSession();
    		Query qr=ss.createQuery(" from Patient ");
    		List ls=qr.list();
    		for(Object obj:ls)
    		{
    			Patient p1=(Patient)obj;
    			System.out.println("Patientname :"+p1.getPatientId());
    			System.out.println("Patientid :"+p1.getName());
    			System.out.println("PatientContactNo :"+p1.getPatientContactNumber());
    		}
    		Transaction tr=ss.beginTransaction();
    		ss.save(p);
    		tr.commit();
    		ss.close();
    	}
    }

