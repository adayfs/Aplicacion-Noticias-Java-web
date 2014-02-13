/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

import com.beans.Noticia;
import java.util.ArrayList;

/**
 *
 * @author adayfloridosantana
 */
public interface GestorNoticias {
    
    public void addNoticia (Noticia noticia);
    public ArrayList <Noticia> showNoticias();
    public ArrayList <Noticia> showSeccionNoticias(int id);
    public void removeNoticia (int id);
    public void editNoticia (int id);
    public Noticia showNoticia (int id);   
}
