package ejercicios.segundo_ejercicio.zara;

import PrendaInvalidaException;  // Importar la excepción personalizada

import java.util.ArrayList; // Importar la clase ArrayList


public class Zara {
    String talla; // S, M, L
    int nArticulos; // Nª de artículos disponibles

    // Constructor que recibe la talla y número de artículos
    public Zara(String talla, int nArticulos) throws PrendaInvalidaException {
        StringBuilder errores = new StringBuilder();  // StringBuilder acumula los errores: Si no se usa esto solo se devuelve el mensaje de la primera validación

        // Validación de la talla
        if (!talla.equals("S") && !talla.equals("M") && !talla.equals("L")) {
            errores.append("Talla inexistente. Indique S, M o L.\n");
        }
        
        // Validación de número de artículos
        if (nArticulos < 0) {
            errores.append("Debe ser un número positivo.\n");
        }

        // Si hay errores, lanzamos una excepción con todos los mensajes acumulados
        if (errores.length() > 0) {
            throw new PrendaInvalidaException(errores.toString());
        }

        // Si no hay errores, asignamos los valores
        this.talla = talla;
        this.nArticulos = nArticulos;
    }

    // Método para mostrar la información de la prenda
    public void mostrarInfo() {
        System.out.println("Talla: " + talla);
        System.out.println("Número de artículos disponibles: " + nArticulos);
    }

    // Método principal donde se prueba la excepción con array 
    public static void main(String[] args) {
        ArrayList<Zara> prendas = new ArrayList<>(); // Crear lista de prendas Zara
        try {
            // Crear un objeto con talla inválida y número de artículos negativo
            Zara camisetaA = new Zara("XS", -29);  // Esto lanzará la excepción
            prendas.add(camisetaA); // No se guarda
        } catch (PrendaInvalidaException e) {
            // Mensaje de error
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Crear objetos válidos
            Zara pantalonA = new Zara("S", 30);
            prendas.add(pantalonA); // Se mete en la lista
        } catch (PrendaInvalidaException e) {
            // Mensaje de error
            System.err.println("Error: " + e.getMessage());
        }

        try {
            Zara pantalonB = new Zara("M", 5);
            prendas.add(pantalonB); // Se mete en la lista
        } catch (PrendaInvalidaException e) {
            // Mensaje de error
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Crear objetos válidos
            Zara camisetaB = new Zara("L", 50);
            prendas.add(camisetaB); // Se mete en la lista
        } catch (PrendaInvalidaException e) {
            // Mensaje de error
            System.err.println("Error: " + e.getMessage());
        }

        // Información de cada objeto array
        System.out.println("Información de todas las prendas:");
        for (Zara prenda : prendas) {
            prenda.mostrarInfo();
        }

    }
}
