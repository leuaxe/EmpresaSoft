package app;

import java.text.DecimalFormat;

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

    public boolean isAsignado() {
        return asignado;
    }

    public void imprime(){
        //para imprimir valores solo con 2 decimales
        //entre los parentesis pongo el formato que nuestren los decimales
        DecimalFormat decimales = new DecimalFormat("00.00"); 

        System.out.println("Id: "+ this.ID + ", valor: " + decimales.format(this.valor) +
         ", peso: " + this.peso + ", asignado: " + this.asignado + ", clase: " + this.clase);
    }
}