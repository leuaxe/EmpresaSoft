package app;

public class TiendaSegundaMano{
    private String nombre;
    private Producto[] stock;

    public TiendaSegundaMano(String nombre, Producto[] stock){
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
        System.out.println("---------------Lista de productos de la tienda segunda mano -------------------");
        double beneficio = 0.0;
        for (int i = 0; i < stock.length-1; i++) {
            stock[i].imprime();
            beneficio += stock[i].getValor(); //suma el total del valor de los productos
        }
        System.out.println("El beneficio de la tienda del segunda mano es: " + beneficio);
        System.out.println("--------------------------------------------------");
    }

    public void aplicarDescuento(){
        for (int i = 0; i < stock.length-1; i++){
            if (stock[i].getClase().compareTo("B") == 0) {
                //aplica un descuento de 25% a los de clase B
                stock[i].setValor(stock[i].getValor()*0.75);
            }

            if (stock[i].getClase().compareTo("C") == 0) {
                //aplica un descuento de 50% a los de clase C
                stock[i].setValor(stock[i].getValor()*0.50);
            }
        }
    }
}