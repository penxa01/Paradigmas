package com.example;

public class Deportista {
    String nombre;
    String dni;
    int nroJugador;

    public Deportista(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.nroJugador = 0;
    }
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Nro. Jugador: " + nroJugador;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public void setNroJugador(int nroJugador) {
        this.nroJugador = nroJugador;        
    }
    public int getNroJugador() {
        return nroJugador;
    }

}
