package com.temas7_8_9;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 8.- Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */

public class Punto8 {

    public void ejecutar(){

        try {
            System.out.println("8.-");

            // Abro archivo
            InputStream fichero1 = new FileInputStream("com/temas7_8_9/fichero1.txt");
            System.out.println("El fichero1.txt fue abierto exitosamente.");
            PrintStream fichero2 = new PrintStream("com/temas7_8_9/fichero2.txt");
            System.out.println("El fichero2.txt fue abierto exitosamente.");

            // Copio archivo
            try {
                copiarFichero(fichero1, fichero2);
                System.out.println("Fichero copiado exitosamente.");
            } catch (IOException e) {
                System.out.println("Error al leer/escribir el archivo " + e.getLocalizedMessage());
            }

            // Cierro archivo
            try{
                fichero1.close();
                System.out.println("El fichero1.txt cerrado exitosamente.");
                fichero2.close();
                System.out.println("El fichero2.txt cerrado exitosamente.");

            } catch(IOException e){
                System.out.println("Error al cerrar el archivo " + e.getLocalizedMessage());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo " + e.getLocalizedMessage());
        } finally{
            System.out.println();
        }

    }

    public void copiarFichero(InputStream fileIn, PrintStream fileOut) throws IOException{
        byte[] fileBytes = fileIn.readAllBytes();
        fileOut.write(fileBytes);
    }
    
}
