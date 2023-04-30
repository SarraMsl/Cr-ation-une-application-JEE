/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import demo.Cours;
import demo.CoursFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class Addcoures extends HttpServlet {

    @EJB
    private CoursFacadeLocal CoursFacade;

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Addemp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Addemp at " + request.getContextPath() + "</h1>");
            String IdCours = request.getParameter("IdCours");
            String CreditCours = request.getParameter("CreditCours");
            String CofficientCours = request.getParameter("CofficientCours");
            String NomCours = request.getParameter("NomCours");
            String NomProfesseur = request.getParameter("NomProfesseur");

            Cours c = new Cours();  
             Integer Id = Integer.valueOf(IdCours);
             Integer Credit = Integer.valueOf(CreditCours);
             Integer Cofficient = Integer.valueOf(CofficientCours);

            c.setIdCours(Id);
            c.setNomCours(NomCours);
            c.setCofficientCours(Cofficient);
            c.setCreditCours(Credit);
            c.setNomProfesseur(NomProfesseur);

           CoursFacade.create(c);

            out.println("la valeur est  "+IdCours);   out.println("<br>");
            out.println("la valeur est  "+CreditCours); out.println("<br>"); 
            out.println("la valeur est  "+CofficientCours); out.println("<br>"); 
            out.println("la valeur est  "+NomProfesseur); out.println("<br>"); 
            out.println("la valeur est  "+NomCours);
            
            out.println("</body>");
            
            out.println("</html>");
        }
    }

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    // </editor-fold>

}
