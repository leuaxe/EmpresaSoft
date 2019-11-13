package app;

import java.util.ArrayList;

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
        Producto p = new Producto();
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i].getID().compareTo(id) == 0) {
                p = almacen[i];
            }
        }

        return p;
    }

    //busqueda donde los productos estan ordenados y se encuentra la mitad
    //del arreglo y se ve si el valor buscado esta a la izq o der
    public Producto BuscarProductoBinaria(String id){
        int inf = 0;
        int sup = almacen.length - 1;
        boolean encontrado = false;
        while ((encontrado == false) && (sup >= inf)) {
            int centro = (inf+sup)/2;
            if (almacen[centro].getID() == id) {
                encontrado = true;
                return almacen[centro];
            } else if(id.compareTo(almacen[centro].getID()) > 0){
                inf = centro + 1;
            } else{
                sup = centro - 1;
            }
        }

        return null;
    }

    //metodo que devuelve un arreglo con todos los productos de clase "A"
    //se para como parametro la cantidad que queremos de stock
    public Producto[] prepararPedidoTC(int n){
        //primero hay que forzar la ordenacion del almacen
        this.OrdenarAlmacenPorValor();

        ArrayList<Producto> lstock = new ArrayList<Producto>();
        int i = almacen.length-1; //cantidad de productos en el almacen
        int disponible = 0; //guarda la cantidad de productos encontrados de clase "a"

        while((i >= 0) && (disponible < n )){
            if (almacen[i].getClase().compareTo("A") == 0) {
                lstock.add(almacen[i]);
                //cambiamos el valor del atributo "asignado" de producto encontrado
                almacen[i].setAsignado(true);
                disponible++;
            }
            i--;
        }

        //convertimos el ArrayList a un arreglo porque eso devuelve el metodo
        Producto[] resultado = new Producto[lstock.size()]; //size es el length de los arraylist
        lstock.toArray(resultado);

        return resultado;
    }

    //arreglo de productos que seran enviados a la tienda de segunda mano
    public Producto[] prepararPedidoSM(int n){
        //primero hay que forzar la ordenacion del almacen
        this.OrdenarAlmacenPorValor();

        ArrayList<Producto> lstock = new ArrayList<Producto>();
        int i = almacen.length-1;
        int disponible = 0; 

        while((i >= 0) && (disponible < n )){
            //se busca los productos que atributo "asignacion" es false
            if (almacen[i].isAsignado() == false) {
                lstock.add(almacen[i]);
                //cambiamos el valor del atributo "asignado" de producto encontrado
                almacen[i].setAsignado(true);
                disponible++;
            }
            i--;
        }

        //convertimos el ArrayList a un arreglo porque eso devuelve el metodo
        Producto[] resultado = new Producto[lstock.size()]; //size es el length de los arraylist
        lstock.toArray(resultado);

        return resultado;
    }

    public void imprimeListaProductos(){
        for (int i = 0; i < almacen.length; i++) {
            almacen[i].imprime();
        }
    }
}