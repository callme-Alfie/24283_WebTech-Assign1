package com.studentAdmission;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve username and password from request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Perform authentication
        boolean isAuthenticated = "admin".equals(username) && "password".equals(password);
        
        // Send response based on authentication result
        if (isAuthenticated) {
            response.getWriter().write("Authentication successful");
        } else {
            response.getWriter().write("Authentication failed");
        }
    }
}