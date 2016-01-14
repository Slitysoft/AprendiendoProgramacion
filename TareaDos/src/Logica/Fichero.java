package Logica;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fichero {

    private String linea;
    String hola = "hola";

    public Fichero() {

    }

    public void EscribirFichero(String Texto) {
        File fichero = new File("fichero.txt");

        try {
            PrintWriter Pw = new PrintWriter(new FileWriter(fichero, true));

            Pw.println(Texto);

            Pw.close();

            // Escribimos linea a linea en el fichero
        } catch (Exception ex) {
            //System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }

    }

    public String LeerFichero() {

        String cadena = "";
        Scanner s = null;
        StringTokenizer st = null;
        Cifrado mostrar = null;

        try {
            st = new StringTokenizer("fichero.txt", " :,.");

            while (st.hasMoreTokens()) {

                Cifrado descifrar = new Cifrado();

                String tituloNombre = st.nextToken();
                String nombre = descifrar.DescifrarDato(st.nextToken());
                String tituloPais = st.nextToken();
                String pais = descifrar.DescifrarDato(st.nextToken());
                String tituloGenero = st.nextToken();
                String genero = descifrar.DescifrarDato(st.nextToken());
                String tituloContraseña = st.nextToken();
                String contraseña = descifrar.DescifrarDato(st.nextToken());
                cadena = tituloNombre + ": " + nombre + " " + tituloPais + ": " + pais + " " + tituloGenero + ": " + genero;
                System.out.println(cadena);

            }
            this.hola = cadena;
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

        return hola;
    }
}
