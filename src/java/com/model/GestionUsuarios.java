/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import com.beans.Usuario;

/**
 *
 * @author adayfloridosantana
 */
public interface GestionUsuarios {
    public Usuario registroUsuario (String email,String password);
    public Boolean login (Usuario usuario);
    public void logout (Usuario usuario);
}
