package com.tema4;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartphone = new SmartPhone(
            "TCL",
            "L7+",
            3000,
            "mAh",
            5.5,
            1,
            "Nano"
        );

        SmartWatch smartwatch = new SmartWatch(
            "Huawei",
            "TIA-B09",
            180,
            "mAh",
            1.64,
            11,
            19,
            "cm",
            "Silicona"
        );

        System.out.println("El smartphone es marca " + smartphone.marca + " y modelo " + smartphone.modelo);
        System.out.println("Tiene una bateria de " + smartphone.bateria + " " + smartphone.unidadBateria);
        System.out.println("Su pantalla tiene " + smartphone.tamañoPantalla + "\"");
        System.out.println("Soporta " + smartphone.cantidadSIM + " SIM tipo " + smartphone.tipoSIM);

        System.out.println();

        System.out.println("El smartwatch es marca " + smartwatch.marca + " y modelo " + smartwatch.modelo);
        System.out.println("Tiene una bateria de " + smartwatch.bateria + " " + smartwatch.unidadBateria);
        System.out.println("Su pantalla tiene " + smartwatch.tamañoPantalla + "\"");
        System.out.println("Tiena una malla de " + smartwatch.largoMalla1 + " x " + smartwatch.largoMalla2 +
            " " + smartwatch.unidadLargoMalla + " de " + smartwatch.materialMalla);
    }
    
}
