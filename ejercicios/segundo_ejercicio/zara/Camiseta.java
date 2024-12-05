package ejercicios.segundo_ejercicio.zara;

public class Camiseta extends Zara {
    String tipoManga; //corta o larga

    public Camiseta(String talla, int nArticulos, String tipoManga) {
        super(talla, nArticulos);
        this.tipoManga = tipoManga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tipo de artículo: Camiseta");
        System.out.println("Manga de la camiseta: " + tipoManga);
        System.out.println("Talla: " + talla);
        System.out.println("Número de artículos disponibles en tienda: " + nArticulos);
    }
}