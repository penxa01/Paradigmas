package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op=0;
        int millas;
        String dni;
        boolean bandera = true;
        GestorViajeros manejador = new GestorViajeros();
        Scanner sc = new Scanner(System.in);

        while (bandera == true){
            System.out.println("[1] Para Cargar un Viajero");
            System.out.println("[2] Mostrar Viajero");
            System.out.println("[3] Consultar Cantidad de Millas");
            System.out.println("[4] Acumular Millas");
            System.out.println("[5] Canjear Millas");
            System.out.println("[6] Mostrar Mejor Viajero");
            System.out.println("[0] Para salir");
            System.out.println("Ingrese opcion deseada\n");
            op = sc.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Saliendo de programa");
                    bandera = false;
                break;

                case 1:
                    manejador.Cargar();
                break;
                
                case 2:
                    System.out.println("Ingrese numero del viajero que desea\n");
                    int num = sc.nextInt();
                    manejador.Mostrar(num);
                break;
                
                case 3:
                    System.out.println("Ingrese DNI del viajero que desea\n");
                    dni = sc.next();
                    millas = manejador.ConsultarMillas(dni);
                    if (millas == -1){
                        System.out.println("El viajero no se encontro");
                    }
                    else{
                        System.out.println("Millas acumuladas del viajero" + dni);
                        System.out.println(millas);
                    }
                break;
                
                case 4:
                    System.out.println("Ingrese DNI del viajero\n");
                    dni = sc.next();
                    System.out.println("Ingrese millas que desea acumular\n");
                    millas = sc.nextInt();
                    manejador.AcumulaMillas(dni,millas);
                break;

                case 5:
                    System.out.println("Ingrese DNI del viajero\n");
                    dni = sc.next();
                    System.out.println("Ingrese millas que desea canjear\n");
                    millas = sc.nextInt();
                    manejador.CanjearMillas(dni,millas);
                break;

                case 6:
                    manejador.MejorViajero();
                break;

                default:
                    break;
            }
        }
        
        




    }
}