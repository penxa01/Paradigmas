package com.example;

public class ViajeroFrecuente {
    private int numero;
    private String dni;
    private String nombre;
    private String apellido;
    private int millas;

    public ViajeroFrecuente (int numero, String dni, String nombre, String apellido, int millas){
        this.numero=numero;
        this.dni = dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.millas = millas;
    }

    public void SetNumero (int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void SetDni (String dni){
        this.dni = dni;
    }

    public String getDni(){
        return this.dni;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetNombre (){
        return this.nombre;
    }
    public void SetApellido(String apellido){
        this.apellido = apellido;
    }

    public String GetApellido (){
        return this.apellido;
    }

    public void SetMillas(int millas){
        this.millas = millas;
    }
    public int GetMillas(){
        return this.millas;

    }
    public int AcumulaMillas(int millas){
        this.millas +=millas;
        return this.millas; 
    }
    public int CanjeaMillas (int millas){
        if (this.millas <= millas) {
            this.millas -= millas;
        }
        else{
            System.out.println("No posee suficientes millas");
        }
        return this.millas;
    }
    public String toString(){
        return "ViajeroFrecuente: \nNombre:" + nombre +"\nApellido:" +apellido +"\nDNI:" + dni + "\nNumero: " + numero+ "\nMillas: "+ millas;
    }
}

