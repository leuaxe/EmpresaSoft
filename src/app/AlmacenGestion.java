package app;

public class AlmacenGestion {
    private Producto[] almacen;

    public AlmacenGestion(){

    }

    public AlmacenGestion(Producto[] almacen){
        this.almacen = almacen;
    }

    public Producto[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Producto[] almacen) {
        this.almacen = almacen;
    }
}