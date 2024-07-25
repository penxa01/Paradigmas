package com.example;

import java.util.List;

public class Pareja implements Ideporte{
    Deportista deportista1;
    Deportista deportista2;

    public Pareja() {
    }
    @Override
    public void mostrar(){
        System.out.println("Pareja para ping-pong");
        System.out.println(deportista1);
        System.out.println(deportista2);
    }
    @Override
    public boolean conformar(List<Deportista> pareja){
        boolean bandera = false;
        try{
            if(pareja.size() == cantidad_minima){
                deportista1 = pareja.get(0);
                deportista2 = pareja.get(1);
                bandera = true;
            }
            else{
                System.out.println("La cantidad de integrantes no es adecuada");
            }
        }
        catch (Exception e1){
            System.out.println("Algo ocurrio al conformar la pareja");
        }
        finally{}
        return bandera;
    }
    @Override
    public void numerarDeportista(){
        deportista1.setNroJugador(1);
        deportista2.setNroJugador(2);
    }
}
