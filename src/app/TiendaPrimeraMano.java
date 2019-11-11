package app;

public class TiendaPrimeraMano{
    private String nombre;
    private Producto[] stock;

    public TiendaPrimeraMano(String nombre, Producto[] stock){
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Producto[] getStock() {
        return stock;
    }

    public void setStock(Producto[] stock) {
        this.stock = stock;
    }

    public void imprimeEstadisticas(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------Lista de productos de la tienda central -------------------");
        double beneficio = 0.0;
        for (int i = 0; i < stock.length-1; i++) {
            stock[i].imprime();
            beneficio += stock[i].getValor(); //suma el total del valor de los productos
        }
        System.out.println("El beneficio de la tienda del centro es: " + beneficio);
        System.out.println("--------------------------------------------------");
    }
}