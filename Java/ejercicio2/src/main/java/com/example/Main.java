package com.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException,excepcionDepo {
        int cantidadJugadoresFutbol= 5;                  
    
        List<Deportista> datosFutbol= Campeonato.leerArchivo("D:\\Facultad\\3er Año\\1 er semestre\\Paradigma del lenguaje\\Java\\ejercicio2\\src\\datos\\inscriptosFutbol.csv");
        List<Deportista> datosPinPon= Campeonato.leerArchivo("D:\\Facultad\\3er Año\\1 er semestre\\Paradigma del lenguaje\\Java\\ejercicio2\\src\\datos\\inscriptosPinPon.csv");

        List<Ideporte> futbol = Campeonato.crearEquipos(datosFutbol,cantidadJugadoresFutbol);
        List<Ideporte> pingPong = Campeonato.crearParejas(datosPinPon);

        Campeonato.numerar(futbol);
        Campeonato.numerar(pingPong);

        Campeonato.mostrar(futbol);
        Campeonato.mostrar(pingPong);

    }  
}