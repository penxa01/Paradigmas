/*Genere un metodo exceptuados que debera generar un numero de listado con el numero de catastro para el caso de los inmuebles y la patente para los automotores */

import java.util.ArrayList;
import java.util.List;

public class Finanzas{
    List<Inmueble> inmuebles = new ArrayList<Inmueble>();
    List<Automotor> automotores = new ArrayList<Automotor>();

    public void exceptuados(){
        int i;
        int j;
        List<String> catastros = new ArrayList<>();
        List<String> patentes = new ArrayList<>();

        for(Inmueble inmueble:inmuebles){
            catastros.add(inmueble.getNroCatastro());
            System.out.println("Numero de catastro: "+ catastros.get(i));
        }

        for(Automotor auto:automotores){
            patentes.add(auto.getPatente());
            System.out.println("Patente: "+ patentes.get(j));
        }
    }
/*Metodo que muestra la cantidad de autos modelo 2023 */
    public void totalAutomotores(){
        int cant = 0;
        for (Automotor auto:automotores){
            if(auto.getModelo() == 2023){
                cant++;
            }
        }
        System.err.println("Hay "+cant+" autos que son modelo 2023");
    }
/*Muestra el numero de catastro de las propiedades que pagan un impuesto superior a 100000 */
    public void megaInmueble(){
        for(Inmueble inmueble:inmuebles){
            if(inmueble.impuesto()>100000){
                System.out.println("El inmueble "+inmueble.getNroCatastro()+"paga un impuesto mayor a 100.000");
            }
        }
    }
}


/*Ejercicio 2: */

/*Excepciones chequeadas*/
/*Cuando leemos un archivo o ingresamos un valor por teclado, podemos tener un error en algun tipo de los datos ingresados, en ese caso habria que considerar lanzar una excepcion de IO(entrada/salida) y habria que tener encuenta que al recibir la excepcion en este caso, se podria continuar la ejecucion, pidiendo al usuario que reingrese el valor solicitado. Y si estamos en caso de un archivo, se saltea ese campo y no se crea el objeto o variable*/

/*Excepciones no chequeadas*/
/*Cuando estamos recorriendo un arreglo y superamos el indice, debemos lanzar una excepcion de tipo IndexOut, esta excepcion es NO chequeada, por tanto el programa no puede continuar, lo unico que podemos hacer es mostrar el mensaje y avisar que el programa debe ser revisado por el desarrollador*/

/*Tener encuenta que el finally se usa generalmente para cerrar el uso de recursos. (Cerrar archivos, cerrar conexion de BDD)*/


