package Logica;

import javax.swing.JOptionPane;

public class Operaciones {

    public Operaciones() {
    }

    public int Suma(int a, int b) {
        return a + b;
    }

    public int Multiplicacion(int a, int b) {
        return a * b;
    }

    public int Division(int a, int b) {

        return a / b;

    }

    public int Factorial(int n) {

        int factorial = 1;
        while (n != 0) {
            if (n != 0) {
                factorial = factorial * n;
                n--;

            } 
        }
        return factorial;

    }

}
