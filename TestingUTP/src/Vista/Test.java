package Vista;

import Controlador.Calculadora;
import Controlador.Cliente;

public class Test { 
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        try {
            calculadora.dividir(16,0); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("");
        }
        
        Cliente cliente = new Cliente();
        try {
            cliente.setDNI("1673450x");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("El programa terminó");
        }

}
