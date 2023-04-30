/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
 * @author Sara Mousselmal
 */
public class updatecoures extends HttpServlet {

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
            out.println("<title>Servlet updatecoures</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatecoures at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
                        
              Cours b=new  Cours();
              
              
            String IdCours = request.getParameter("IdCours");
            Integer a =  Integer.parseInt(IdCours);

      
            String CreditCours = request.getParameter("CreditCours");
            String CofficientCours = request.getParameter("CofficientCours");
            String NomCours = request.getParameter("NomCours");
            String NomProfesseur = request.getParameter("NomProfesseur");
            
            
            
            b = CoursFacade.find(a);
             CoursFacade.edit(b);      
                   out.println("IdCours :  "+b.getIdCours()); out.println("<br>"); 
                   out.println("CreditCours :  "+b.getCreditCours()); out.println("<br>"); 
                   out.println("CofficientCour :  "+b.getCofficientCours()); out.println("<br>"); 
                   out.println("NomCours :  "+b.getNomCours()); out.println("<br>"); 
                   out.println("NomProfesseur :  "+b.getNomProfesseur()); out.println("<br>"); 


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
