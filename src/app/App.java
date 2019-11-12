package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        Producto[] lp = GeneradorProductos.generarProductos(10);
        AlmacenGestion ag = new AlmacenGestion(lp);
        
        Producto[] s1 = ag.prepararPedidoTC(3);
        Producto[] s2 = ag.prepararPedidoSM(3);

        TiendaPrimeraMano t1 = new TiendaPrimeraMano("EmpresaSoftPlanet", s1);
        TiendaSegundaMano t2 = new TiendaSegundaMano("EmpresaSoftExpresss", s2);

        ag.imprimeListaProductos();
        t1.imprimeEstadisticas();
        t2.imprimeEstadisticas();
    }
}