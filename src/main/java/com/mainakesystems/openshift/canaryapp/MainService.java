package com.mainakesystems.openshift.canaryapp;

import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/canaryapp" })
public class MainService extends HttpServlet {
    
	private static final long serialVersionUID = 8532332299687592651L;

	@Override
    protected void doGet(final HttpServletRequest request, 
                         final HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("GET Output!");
        
        response.getWriter().println("Output GET - develop Branch!!! :D");  
        response.getWriter().flush();
    }

    @Override
    protected void doPost(final HttpServletRequest request, 
                          final HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("POST Output!");
        
        response.getWriter().println("Output POST - develop Branch!!! :D");
        response.getWriter().flush();
    }
}
