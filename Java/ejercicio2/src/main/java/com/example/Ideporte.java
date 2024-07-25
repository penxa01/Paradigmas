package com.example;
import java.util.List;

public interface Ideporte {
    int cantidad_minima = 2;

    boolean conformar(List<Deportista> integrantes);
    void mostrar();
    void numerarDeportista();

} 