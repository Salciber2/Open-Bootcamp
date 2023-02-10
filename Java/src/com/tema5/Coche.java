package com.tema5;

public class Coche {

    String modelo;

    public Coche(){}

    public Coche(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche modelo: " + modelo;
    }    
}
