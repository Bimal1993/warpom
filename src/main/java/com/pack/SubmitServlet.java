/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class SubmitServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        out.print("<html>");
        out.print("<body>");
        out.print("<table border='1'>");
        out.print("<tr><th>Name</th>");
         out.print("<td>"+name+"</td></tr>");
        out.print("<tr><th>Password</th>");
        out.print("<td>"+pass+"</td></tr>");
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        
    }

}
