package com;
import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
/*
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@WebServlet("/Controller")
public class Controller extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		System.out.println("Inside Controller Servlet");
		try
		{
			Bean b=new Bean();
			if (req.getParameter("Marshal") != null)
			{
				System.out.println("Marshalling invoked");
				b.Mar();
			}
			if (req.getParameter("Unmarshal") != null)
			{
				System.out.println("Unmarshalling invoked");
				b.UnMar();
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
