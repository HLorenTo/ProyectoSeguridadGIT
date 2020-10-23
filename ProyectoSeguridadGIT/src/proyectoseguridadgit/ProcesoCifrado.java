/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoseguridadgit;

/**
 *
 * @author Usuario
 */
public class ProcesoCifrado {
    package cifradogr;
// castellanos
/**
 *
 * @author loren
 */
public class ProcesoCifrado {
        char[] mensaje;
	char[] clave;
	char[] resultado; //cifrado
	char matriz[][];
     
	public ProcesoCifrado(String msg,int clave)
	{
                String claveaux = Integer.toString(clave);
		this.mensaje = msg.toCharArray();
                char[] claveTemp = this.clave = claveaux.toCharArray();
                this.clave = new char[mensaje.length];
		int cont =0;
		for(int i=0;i<mensaje.length;i++)//
		{
			this.clave[i]=claveTemp[cont];
			cont++;
			if(cont==claveTemp.length)
				cont=0;
		}
                Tablagr tabla = new Tablagr();
                char matrizGenerada[][]= tabla.generarMatrizABC();
		this.matriz = matrizGenerada;
		cifrar(); 
	}

   

	public String cifrar() 
	{
            char[] cifrado = new char[mensaje.length];
		int i;
		int j;
		for(int cont=0;cont<mensaje.length;cont++)
		{
			j=(int)this.mensaje[cont]-65;
                        i=((int)this.clave[cont]-48)+1;
			cifrado[cont]=this.matriz[i][j];
		}

		this.resultado = cifrado;
		String string = new String(cifrado); 
                return string; 
	}
        
        public String descifrar()
	{
            char[] descifrado = new char[mensaje.length];
		int i;
		int j;
                int b = 0;
                int posicion = 0;
                int numerosPrimos[]={0,2,3,5,7,11,13,17,19,23,2};
		for(int cont=0;cont<mensaje.length;cont++)
		{
                        i=((int)this.clave[cont]-48)+1;
                        posicion=numerosPrimos[i];
                        j=(int)this.mensaje[cont]-65;
                        j=j-posicion;
                        if(j<0){
                         j=j+26;
                        }
                        
			descifrado[cont]=this.matriz[0][j];
		}

		this.resultado = descifrado;
		String string = new String(descifrado); 
                return string; 
	}
        
 
    
}
}
