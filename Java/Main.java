import java.util.Arrays;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private double salario;
    private String ciudad;
    private int anioNacimiento;

    public Persona(String nombre, int edad, double salario, String ciudad, int anioNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.ciudad = ciudad;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", ciudad='" + ciudad + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
            new Persona("Juan", 28, 3000.0, "Madrid", 1995),
            new Persona("Maria", 35, 4000.0, "Barcelona", 1988),
            new Persona("Pedro", 22, 1500.0, "Valencia", 2001),
            new Persona("Ana", 30, 3500.0, "Madrid", 1993),
            new Persona("Luis", 25, 2000.0, "Sevilla", 1998)
        );
        
        /*2-Mostrar los nombres de las personas que viven en "Madrid".*/
        personas.stream()
            .filter(p -> p.getCiudad()
            .equals("Madrid"))
            .forEach(persona::getNombre);
        /*3-Obtener una lista con los nombres de todas las personas.*/
        List<String> nombres = personas.stream()
            .map(persona::getNombre)
            .toList();
        /*4-Calcular el salario promedio de las personas nacidas después de 1990.*/
        personas.stream()
            .filter(p -> p.getAnioNacimiento() < 1990)
            .map(persona::getSalario)
            .average();
        /*5-Obtener una lista de las personas cuyo nombre empieza con la letra 'M', ordenadas por año de nacimiento.*/
        personas.stream()
            .filter(x->x.getNombre().startsWith('M'))
            .sorted(Comparator.comparing(persona::getFechaNac))
            .toList();
        // Convertir todos los nombres de la lista de personas a minúsculas y recogerlos en una nueva lista.
        personas.stream()
            .map(p -> p.getNombre().toLowerCase())
            .toList();
        // Obtener el máximo salario presente en la lista de personas.
        persona.stream()
            .mapToInt(persona::getSalario)
            .max()
            .ifPresent(System.out::println);
        // Crear una lista de los salarios de las personas, eliminando los duplicados.
        persona.stream()
            .map(persona::getSalario)
            .distinct()
            .toList();
    }
}

