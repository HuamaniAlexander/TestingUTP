package Controlador;

public class Cliente {

    private String DNI;

    public void setDNI(String DNI) throws Exception {
        if (esDNIValido(DNI)) {
            this.DNI = DNI;
        } else {
            throw new Exception("DNI no es válido");
        }
    }

    private boolean esDNIValido(String DNI) {
        return DNI.matches("\\d{8}");
    }
}

