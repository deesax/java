package www.com.org;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
public class RegisterPage extends HttpServlet
{
	String page_HTML = "<!DOCTYPE html>"+
			"<html>"+
			"<head>"+
			    "<title> Servlet Page </title>"+
			"</head>"+
			"<body>"+

			    "<form action='RegisterPage' method='post'>"+
			    "<span> Username </span> <input type='text' name='txtUsername_RegisterPage'/>"+
			    "<span> Password </span> <input type='text' name='txtPassword_RegisterPage'/>"+
			    "<input type='submit' name ='btnRegister' value=' Register ' />"+
			    "</form>"+

			"</body>"+
			"</html>";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.getWriter().print(page_HTML);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		
		String username = req.getParameter("txtUsername_RegisterPage");
		String password = req.getParameter("txtPassword_RegisterPage");

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd", "root" , "root");

			Statement stat = con.createStatement();
			
			int some = stat.executeUpdate("INSERT INTO user VALUES('"+username+"','"+password+"')");
			resp.getWriter().print("Successfully Registered!");
			
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

	
	
}
