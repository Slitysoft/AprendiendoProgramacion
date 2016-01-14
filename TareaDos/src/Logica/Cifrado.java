package Logica;

public class Cifrado {

    char[] datosIngresados;

    char letraCode;

    final int movimiento = 3;
    int letra;

    String datoCifrado;
    String datoDescifrado;

    public Cifrado() {

        datoCifrado = "";
        datoDescifrado = "";

    }

    public String CifrarDato(String contraseña) {

        
        datoCifrado = "";

        this.datosIngresados = contraseña.toCharArray();
        for (int i = 0; i < datosIngresados.length; i++) {

            letra = (datosIngresados[i]) + movimiento;
            letraCode = (char) (letra);
            this.datoCifrado = datoCifrado + letraCode;
        }
        return datoCifrado;

    }

    public String DescifrarDato(String cifrado) {
        
        datoDescifrado = "";
        
        this.datosIngresados = cifrado.toCharArray();
        for (int i = 0; i < datosIngresados.length; i++) {

            letra = (datosIngresados[i]) - movimiento;
            letraCode = (char) (letra);
            this.datoDescifrado = datoDescifrado + letraCode;
        }
        return datoDescifrado;

    }

}
