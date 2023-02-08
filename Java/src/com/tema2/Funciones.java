package com.tema2;

public class Funciones{

    static final double IVA_105 = 10.5;
    static final double IVA_21 = 21;

    public static void main(String[] args) {

        double precio = 850;
        double precioIVA = agregarIVA_21(precio);
        double iva = calcularIVA_21(precio);

        System.out.println("El precio sin IVA es: " + precio);
        System.out.println("El IVA del producto es: " + iva);
        System.out.println("El precio con el IVA es: " + precioIVA);
        
    }

    static double agregarIVA_105(double precio){
        double iva = ( Funciones.IVA_105 / 100 ) * precio;
        double precioIVA = iva + precio;
        return precioIVA;
    }

    static double agregarIVA_21(double precio){
        double iva = ( Funciones.IVA_21 / 100 ) * precio;
        double precioIVA = iva + precio;
        return precioIVA;
    }

    static double calcularIVA_105(double precio){
        double iva = ( Funciones.IVA_105 / 100 ) * precio;
        return iva;
    }

    static double calcularIVA_21(double precio){
        double iva = ( Funciones.IVA_21 / 100 ) * precio;
        return iva;
    }
}