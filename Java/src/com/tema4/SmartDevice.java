package com.tema4;

public class SmartDevice {

    String marca;
    String modelo;
    int bateria;
    String unidadBateria;
    double tamañoPantalla;

    public SmartDevice(){}

    public SmartDevice(String marca, String modelo, int bateria, String unidadBateria, double tamañoPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.unidadBateria = unidadBateria;
        this.tamañoPantalla = tamañoPantalla;
    }
    
}
