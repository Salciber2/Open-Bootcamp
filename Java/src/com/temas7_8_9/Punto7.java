package com.temas7_8_9;

/*
 * 7. Crea una función DividePorCero.
 * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
 */

public class Punto7 {

    public void ejecutar(){

        System.out.println("7.-");
        try{
            dividePorCero(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: " + e.getLocalizedMessage());
        } finally {
            System.out.println("Demo de código");
        }
        System.out.println();

    }

    public int dividePorCero(int nro1, int nro2) throws ArithmeticException {
        return nro1 / nro2;
    }
    
}
