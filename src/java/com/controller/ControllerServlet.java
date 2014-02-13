/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.beans.Noticia;
import com.beans.Usuario;
import com.model.GestionUsuariosImpl;
import com.model.GestorNoticiaImpl;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author adayfloridosantana
 */
public class ControllerServlet extends HttpServlet {

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
        
    //---------------------------------------------------------------------------------------------------------------------------------
    //Mostrar todas las noticias
//        GestorNoticiaImpl gni=new GestorNoticiaImpl();
//        ArrayList noticias=gni.mostrarNoticias();
//                
//        request.setAttribute("noticias", noticias);
//        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
   //---------------------------------------------------------------------------------------------------------------------------------
        String action=request.getParameter("action");
        String ruta=null;
        if(action.equals("muestra")){
            int idSeccion=Integer.parseInt(request.getParameter("idSeccion"));
            System.out.println("1--->"+request.getParameter("idSeccion"));
            ruta="/jsp/index.jsp";
            GestorNoticiaImpl gni= new GestorNoticiaImpl();
            ArrayList noticias;
            noticias=gni.showSeccionNoticias(idSeccion);
            request.setAttribute("noticias", noticias);
        }
        else if(action.equals("publica")){
            int idNoticia=Integer.parseInt(request.getParameter("idNoticia"));
            System.out.println("2--->"+request.getParameter("idNoticia"));
            ruta="/jsp/noticia.jsp";
            GestorNoticiaImpl gni= new GestorNoticiaImpl();
            Noticia noticia=gni.showNoticia(idNoticia);
            request.setAttribute("noticia", noticia);
        }else if (action.equals("login")){
            GestionUsuariosImpl check= new GestionUsuariosImpl();
            Usuario user=new Usuario();
            user.setEmail(request.getParameter("e-mail"));
            user.setPassword(request.getParameter("password"));
            request.setAttribute("user", user);
            if(check.login(user)){
            ruta="/jsp/admin.jsp";
            }else {
            ruta="/jsp/index.jsp";
            }
        }
       getServletContext().getRequestDispatcher(ruta).include(request, response);

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
