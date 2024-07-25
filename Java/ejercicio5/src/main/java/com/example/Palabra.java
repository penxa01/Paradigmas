package com.example;

public class Palabra {
    String palabra;
    int cantidadVeces;

    public Palabra (String palabra,int cant){
        this.palabra = palabra;
        this.cantidadVeces = cant;
    }
    // setters y getters
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public int getCantidadVeces() {
        return cantidadVeces;
    }
    public void setCantidadVeces(int cantidadVeces) {
        this.cantidadVeces = cantidadVeces;
    }

    @Override
    public String toString(){
        return ("Palabra: "+ palabra +"| Cantidad:" +cantidadVeces);
    }
}
