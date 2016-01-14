package Logica;

import java.util.StringTokenizer;

public class pruebas {

    static String entrada = "Nombre: Dohmdqgur, Pais: Iudqfld, Genero: Pdvfxolqr, Contraseña: 45678. Nombre: Wrôr, Pais: Hvwdgrv#Xqlgrv , Genero: Pdvfxolqr , Contraseña: krod456 .Nombre: Dohmdqgur, Pais: Iudqfld, Genero: Pdvfxolqr, Contraseña: 45678. Nombre: Wrôr, Pais: Hvwdgrv#Xqlgrv , Genero: Pdvfxolqr , Contraseña: krod456 .";

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer(entrada, " :,.");
        String cadena;

        while (st.hasMoreTokens()) {
            Cifrado uno = new Cifrado();
            String tituloNombre = st.nextToken();
            String nombre = uno.DescifrarDato(st.nextToken());
            String tituloPais = st.nextToken();
            String pais = uno.DescifrarDato(st.nextToken());
            String tituloGenero = st.nextToken();
            String genero = uno.DescifrarDato(st.nextToken());
            String tituloContraseña = st.nextToken();
            String contraseña = uno.DescifrarDato(st.nextToken());
            cadena = tituloNombre + ": " + nombre + " " + tituloPais + ": " + pais + " " + tituloGenero + ": " + genero;
            System.out.println(cadena);
        }

    }

}
