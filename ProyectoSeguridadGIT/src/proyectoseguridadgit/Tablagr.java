/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoseguridadgit;


public class Tablagr {
    char matriz[][];
    // sebastian robayo
        
        private char[] generarAbecedario()
	{
		char[] abc = new char[26];
		for(int i= 65; i<= 90;i++)
		{
			abc[i-65]=(char)i;
		}
		return abc;
	}
        	
        
        public char[][] generarMatrizABC()
	{
		int contador;
		char abcTemp[] = this.generarAbecedario();
		char abc[] = new char[abcTemp.length*2];//52
                      
		for(int c=0;c<26;c++) {
			abc[c]=abcTemp[c];
			abc[c+26]=abcTemp[c];
		}
		char[][] matriz = new char[11][26];
                int numerosPrimos[]={0,2,3,5,7,11,13,17,19,23,2};
                for(int i=0;i<11;i++)
		{
                        int c = numerosPrimos[i];
                	contador=0;
                        
			for(int j=0;j<26;j++)
			{
                            matriz[i][j]=abc[contador+c];
                            //System.out.print(matriz[i][j]);
                            contador++;                            
                                
			}
                        System.out.println();
                        
		}
		return matriz;
	}
                
	
}