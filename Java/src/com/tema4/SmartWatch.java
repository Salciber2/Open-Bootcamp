package com.tema4;

public class SmartWatch extends SmartDevice{

    double largoMalla1;
    double largoMalla2;
    String unidadLargoMalla;
    String materialMalla;

    public SmartWatch(){}

    public SmartWatch(String marca, String modelo, int bateria, String unidadBateria, double tamañoPantalla, double largoMalla1,
            double largoMalla2, String unidadLargoMalla, String materialMalla) {
        super(marca, modelo, bateria, unidadBateria, tamañoPantalla);
        this.largoMalla1 = largoMalla1;
        this.largoMalla2 = largoMalla2;
        this.unidadLargoMalla = unidadLargoMalla;
        this.materialMalla = materialMalla;
    }
}
