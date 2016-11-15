package www.com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.fabric.Response;

public class LoginPage extends HttpServlet
{
	String page_HTML = "<!DOCTYPE html>"+
			"<html>"+
			"<head>"+
			    "<title> Servlet Page </title>"+
			"</head>"+
			"<body>"+

			    "<form action='LoginPage' method='post'>"+
			    "<span> Username </span> <input type='text' name='txtUsername'/>"+
			    "<span> Password </span> <input type='text' name='txtPassword'/>"+
			    "<input type='submit' name ='btnSubmit' value=' SUBMIT ' />"+
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
		
		PrintWriter pwr = resp.getWriter();
		String s1 = req.getParameter("txtUsername");
		String s2 = req.getParameter("txtPassword");
		Cookie ck1 = new Cookie("n" , s1);
		resp.addCookie(ck1);
		Cookie ck2 = new Cookie("p", s2);
		resp.addCookie(ck2);
		
		boolean flag = false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iacsd", "root", "root");
			String qry = "select * from user";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			
			
			
			while(rs.next())
			{
				if(rs.getString(1).equals(s1) && rs.getString(2).equals(s2))
				{
					
					pwr.print("Welcome!");
					Cookie ck3[] = req.getCookies();
					
					pwr.print(ck3[0].getValue()+"  "+ck3[1].getValue());
					
					pwr.print("<html>"+
                                 "<head>"

                                 +"</head>"
                            +"<body>"
                           +"<form action='Logout'>"
                           +"<input type='submit' name='btn' value='LOGOUT' />"
                           +"</form>"

                           +"</body>"
                           +"</html>");
					
					
					flag=true;
				}
				
				
			}
			if(flag==false)
			{
				pwr.print("Sorry,You are Invalid User!!");
				req.getRequestDispatcher("HomePage.html").include(req, resp);
				
			}
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				

	}
	

}
