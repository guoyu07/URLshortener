package com.cpsc476.urlshortner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wrox.LoginServlet;


@WebServlet(
        name = "HomePageServlet",
        urlPatterns = {"/home"},
        loadOnStartup = 1
)

public class HomePageServlet extends HttpServlet{

	  @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException
	    {
	        HttpSession session = request.getSession();
	       
	        request.getRequestDispatcher("/WEB-INF/jsp/view/home.jsp")
	               .forward(request, response);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException
	    {
	        
	    }

}
