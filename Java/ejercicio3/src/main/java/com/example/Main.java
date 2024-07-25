package com.example;

public class Main {
    public static void main(String[] args) {
        //teniendo encuenta el el resto de archivos, quiero que construyas un main en la cual puedas probar el funcionamiento de la clase Gestor
        // y de la clase Viajero
        // para ello crea un objeto de la clase Gestor y añadele 5 objetos de la clase Viajero
        // luego muestra por pantalla los objetos ordenados por millas
        // luego muestra por pantalla el objeto con mas millas
        // muestra por pantalla los objetos que tengan mas de 200 millas

        Gestor gestor = new Gestor(5);
        Viajero viajero1 = new Viajero(1, "12345678A", "Juan", "Perez", 100);
        Viajero viajero2 = new Viajero(2, "12345678B", "Pedro", "Gomez", 200);
        Viajero viajero3 = new Viajero(3, "12345678C", "Maria", "Lopez", 300);
        Viajero viajero4 = new Viajero(4, "12345678D", "Ana", "Garcia", 400);
        Viajero viajero5 = new Viajero(5, "12345678E", "Luis", "Martinez", 500);

        gestor.AgregarViajeros(viajero1);
        gestor.AgregarViajeros(viajero2);
        gestor.AgregarViajeros(viajero3);
        gestor.AgregarViajeros(viajero4);
        gestor.AgregarViajeros(viajero5);

        System.out.println("Los viajeros ordenados por millas son: ");
        gestor.mostrarPorMillas();

        System.out.println("El viajero con mas millas es: ");
        System.out.println(gestor.obtenerViajeroMasMillas());

        System.out.println("Los viajeros con mas de 200 millas son: ");
        gestor.mas200M();

    }
}