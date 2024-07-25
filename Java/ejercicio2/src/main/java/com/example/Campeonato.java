package com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Campeonato {
    public static final String SEPARADOR = ",";
	
    public static List<Deportista>leerArchivo(String nombreArchivo)throws IOException,excepcionDepo{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {
             // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR); 
                    if(campos[0].equals("")){
                        throw new excepcionDepo("Hay campos vacios");
                    }
                    else{
                    Deportista d = new Deportista(campos[0],campos[1]);
                    datos.add(d);
                    }      
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
         // Cierro el buffer de lectura
        if (bufferLectura != null) {
            bufferLectura.close();
        }
    }
        return datos;
    }
    public static List<Ideporte> crearEquipos (List<Deportista> inscriptos, int cantidad){
        Scanner sc = new Scanner(System.in);
        List<Ideporte> equipos = new ArrayList<Ideporte>();
        List<Deportista> equipito = new ArrayList<Deportista>();

        for(int i = 0;i< inscriptos.size(); i++){
            equipito.add(inscriptos.get(i));

            if (equipito.size() == cantidad){
                System.out.println("Ingrese nombre del equipo\n");
                String nombre = sc.nextLine();

                Equipo equip = new Equipo(nombre);
                equip.conformar(equipito);

                equipito = new ArrayList<Deportista>();
                equipos.add(equip);
            }
        
        }
    return equipos;
    }   

    public static List<Ideporte> crearParejas(List<Deportista> inscriptos){
        List<Ideporte> parejas = new ArrayList<Ideporte>();
        List<Deportista> pareja = new ArrayList<Deportista>();
        for (int i = 0;i<inscriptos.size();i++){
            pareja.add(inscriptos.get(i));
            if(pareja.size()==2){
                Pareja newPareja = new Pareja();
                newPareja.conformar(pareja);
                pareja = new ArrayList<Deportista>();
                parejas.add(newPareja);
            }
        }
        return parejas;
    }
    public static void numerar (List<Ideporte> eOp){
        for (int i = 0;i<eOp.size();i++){
            eOp.get(i).numerarDeportista();
        }
    }
    public static void mostrar (List<Ideporte> eOp){
        for (int i = 0;i<eOp.size();i++){
            eOp.get(i).mostrar();
        }
    }
}