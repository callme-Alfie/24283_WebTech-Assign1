package com.studentAdmission;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdmissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve information from request parameters
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        String nationality = request.getParameter("nationality");
        String fatherName = request.getParameter("father-name");
        String motherName = request.getParameter("mother-name");
        String faculty = request.getParameter("faculty");
        String department = request.getParameter("department");
        String year = request.getParameter("year");
        
        // Generate a preview of entered information
        String preview = "<h3>Student Information Preview</h3>"
            + "<p>Full Name: " + name + "</p>"
            + "<p>Gender: " + gender + "</p>"
            + "<p>Email Address: " + email + "</p>"
            + "<p>Phone Number: " + contact + "</p>"
            + "<p>Place of Residence: " + address + "</p>"
            + "<p>Nationality: " + nationality + "</p>"
            + "<p>Father's Name: " + fatherName + "</p>"
            + "<p>Mother's Name: " + motherName + "</p>"
            + "<p>Faculty: " + faculty + "</p>"
            + "<p>Department: " + department + "</p>"
            + "<p>Year of Admission: " + year + "</p>";

        // Set response content type
        response.setContentType("text/html");

        // Write the preview content to the response
        PrintWriter out = response.getWriter();
        out.println(preview);
    }
}