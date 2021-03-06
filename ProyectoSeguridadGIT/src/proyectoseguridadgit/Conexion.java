/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoseguridadgit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    
    private Connection connection = null;
    
    public void conectar() {
       try {
            System.out.println("Generando conexión a Postgresql");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/electiva", "postgres", "123456");  
            Class.forName("org.postgresql.Driver");  
            System.out.println("Conexión generada exitosamente");
        } catch(SQLException ex) {
            System.err.println("No se pudo generar la conexión: " + ex.getMessage());
        } catch(ClassNotFoundException ex) {
            System.err.println("No encotro el Driver: " + ex.getMessage());
        } catch(Exception ex) {
            System.err.println("Exception general: " + ex.getMessage());
        }
    }
    public void desconectar() {        
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada exitosamente");
            } else {
                 System.out.println("No existe ninguna conexión por cerrar");
            } 
        } catch(SQLException ex) {
            System.err.println("No se pudo cerrar la conexión: " + ex.getMessage());
        } catch(Exception ex) {
            System.err.println("Exception general: " + ex.getMessage());
        }
    }
    
    public Connection getConnetion() {
        return connection;
    }
    
    
}
