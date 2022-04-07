package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= (String) request.getParameter("uname");
		String pass= (String) request.getParameter("password");
		
			String user = "postgres";
			String password = "SRDS@2000s";
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String sql = "insert into login(uname, pass) values(?,?)";
			
			try {
				Class.forName("org.postgresql.Driver");
				Connection conn = DriverManager.getConnection(url, user, password);

				PreparedStatement st=conn.prepareStatement(sql);
				
				st.setString(1, uname);
				st.setString(2, pass);
				
				st.executeUpdate();
				
				PrintWriter out=response.getWriter();
				out.println("<h2> <center> Registered Successfully</center></h2>");
			
				

				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
			
		
	}

}
