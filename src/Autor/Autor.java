/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autor;

import Conexion.Conexion;
import org.omg.CORBA.ORB;

/**
 *
 * import java.sql.*;
 *import javax.swing.JOptionPane;
 *import org.omg.CORBA.ORB;
 *import Conexion.Conexion;
 */
public class Autor extends AutorApp.AutorPOA {
    
    
    private ORB orb;
    Conexion conectar = new Conexion();

    @Override
    public boolean insertarPersona(String au_autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(int au_idautor, String au_autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int au_idautor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
