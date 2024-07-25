package com.example;
import java.util.List;

public class Equipo implements Ideporte {
    private String nombre;
    private List<Deportista> equipo;

    public Equipo (String nombre){
        this.nombre = nombre;    
    }

    @Override
    public boolean conformar(List<Deportista> integrantes){
        boolean bandera = false;
        try{
            if (integrantes.size() == 5){
            equipo = integrantes;
            bandera = true;
            }
            else{
                System.out.println("La cantidad de integrantes no es la adecuada");
            }
        }
        catch (Exception e){
            System.out.println("Algo ocurrio mal conformando el equipo");
        }
    finally{}
        return bandera;
    }
    @Override
    public void numerarDeportista(){
        for (int i = 0; i<equipo.size();i++){
            equipo.get(i).setNroJugador(i+1);
        }
    }
    @Override
    public void mostrar(){
        System.out.println("Integrantes de equipo "+ nombre);
        for (int i = 0; i<equipo.size();i++){
            System.out.println(equipo.get(i));
        }
        System.out.println("------------------------");
    }
}


