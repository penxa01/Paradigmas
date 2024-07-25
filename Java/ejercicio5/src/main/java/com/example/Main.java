package com.example;

public class Main {
    public static void main(String[] args) {
        //haz un main que genere dos hilos que lean dos archivos de texto y cuenten la cantidad de veces que aparece cada palabra en cada archivo.
        ConjuntoPalabras datos = new ConjuntoPalabras();
        
        MiHilo hilo1 = new MiHilo("1","D:\\Facultad\\3er Año\\1 er semestre\\Paradigma del lenguaje\\Java\\ejercicio5\\src\\main\\java\\com\\example\\Archivos Ejercicio 5-20240605\\texto1.txt",datos);
        MiHilo hilo2 = new MiHilo("2","D:\\Facultad\\3er Año\\1 er semestre\\Paradigma del lenguaje\\Java\\ejercicio5\\src\\main\\java\\com\\example\\Archivos Ejercicio 5-20240605\\texto2.txt",datos);

        hilo1.start();
        hilo2.start();

        try{
            hilo1.join();
            hilo2.join();
        }
        catch(InterruptedException e){
            System.out.println("Error al esperar a los hilos");
        }

        datos.mostrar();

        


    }
}