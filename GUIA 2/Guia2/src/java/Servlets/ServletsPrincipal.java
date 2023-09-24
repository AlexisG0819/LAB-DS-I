/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexis
 */
@WebServlet(name = "ServletsPrincipal", urlPatterns = {"/ServletsPrincipal"})
public class ServletsPrincipal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String origen = request.getParameter("origen");
            String destino = request.getParameter("destino");
            String fecha = request.getParameter("fecha");
            String clase = request.getParameter("clase");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Confirmación de Reserva</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: skyblue ; margin: 0; padding: 0; text-align: center; }");
            out.println("h1 { color: black; }");
            out.println("p { font-family: Arial, sans-serif;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Confirmación de Reserva</h1>");
            out.println("<p>Gracias por reservar tu vuelo :D</p>");
            out.println("<p>Los detalles son los siguientes: </p>");
            out.println("<p>Nombre: " + nombre + " " + apellido + "</p>");
            out.println("<p>Origen: " + origen + "</p>");
            out.println("<p>Destino: " + destino + "</p>");
            out.println("<p>Fecha de Viaje: " + fecha + "</p>");
            out.println("<p>Clase: " + clase + "</p>");
            out.println("<p>Gracias por preferirnos </p>");
            out.println("<p>:D</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
