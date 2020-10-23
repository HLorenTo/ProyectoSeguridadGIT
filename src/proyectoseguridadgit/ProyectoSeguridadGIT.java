package ProyectoSeguridadGIT;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class ProyectoSeguridadGIT {

    public static void main(String[] args) {
String usuario;
        String mensaje;
        int clave;
        String encriptar;
        String desencriptar;
        
        while (true) {            
                int menu = Integer.parseInt(JOptionPane.showInputDialog("Buen día, que desea realizar \n 1. Cifrar un mensaje  \n 2. Descifrar un mensaje  \n 3. Salir"));
                if (menu==1){
                usuario = JOptionPane.showInputDialog("Ingrese su usuario");
                mensaje = JOptionPane.showInputDialog("Ingrese su mensaje");
                mensaje=mensaje.toUpperCase();
                clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su clave"));
                ProcesoCifrado procesoCifrado;
                procesoCifrado= new ProcesoCifrado (mensaje,clave);
                encriptar = procesoCifrado.cifrar();
                JOptionPane.showMessageDialog(null, "El mensaje ha sido cifrado en: " + encriptar);
                Bitacora bitacora = new Bitacora ();
                bitacora.enviarBitacora(usuario, mensaje, clave, encriptar);
            }
            else if (menu==2){   
                usuario = JOptionPane.showInputDialog("Ingrese su usuario");
                mensaje = JOptionPane.showInputDialog("Ingrese su mensaje a descifrar");
                mensaje=mensaje.toUpperCase();
                clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su clave"));
                ProcesoCifrado descifrado;
                descifrado= new ProcesoCifrado (mensaje,clave);
                desencriptar = descifrado.descifrar();
                JOptionPane.showMessageDialog(null, "El mensaje ha sido cifrado en: " + desencriptar);
                Bitacora bitacora = new Bitacora ();
                bitacora.enviarBitacora(usuario, mensaje, clave, desencriptar);
        }
        else if (menu==3){
            break;
        }
        else {
            JOptionPane.showMessageDialog(null, "Opcion invalida, Vuelva a intentarlo");
        }
    }
    }
}
    
    
    

