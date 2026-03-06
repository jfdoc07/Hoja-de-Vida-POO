/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Logica;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
@WebServlet(name = "HojadeVidaServlet", urlPatterns = {"/HojadeVidaServlet"})
public class HojadeVidaServlet extends HttpServlet {

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

        String nombre = request.getParameter("nombre");//Almaceno en un string lo obtenido en el formulario que se almacena con el name "nombre".
        String profesion = request.getParameter("profesion");
        String correo = request.getParameter("correo");
        String numeroTelefono = request.getParameter("telefono");//request.getParameter obtiene un string. Es necesario parsearlo primero.
        String tipoDocumento = request.getParameter("tipodocumento");
        String numeroCedula = request.getParameter("cedula");
        String perfilProfesional = request.getParameter("perfilprofesional");
        String experienciaLaboral = request.getParameter("experiencialaboral");
        String formacionAcademica = request.getParameter("formacionacademica");
        String aptitudes = request.getParameter("aptitudes");
        String refPersonal = request.getParameter("referenciaspersonales");
        String refProfesional = request.getParameter("referenciasprofesionales");
        String idiomas = request.getParameter("idiomas");

        Persona p = new Persona(nombre, profesion, correo, numeroTelefono, tipoDocumento, numeroCedula);//Creo el objeto y le paso al constructor lo obtenido del formulario.
        Profesional prof = new Profesional(perfilProfesional, experienciaLaboral, formacionAcademica, aptitudes);
        Referencia ref = new Referencia(refProfesional, refPersonal);
        Idiomas idioma = new Idiomas(idiomas);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css/stylecv.css\"/>");
            out.println("<title>Hoja de vida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h2 class='nombre'>" + p.getNombre() + "</h2>");
            out.println("<h3 class='profesion'>" + p.getProfesion() + "</h3>");
            out.println("<h4 class='cedula'>" + p.getTipoDocumento() + " " + p.getNumeroDocumento() + "</h4>");
            out.println("<h4 class='correo'>" + p.getCorreo() + "</h4>");
            out.println("<h4 class='correo'>" + p.getNumeroTelefono() + "</h4>");
            out.println("</header>");
            out.println("<main>");
            out.println("<hr>");
            out.println("<h3>Perfil profesional</h3>");
            out.println("<hr>");
            out.println("<p class='perfilprofesional'>" + prof.getPerfilProfesional() + "</p>");

            out.println("<h3>Experiencia laboral</h3>");
            out.println("<hr>");
            out.println("<p class='experiencialaboral'>" + prof.getExperienciaLaboral() + "</p>");

            out.println("<h3>Formación académica</h3>");
            out.println("<hr>");
            out.println("<p class='formacionacademica'>" + prof.getFormacionAcademica() + "</p>");

            out.println("<h3>Aptitudes</h3>");
            out.println("<hr>");
            out.println("<p class='aptitudes'>" + prof.getAptitudes() + "</p>");

            out.println("<h3>Referencias personales</h3>");
            out.println("<hr>");
            out.println("<p class='refpersonales'>" + ref.getReferenciaPersonal() + "</p>");

            out.println("<h3>Referencias profesionales</h3>");
            out.println("<hr>");
            out.println("<p class='refprofesionales'>" + ref.getReferenciaProfesional() + "</p>");

            out.println("<h3>Idiomas</h3>");
            out.println("<hr>");
            out.println("<p class='idiomas'>" + idioma.getIdioma() + "</p>");
            out.println("<hr>");
            out.println("</main>");
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
