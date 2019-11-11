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
}