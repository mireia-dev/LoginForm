/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
@WebServlet(urlPatterns = {"/Bienvenida"})
public class Bienvenida extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response, String nom)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Bienvenida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido</h1>"+nom);
            out.println("</body>");
            out.println("</html>");
        }
    }

}
