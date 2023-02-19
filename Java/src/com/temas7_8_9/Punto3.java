package com.temas7_8_9;

import java.util.Vector;

/*
 * 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 */

public class Punto3 {

    private Vector<Integer> vectorNumeros;

    public Punto3(){
        this.vectorNumeros = new Vector<Integer>();
    }

    public void ejecutar() {

        this.vectorNumeros.add(15);
        this.vectorNumeros.add(37);
        this.vectorNumeros.add(23);
        this.vectorNumeros.add(9);
        this.vectorNumeros.add(48);

        this.vectorNumeros.remove(2);
        this.vectorNumeros.remove(3);

        System.out.println("3.- Vector números: " + this.vectorNumeros.toString() + "\n");
        
    }
}
