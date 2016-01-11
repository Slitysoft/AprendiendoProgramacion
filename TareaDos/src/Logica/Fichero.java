/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fichero {

    private String linea;

    public void EscribirFichero(String Texto) {
        File fichero = new File("fichero.txt");

        try{
            PrintWriter Pw = new PrintWriter(new FileWriter(fichero, true));

            Pw.println(Texto);

            Pw.close();

			// Escribimos linea a linea en el fichero
        } catch (Exception ex) {
            //System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }

    }

    
        public String LeerFichero(){
    String textoCompleto = "";

                 // Fichero del que queremos leer
		File fichero = new File("fichero.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero

			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				 linea = s.nextLine(); 	// Guardamos la linea en un String
                                textoCompleto = textoCompleto + linea;
                                
			//	System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
    
                return textoCompleto;
    }
    
}
