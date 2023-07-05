package com.jsp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.Entity.Employee;

public class EmpDao {
	
	private SessionFactory sessionFactory;

	public EmpDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public boolean SaveEmp(Employee emplo)
	{
		boolean f=false;
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		int i=(Integer)session.save(emplo);
		
		if(i>0)
		{
			f=true;
		}
		tx.commit();
		session.close();
		return f;
	}
	
	
	

}
