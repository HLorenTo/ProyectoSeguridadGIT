/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoseguridadgit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Bitacora {
    public void enviarBitacora(String usuario, String mensaje, int clave, String encriptado) {
    Connection connection;
    Conexion con = new Conexion();
    con.conectar();
    connection = con.getConnetion();
    
    try{
            //int x = 5 / 0;
             Statement stm = connection.createStatement();
             stm.executeUpdate("insert into public.bitacora2(fecha, usuario, mensaje, clave, resultado) "
                     + "values((select now()), '" + usuario+ "', '" + mensaje + "', '" + clave + "', '" + encriptado + "')");
             JOptionPane.showMessageDialog(null,"Inserción exitosa.");
        } catch(Exception ex) {
              ex.printStackTrace();
              System.out.println("Error en sql: " + ex.getMessage());
        } finally {
            con.desconectar();
        }        
    }
}
