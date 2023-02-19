package com.temas7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 */

public class Punto5 {

    private ArrayList<String> listString;
    private LinkedList<String> linkedListString;

    public Punto5(){
        this.listString = new ArrayList<String>();
    }

    public void ejecutar() {

        this.listString.add("Elemento 1");
        this.listString.add("Elemento 2");
        this.listString.add("Elemento 3");
        this.listString.add("Elemento 4");

        this.linkedListString = new LinkedList<String>(listString);

        System.out.println("5.-");
        for(String elemento : listString){
            System.out.println("ArrayList: " + elemento);
        }

        System.out.println("---------------");

        for(String elemento : linkedListString){
            System.out.println("LinkedList: " + elemento);
        }

        System.out.println();

    }
    
}
