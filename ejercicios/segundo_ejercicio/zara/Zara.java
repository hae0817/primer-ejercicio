package ejercicios.segundo_ejercicio.zara;

public class Zara {
    String talla; //S,M,L
    int nArticulos; //Nª de artículos disponibles

    public Zara(String talla, int nArticulos) {
        this.talla = talla;
        this.nArticulos = nArticulos;
    }

    public void mostrarInfo() {
        System.out.println("Talla: " + talla);
        System.out.println("Número de artículos disponibles: " + nArticulos);
    }

    public static void main(String[] args) {
        Camiseta camisetaA = new Camiseta("S", 28, "Corta");
        System.out.println("Información de la Camiseta:");
        camisetaA.mostrarInfo();

        System.out.println();
        Pantalon pantalonA = new Pantalon("L", 45, "Largo");
        System.out.println("Información del Pantalón:");
        pantalonA.mostrarInfo();
    }
}