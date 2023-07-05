package com.jsp.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.Entity.Employee;

public class FetchDao {
	
	private SessionFactory sessionFactory;

	public FetchDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public boolean FetchEmp(Employee employ)
	{
		boolean f=false;
		
		Session session=sessionFactory.openSession();
		
		
		String hql="select e from  Employee e where e.name=?1  ";
		Query<Employee> query=session.createQuery("hql");

		query.setParameter(1, "ravi");
		List<Employee> employees=query.getResultList();
		
		if(employees.size()>0) {
			f=true;
		for(Employee em :employees)
		{
			System.out.println("id:" +em.getId());
			System.out.println("name:" +em.getName());
			System.out.println("department:" +em.getDepartment());
			System.out.println("salary:" +em.getSalary());
			System.out.println("email" +em.getEmail());
		
			
		}
		
		}
		
		
		
		
	
		session.close();
		return f;
	}
		
		
	}



