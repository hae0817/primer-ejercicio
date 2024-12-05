package ejercicios.segundo_ejercicio.zara;

public class PrendaInvalidaException extends Exception {
    // Constructor que recibe el mensaje de error
    public PrendaInvalidaException(String mensaje) {
        super(mensaje);  // Pasa el mensaje al constructor de la clase Exception
    }
}