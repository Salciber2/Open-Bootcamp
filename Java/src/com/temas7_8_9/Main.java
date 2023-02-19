package com.temas7_8_9;

public class Main {

    public static void main(String[] args) {

        String texto = "hola mundo";
        System.out.println("Texto invertido: " + reverse(texto) + "\n");

         
        // 1.-
        // Punto1 p1 = new Punto1();
        // p1.ejecutar();

        // 2.-
        // Punto2 p2 = new Punto2();
        // p2.ejecutar();

        // 3.-
        // Punto3 p3 = new Punto3();
        // p3.ejecutar();

        // 4.-
        // Punto4 p4 = new Punto4();
        // p4.ejecutar();

        // 5.-
        // Punto5 p5 = new Punto5();
        // p5.ejecutar();

        // 6.-
        // Punto6 p6 = new Punto6();
        // p6.ejecutar();

        // 7.-
        // Punto7 p7 = new Punto7();
        // p7.ejecutar();

        // 8.-
        // Punto8 p8 = new Punto8();
        // p8.ejecutar();

        // 9.-
        Punto9 p9 = new Punto9();

        while (!p9.exit()) {
            p9.ejecutar();
        }

    }

    /**
     * <p>Dada la función:</p>
     * <p>public static String reverse(String texto) { }</p>
     * <p>Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".</p>
     * @param texto
     * @return Cadena invertida
     */
    public static String reverse(String texto) {

        String nuevoTexto = "";

        for(int i = (texto.length() - 1) ; i >= 0  ; i--) {
            nuevoTexto += texto.charAt(i);
        }

        return nuevoTexto;
    }
    
}
