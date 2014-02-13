/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import com.beans.ConnectionBean;
import com.beans.Noticia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adayfloridosantana
 */
public class GestorNoticiaImpl implements GestorNoticias {

    @Override
    public void addNoticia(Noticia noticia) {
        
        
    }

    @Override
    /*
     * Realiza una consulta que devuelve todas las noticias
     */
    public ArrayList<Noticia> showNoticias() {
        ArrayList noticias=new ArrayList();
        ConnectionBean conexion=new ConnectionBean();
        Connection conn=conexion.getConnection();
        String sqlQuery="Select * from agenda";
        try {
        Statement s = conn.createStatement();
        try {
          ResultSet rs = s.executeQuery(sqlQuery);
          try {
            while (rs.next()) {
              Noticia noticia = new Noticia();
              noticia.setId(rs.getInt("id"));
              noticia.setSeccion(rs.getInt("seccion"));
              noticia.setCabecera(rs.getString("cabecera"));
              noticia.setTexto(rs.getString("texto"));
              noticia.setFecha(rs.getString("fecha"));
              noticia.setFoto(rs.getString("foto"));
              noticias.add(noticia);
              }
            }
          finally { rs.close(); }
          }
        finally { s.close(); }
        }
      catch (SQLException e) {
        }
      finally {
        conexion.closeConnection(conn);
        }
       return noticias;
      }

    @Override
    public void removeNoticia(int id) {
       
    }

    @Override
    public void editNoticia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Noticia showNoticia(int id) {
        Noticia noticia = new Noticia();
        ConnectionBean conexion=new ConnectionBean();
        Connection conn=conexion.getConnection();
        String sqlQuery="Select * from agenda where id="+id;
        try {
        Statement s = conn.createStatement();
        try {
          ResultSet rs = s.executeQuery(sqlQuery);
          try {
            while (rs.next()) {
              noticia.setId(rs.getInt("id"));
              noticia.setSeccion(rs.getInt("seccion"));
              noticia.setCabecera(rs.getString("cabecera"));
              noticia.setTexto(rs.getString("texto"));
              noticia.setFecha(rs.getString("fecha"));
              noticia.setFoto(rs.getString("foto"));
              }
            }
          finally { rs.close(); }
          }
        finally { s.close(); }
        }
      catch (SQLException e) {
        }
      finally {
        conexion.closeConnection(conn);
        }
       return noticia; 
      }

    @Override
   /*
    *   Realiza una consulta que devuelve todos las noticias de la seccion; 
    */
    public ArrayList<Noticia> showSeccionNoticias(int id) {
        ArrayList seccionNoticias=new ArrayList();
        ConnectionBean conexion=new ConnectionBean();
        Connection conn=conexion.getConnection();
        String sqlQuery="Select * from agenda where seccion="+id;
        try {
        Statement s = conn.createStatement();
        try {
          ResultSet rs = s.executeQuery(sqlQuery);
          try {
            while (rs.next()) {
              Noticia noticia = new Noticia();
              noticia.setId(rs.getInt("id"));
              noticia.setSeccion(rs.getInt("seccion"));
              noticia.setCabecera(rs.getString("cabecera"));
              noticia.setTexto(rs.getString("texto"));
              noticia.setFecha(rs.getString("fecha"));
              noticia.setFoto(rs.getString("foto"));
              seccionNoticias.add(noticia);
              }
            }
          finally { rs.close(); }
          }
        finally { s.close(); }
        }
      catch (SQLException e) {
        }
      finally {
        conexion.closeConnection(conn);
        }
       return seccionNoticias;    
    }
    }
    

