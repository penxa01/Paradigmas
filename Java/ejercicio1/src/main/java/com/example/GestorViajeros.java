package com.example;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GestorViajeros {
    private int cantidad;
    private ArrayList<ViajeroFrecuente> manejador;
    private Scanner scanner;

    public GestorViajeros(){
        this.cantidad = 0;
        this.manejador = new ArrayList<ViajeroFrecuente>();
        this.scanner = new Scanner(System.in);

    }
    public void Cargar () {
        String dni,nom,apellido;
        int num,millas;
        try{
        System.out.println("Ingrese el numero de viajero\n");
        num = scanner.nextInt();
        System.out.println("Ingrese DNI del viajero\n");
        dni = scanner.next();
        System.out.println("Ingrese nombre del viajero\n");
        nom = scanner.next();
        System.out.println("Ingrese Apellido del viajero\n");
        apellido = scanner.next();
        System.out.println("Ingrese el numero de millas acumuladas\n");
        millas = scanner.nextInt();
        ViajeroFrecuente viajero = new ViajeroFrecuente(num, dni, nom, apellido, millas);
        manejador.add(viajero);
        cantidad += 1;
        }
        catch(InputMismatchException e){
            System.out.println("Alguno de los datos ingresados fue erroneo, el viajero no fue cargado");
        }
        finally{
            System.out.println("Carga Finalizada");
        }
    }
    public void Mostrar(int numero){
        ViajeroFrecuente buscado;
        boolean band = false;
        int i = 0;
        while (band == false && i < cantidad) {
            if (manejador.get(i).getNumero() == numero){
                band = true;
                buscado = manejador.get(i);
                System.out.println("Viajero nro" + buscado.getNumero());
                System.out.println("Nombre: " + buscado.GetNombre());
                System.out.println("Apellido: "+ buscado.GetApellido());
                System.out.println("DNI: "+ buscado.getDni());
                System.out.println("Millas Disponibles: " + buscado.GetMillas());
            }
            else{i+=1;} 
            }
        }   
    public int ConsultarMillas (String dni){
        boolean band = false;
        int i = 0;
        int millas = -1;
        while (band == false && i< cantidad){
            if(manejador.get(i).getDni().equals(dni)){
                millas = manejador.get(i).GetMillas();
                band = true;
            }
            else{
                i +=1;
            }
        }
        return millas;
    }

    public void AcumulaMillas(String dni, int millas){
    boolean band=false;
    int i = 0;
        while (band == false && i < cantidad){
            if (manejador.get(i).getDni().equals(dni)){
                band = true;
                manejador.get(i).AcumulaMillas(millas);
                System.out.println("Millas Acumuladas con exito");
            }
            else{
                i+=1;
            }
        }
    }

    public void CanjearMillas(String dni, int millas){
        boolean band=false;
        int i = 0;
            while (band == false && i < cantidad){
                if (manejador.get(i).getDni().equals(dni)){
                    band = true;
                    if (manejador.get(i).GetMillas() >= millas){
                        manejador.get(i).CanjeaMillas(millas);
                        System.out.println("Millas Canjeadas con exito");
                        System.out.println("Millas disponibles: " + manejador.get(i).GetMillas());
                    }
                    else{System.out.println("Millas no disponibles");}
                    
                }
                else{
                    i+=1;
                }
            }
        }
    public void MejorViajero(){
        int i = 0;
        int j= 0;
        int mayorMillas = 0;

        while(i< cantidad){
            if(manejador.get(i).GetMillas()>= mayorMillas){
                mayorMillas = manejador.get(i).GetMillas();
                i++;
            }
            else{
                i++;
            }
        }
        while (j < cantidad){
            if (manejador.get(j).GetMillas() == mayorMillas){
            System.out.println(manejador.get(j));
            }
            j++;
        }
    }
}

