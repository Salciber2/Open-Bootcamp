package com.temas7_8_9;

/*
 * 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */

public class Punto1{

    private String[] cadenas;

    public Punto1(){
        this.cadenas = new String[5];
        this.cadenas[0] = "Java";
        this.cadenas[1] = "Python";
        this.cadenas[2] = "HTML";
        this.cadenas[3] = "CSS";
        this.cadenas[4] = "JavaScript";
    }

    public void ejecutar(){

        System.out.print("1.- ");

        for (int i = 0 ; i < this.cadenas.length ; i++) {
            System.out.print(this.cadenas[i]);            
            if (i < this.cadenas.length - 1) System.out.print(" | ");
        }

        System.out.println("\n");
    }

}