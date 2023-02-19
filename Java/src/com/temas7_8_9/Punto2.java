package com.temas7_8_9;

/*
 * 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class Punto2 {

    private int[][] numeros;

    public Punto2(){
        this.numeros = new int[5][5];
        for (int i = 0 ; i < this.numeros.length ; i++){
            for(int j = 0 ; j < this.numeros[i].length ; j++) {
                this.numeros[i][j] = i*j+j+i;
            }
        }
    }

    public void ejecutar(){

        System.out.println("2.-");

        for (int i = 0 ; i < this.numeros.length ; i++){

           for(int j = 0 ; j < this.numeros[i].length ; j++) {
               System.out.print("Posición [" + i + "][" + j + "]: " + this.numeros[i][j]);
               if(j < this.numeros[i].length - 1) System.out.print(" | ");
           }

           System.out.println();
        }

        System.out.println();
    }
    
}
