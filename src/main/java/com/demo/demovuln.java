/*package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

public class DemoVulnerable extends HttpServlet {

    // RCE vuln
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
        
        // ❌ Unsanitazed
        String filename = request.getParameter("filename"); 
        
        if (filename != null) {
            // ❌ Vuln
            String command = "cat " + filename; 
            
            try {
                // ❌ Execution dynamic input
                Process process = Runtime.getRuntime().exec(command); 
                
                response.getWriter().println("Comando ejecutado: " + command);
                
            } catch (IOException e) {
                response.getWriter().println("Error al ejecutar el comando: " + e.getMessage());
            }
        }
    }
}**/


/// FIX
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoSeguro extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
        
        String filename = request.getParameter("filename"); 
        
        if (filename != null) {
            
            if (!filename.matches("^[a-zA-Z0-9_\\-\\.]+$")) {
                 response.getWriter().println("Error: Invalid Name.");
                 return; 
            }
            
            try {
                // FIX: Send command and args as separate elements of an array (Correcto)
                String[] commandArray = new String[]{"cat", filename};
                Process process = Runtime.getRuntime().exec(commandArray); 
                response.getWriter().println("Succeded.");
                
            } catch (IOException e) {
                response.getWriter().println("Error: " + e.getMessage());
            }
        }
    }
}
