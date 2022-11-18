/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import java.sql.*;
import bd.Conexion;
import java.util.ArrayList;

public class registroArchivo {

    public boolean añadirFoto (foto fo) {
        try {
            Connection conexion=Conexion.getConexion();
            String query="INSERT INTO foto(nro_foto,"
                    + "formato, relacion_aspecto,"
                    + "descripcion)"
                    + "VALUES(?,?,?,?)";

            PreparedStatement ins= conexion.prepareStatement(query);
            ins.setInt(1, fo.getNroFoto());
            ins.setString(2, fo.getFormato());
            ins.setString(3, fo.getRelacionAspecto());
            ins.setString(4, fo.getDescripcion());

            if(ins.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al añadir "
                    + e.getMessage());
        }
        return false;
    }

    public boolean eliminarFoto(int nro){
        try {
            Connection conexion=Conexion.getConexion();
            String query="DELETE FROM Foto "
                    + "WHERE nro_foto=?";
            PreparedStatement del= 
                    conexion.prepareStatement(query);
            del.setInt(1, nro);
            if(del.executeUpdate()>0){
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Error al eliminar "
                + e.getMessage());
        }
        return false;
    }

    public foto buscarPorNumero(int nro){
        foto fo = null;
        try {
            Connection conexion=Conexion.getConexion();
            String query="SELECT * FROM foto WHERE nro_foto=?";
            PreparedStatement bus=conexion.prepareStatement(query);
            bus.setInt(1, nro);
            ResultSet rs = bus.executeQuery();
            if(rs.next()){
                fo = new foto();
                fo.setNroFoto(rs.getInt("nro_foto"));
                fo.setFormato(rs.getString("formato"));
                fo.setRelacionAspecto(rs.getString("relacion_aspecto"));
                fo.setDescripcion(rs.getString("descripcion"));           
            }            
        } catch (Exception e) {
            System.out.println("Error al buscar " + e.getMessage());
        }        
        return fo;
    }

    public boolean modificarFoto(foto fo){
        try {
            Connection conexion=Conexion.getConexion();
            String query="UPDATE foto SET nro_foto=?,"
                    + "formato=?,relacion_aspecto=?,"
                    + "descripcion=?";
            PreparedStatement mod=conexion.prepareStatement(query);
            mod.setInt(1, fo.getNroFoto());
            mod.setString(2, fo.getFormato());
            mod.setString(3, fo.getRelacionAspecto());
            mod.setString(4, fo.getDescripcion());
            if(mod.executeUpdate()>0){
                return true;
            }                        
        } catch (Exception e) {
            System.out.println("Error al modificar "+e.getMessage());
        }
        return false;
    }
}

