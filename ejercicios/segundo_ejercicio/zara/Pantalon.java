package ejercicios.segundo_ejercicio.zara;

public class Pantalon extends Zara {
    String largo; //corto o largo

    public Pantalon(String talla, int nArticulos, String largo) {
        super(talla, nArticulos);
        this.largo = largo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo de artículo: Pantalón");
        System.out.println("Largo del pantalón: " + largo);
        System.out.println("Talla: " + talla);
        System.out.println("Número de artículos disponibles en tienda: " + nArticulos);
    }
}
