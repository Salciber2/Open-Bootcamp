package com.temas7_8_9;

import java.util.ArrayList;

/*
 * 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
 * Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */

public class Punto6 {

    private ArrayList<Integer> intList;

    public Punto6(){
        this.intList = new ArrayList<Integer>();

    }

    public void ejecutar(){

        int contador = 1;

        while (contador <= 10){
            this.intList.add(contador);
            contador++;
        }

        for (int i = 0 ; i < this.intList.size() ; i++){
            if (this.intList.get(i) % 2 == 0) this.intList.remove(i);
        }

        System.out.println("6.-");
        for(int nro : this.intList){
            System.out.println("ArrayList: " + nro);
        }

        System.out.println();

    }
    
}
