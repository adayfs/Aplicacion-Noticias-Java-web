/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import com.beans.ConnectionBean;
import com.beans.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author adayfloridosantana
 */
public class GestionUsuariosImpl implements GestionUsuarios {

    @Override
    public Usuario registroUsuario(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean login(Usuario usuario) {
        Boolean loginCorrecto=null;
        ConnectionBean conexion=new ConnectionBean();
        Connection conn=conexion.getConnection();
        String user=usuario.getEmail();
        String pass=usuario.getPassword();
        String sqlQuery="SELECT usuario,clave FROM usuarios WHERE usuario='"+user+"' AND clave='"+pass+"'";
        try {
        Statement s = conn.createStatement();
        try {
          ResultSet rs = s.executeQuery(sqlQuery);
          try {
           if (rs.isBeforeFirst()) {
            System.out.println("si data"); 
            loginCorrecto=true;
             }else{
              System.out.println("No data"); 
              loginCorrecto=false;
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
        return loginCorrecto;
    }

    @Override
    public void logout(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
