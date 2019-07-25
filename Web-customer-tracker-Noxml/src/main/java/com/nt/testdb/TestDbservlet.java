

package com.nt.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class TestDbservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		
	// set up connection  varibles
		 String username="root";
		 String password="root";
		 
		 String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		 
		String driver="com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out=response.getWriter();
			out.println("Connnection to the database"+jdbcUrl);
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(jdbcUrl,username,password);
			out.print("Connection Success");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
			
			
		}
		 
		 
	}
	

}
