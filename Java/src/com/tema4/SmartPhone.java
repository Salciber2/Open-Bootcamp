package com.tema4;

public class SmartPhone extends SmartDevice {
    
    int cantidadSIM;
    String tipoSIM;

    public SmartPhone(){}

    public SmartPhone(String marca, String modelo, int bateria, String unidadBateria, double tamañoPantalla, int cantidadSIM,
            String tipoSIM) {
        super(marca, modelo, bateria, unidadBateria, tamañoPantalla);
        this.cantidadSIM = cantidadSIM;
        this.tipoSIM = tipoSIM;
    }
}
