package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.jsp.Connection.Hibernate;
import com.jsp.Entity.Employee;
import com.jsp.dao.EmpDao;
import com.jsp.dao.FetchDao;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		
		String Name=req.getParameter("name");
		String department=req.getParameter("department");
		String salary=req.getParameter("salary");
		
		String email=req.getParameter("E-mail");
		String password=req.getParameter("password");
		
		
		
		Employee emp=new Employee(Name, department, salary, email, password);
		
		System.out.println(emp);
		
		EmpDao dao=new EmpDao(Hibernate.getSessionFactory());
		
		boolean f=dao.SaveEmp(emp);
		HttpSession session=req.getSession();
		
		if(f)
		{
			session.setAttribute("msg", "Emp register Sucessfully");
			System.out.println("Emp register sucessfully");
		}
		else {
			session.setAttribute("msg ","something wrong on server");
			System.out.println("somethig wrong on server");
		}
		resp.sendRedirect("index.jsp");
		
//		---------------------------------------------------------fetch data---------------------------------------------------------------------
		
	FetchDao dao2=new FetchDao(Hibernate.getSessionFactory());
	
	
	
	

		


		}
	}
	
   
	

