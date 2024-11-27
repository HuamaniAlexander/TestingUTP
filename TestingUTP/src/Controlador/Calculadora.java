package Controlador;

import java.util.Scanner;

public class Calculadora {

    Scanner lector = new Scanner(System.in);

    
    public void dividir(double a, double b) throws Exception {
        try {
            System.out.println("Ingrese el numero 1");
            a = lector.nextDouble();
            System.out.println("Ingrese el numero 2");
            b = lector.nextDouble();
            double resultado = a / b;
            System.out.println(resultado);
        } catch (Exception ex) {
            throw new Exception("ERROR: División entre cero");
        } finally {
            System.out.println("Fin del método");
        }
    }
}
