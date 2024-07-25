package com.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Gestor {
    private List<Viajero> gestor;
    int cantidad;

    public Gestor(int cantidad){
        this.gestor = new ArrayList<Viajero>();
        this.cantidad = cantidad;
    }
    public void AgregarViajeros(Viajero viajeroNuevo){
        long cant=gestor.stream().count();
        if (cant < cantidad){
        gestor.add(viajeroNuevo);
        }
        else{
            throw new IndexOutOfBoundsException("La lista esta llena");
        }
    }
    public void mostrarPorMillas(){
        gestor.stream()
            .sorted(Comparator.comparing(Viajero::GetMillas))
            .forEach(System.out::println);
    }
    public void mas200M(){
        gestor.stream()
            .filter(v -> v.GetMillas()> 200)
            .forEach(System.out::println);
    }
    public Viajero obtenerViajeroMasMillas(){
        Viajero masMillas =gestor.stream().max(Comparator.comparing(Viajero::GetMillas)).get();
        return masMillas;
    }
}
