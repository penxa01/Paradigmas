package com.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MiHilo extends Thread{
    String nroHilo;
    String rutaArchivo;
    ConjuntoPalabras datos;

    public MiHilo(String nro,String ruta,ConjuntoPalabras datos){
        this.nroHilo = nro;
        this.rutaArchivo = ruta;
        this.datos = datos;
    }

    public String limpiaSignos(String texto){
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", " ");
        return textoLimpio;
    }

    public String limpiarStopWords(String[] texto){
        String[] stopWords = {"a", "el", "la", "los", "las", "y", "o", "u", "de", "del", "al", "en", "con", "por", "para", "si", "no", "ni", "pero", "aunque", "sin", "sobre", "tras", "durante", "mientras", "cuando", "donde", "quien", "cual", "cuyo", "cuya", "cuyos", "cuyas", "que", "cual", "cuyas", "cuyos", "cuya", "cuyas", "cuyo", "cuyos"};
        Set<String> stopWordsSet = Arrays.stream(stopWords).collect(Collectors.toSet());

        String textoLimpio = Arrays.stream(texto)
            .filter(word -> !stopWordsSet.contains(word))
            .collect(Collectors.joining(" "));
        return textoLimpio;
    }
//Revisar
    @Override
    public void run(){
        String texto = "";
        try{
            texto = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(rutaArchivo)));
        }
        catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
        texto = limpiaSignos(texto);
        String[] listaTexto = texto.split(" ");
        listaTexto = limpiarStopWords(listaTexto).split(" ");

        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : listaTexto) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        // Crear un objeto Palabra para cada palabra y su frecuencia
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            
            Palabra nuevaPalabra = new Palabra(entrada.getKey(), entrada.getValue());
            datos.agregarPalabras(nuevaPalabra);
        }
    }
}
