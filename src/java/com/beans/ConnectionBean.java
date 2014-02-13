/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adayfloridosantana
 */
public class ConnectionBean {
    
    private String dbURL;
    private String dbUser;
    private String dbPassword;
    
    //-------------------------> GETTER AND SETTERS

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = "jdbc:mysql://localhost:3307/noticias";
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = "root";
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = "root";
    }
    //----->Crea la conexion con la base de datos, los datos se inicializan en ConnectionServlet
    public Connection getConnection() {
    Connection conn = null;
    try { // load the database JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/noticias","root","root");
      }
    catch (SQLException e) {
      System.out.println("Could not connect to DB: " + e.getMessage());
      }
    return conn;
    }
    //---->Cierra la conexion con la base de datos
    public void closeConnection(Connection conn) {
    if (conn != null) {
      try { conn.close(); }
      catch (SQLException e) { }
      }
    }
    
    
}
