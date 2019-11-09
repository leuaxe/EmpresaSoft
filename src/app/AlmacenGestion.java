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

    public void OrdenarAlmacenPorValor(){
        Producto auxiliar = new Producto();
        for (int i = 0; i < almacen.length-1; i++) {
            for (int j = 0; j < almacen.length-i-1; j++) {
                if (almacen[j].getValor() > almacen[j+1].getValor()) {
                    auxiliar = almacen[j];
                    almacen[j] = almacen[j+1];
                    almacen[j+1] = auxiliar;
                }
            }
        }
    }

    public void OrdenarAlmacenPorPeso(){
        Producto auxiliar = new Producto();
        for (int i = 0; i < almacen.length-1; i++) {
            for (int j = 0; j < almacen.length-i-1; j++) {
                if (almacen[j].getPeso() > almacen[j+1].getPeso()) {
                    auxiliar = almacen[j];
                    almacen[j] = almacen[j+1];
                    almacen[j+1] = auxiliar;
                }
            }
        }
    }

    //busqueda de elementos desordenados
    public Producto BuscarProductoSec(String id){
        Producto p = new Producto;
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i].getID().compareTo(id) == 0) {
                p = almacen[i];
            }
        }

        return p;
    }

    //busqueda donde los productos estan ordenados
    public Producto BuscarProductoBinaria(String id){

    }

    public void imprimeListaProductos(){
        for (int i = 0; i < almacen.length-1; i++) {
            almacen[i].imprime();
        }
    }
}