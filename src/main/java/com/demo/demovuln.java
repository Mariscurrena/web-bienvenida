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