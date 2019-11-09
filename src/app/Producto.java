package app;

public class Producto{
    private String ID;
    private double valor;
    private double peso;
    private boolean asignado;
    private String clase;

    public Producto(){}

    public Producto(String ID, double valor, double peso, boolean asignado, String clase) {
        this.ID = ID;
        this.valor = valor;
        this.peso = peso;
        this.asignado = asignado;
        this.clase = clase;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public boolean getAsignado(){
        return this.asignado;
    }

    public void imprime(){
        System.out.println("Id: "+ this.ID + ", valor: " + this.valor +
         ", peso: " + this.peso + ", asignado: " + this.asignado + ", clase: " + this.clase);
    }
}