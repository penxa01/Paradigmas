package com.example;
import java.util.ArrayList;

public class ConjuntoPalabras{
    ArrayList<Palabra> texto ;

    public ConjuntoPalabras(){
        this.texto = new ArrayList<Palabra>();
    }

    public void agregarPalabras(Palabra nuevap){
        texto.add(nuevap);
    }

    public Palabra palabraBuscada(String palabraBuscada){
        Palabra palabraEncontrad = null;
        boolean band = false;
        int i = 0;
        while(band == false && i < texto.size()){
            if(texto.get(i).getPalabra().equals(palabraBuscada)){
                band = true;
                palabraEncontrad = texto.get(i);
            }
            i++;
        }
        return palabraEncontrad;
    }

    public void mostrar(){
        System.out.println("Palabras y Frecuencias");
        texto.stream().forEach(System.out :: println);
    }

    public void incrementa(Palabra p){
        for(Palabra palabra: texto){
            if(palabra.getPalabra().equals(p.getPalabra())){
                palabra.setCantidadVeces(palabra.getCantidadVeces() + 1);
            }
        }
    }

}

