package com.login;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logindao {
	public static boolean check(String uname, String pwd)
	{
		
		
			String user = "postgres";
			String password = "SRDS@2000s";
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String sql = "insert into login(uname, pass) values(?,?)";
			
			try {
				Class.forName("org.postgresql.Driver");
				Connection conn = DriverManager.getConnection(url, user, password);

				PreparedStatement st=conn.prepareStatement(sql);
				
				st.setString(1, uname);
				st.setString(2, pwd);
				
				ResultSet rs= st.executeQuery();
				if(!rs.next())
				{
					return false;
				}
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		return true;
		
	}

}
