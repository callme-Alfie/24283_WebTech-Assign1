package com.numberConverter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConvertNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters from request
        String numberStr = request.getParameter("number");
        String conversionType = "";
        
        // Determine the conversion type
        if (request.getParameter("binary") != null) {
            conversionType = "binary";
        } else if (request.getParameter("hexadecimal") != null) {
            conversionType = "hexadecimal";
        } else if (request.getParameter("octal") != null) {
            conversionType = "octal";
        }
        
        // Perform conversion
        int number = Integer.parseInt(numberStr);
        String result = "";
        switch(conversionType) {
            case "binary":
                result = Integer.toBinaryString(number);
                break;
            case "hexadecimal":
                result = Integer.toHexString(number);
                break;
            case "octal":
                result = Integer.toOctalString(number);
                break;
            default:
                result = "Invalid conversion type";
        }
        
        // Send result as response
        response.setContentType("text/plain");
        response.getWriter().write(result);
    }
}
