package com.temas7_8_9;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 * 
 * Este programa utiliza InputStream, PrintStream, excepciones en el try catch, HashMap y arrays
 */

public class Punto9 {

    private Scanner scan = new Scanner(System.in);
    private HashMap<String, String> datosTemporales = new HashMap<String, String>();;

    private final String EXTENSION_TXT = ".txt";

    // Opción del menú
    private int option = 0;
    
    // Indica al bucle de Main que siga o no
    private boolean exit = false;

    // Método principal del del Punto9
    public void ejecutar(){

        System.out.println("\n9.-");

        // Mientras no se elija una opción correcta muestro el menú
        do {
            this.option = mostrarMenu();
        } while (this.option == 0);

        // Acciones a realizar según la opción elegida
        switch (this.option) {
            case 1:
                verContenido();
                break;
            case 2:
                crearTxtVacio();
                break;
            case 3:
                verDatos();
                break;
            case 4:
                agregarDatos();
                break;
            case 5:
                vaciarDatos();
                break;
            case 6:
                guardarDatos();
                break;
            case 7:
                cargarDatos();
                break;
            default:
                terminar();
        }

    }

    // Menú principal
    public int mostrarMenu(){

        String option = "0";
        
        System.out.println();
        System.out.println("1.- Ver contenido de un archivo de texto");
        System.out.println("2.- Crear un archivo de texto vacío");
        System.out.println("3.- Ver datos temporales");
        System.out.println("4.- Agregar datos temporales");
        System.out.println("5.- Vaciar datos temporales");
        System.out.println("6.- Guardar datos en archivo (Vacia el HashMap actual)");
        System.out.println("7.- Cargar datos desde archivo (Reemplaza el HashMap actual)");
        System.out.println("8.- Salir");
        System.out.print("Tu opción: ");
        
        option = this.scan.next();

        switch (option) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
                return Integer.parseInt(option);
            default:
                return 0;
        }
    }

    /*
     * OPCIÓN 1
     * Leemos un archivo de texto
     */
    public void verContenido(){
        
        // Indicamos la ruta y pedimos que indique el archivo para leer o ruta del archivo para leer
        System.out.println("Ruta actual: " + System.getProperty("user.dir"));
        System.out.print("Escribe la ruta del archivo para leer: ");
        String ruta = this.scan.next();

        if (!esArchivoTexto(ruta)) {
            System.out.println("Solo se puede leer un archivo de texto (con extensión .txt)");
            return;
        }

        // Leemos el archivo
        try {
            InputStream archivo = new FileInputStream(ruta);
            
            // Mostramos el archivo
            try {
                int datos = archivo.read();

                
                comienzoLectura(ruta);
                while (datos != -1){
                    System.out.print((char)datos);
                    datos = archivo.read();
                }        
                finLectura();

            } catch (IOException e){
                System.out.println(e.getLocalizedMessage());
            }

            // Cerramos el archivo
            try{
                archivo.close(); 
            } catch (IOException e){
                System.out.println(e.getLocalizedMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        } catch (SecurityException e){
            System.out.println(e.getLocalizedMessage());
        }

    }

    /*
     * OPCIÓN 2
     * Creamos un archivo de texto vacío
     */
    public void crearTxtVacio() {

        // Indicamos la ruta y pedimos que indique el archivo para leer o ruta del archivo para crear
        System.out.println("Ruta actual: " + System.getProperty("user.dir"));
        System.out.print("Escribe la ruta del archivo a crear: ");
        String ruta = this.scan.next();

        if (!esArchivoTexto(ruta)) {
            System.out.println("Solo se puede crear un archivo de texto (con extensión .txt)");
            return;
        }

        // Creamos el archivo
        try {
            PrintStream archivo = new PrintStream(ruta);
            archivo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    /*
     * OPCIÓN 3
     * Vemos los datos temporales (los que todavíano se guardaron en el archivo)
     * Estos datos temporales duran mientras el programa se ejecute
     * Vienen en formato HashMap
     */
    public void agregarDatos(){

        String clave = "";
        String valor = "";

        System.out.println();

        System.out.print("Ingrese clave: ");
        clave = this.scan.next();

        System.out.print("Ingrese valor: ");
        valor = this.scan.next();

        this.datosTemporales.put(clave, valor);

    }

    /*
     * OPCIÓN 4
     * Muestra los datos temporales en consola
     */
    public void verDatos(){

        if (this.datosTemporales.isEmpty()) System.out.println("\nNo hay datos");
        else {

            comienzoLectura("Datos temporales");

            for (Map.Entry<String, String> elemento : this.datosTemporales.entrySet()) {
                System.out.println(elemento.getKey() + " - " + elemento.getValue());
            }
            
            finLectura();

        }

    }

    /*
     * OPCIÓN 5
     * Vacía el HashMap datosTemporales
     */
    public void vaciarDatos(){

        System.out.print("Se vaciará el HashMap actual. Escriba [S] o [s] para confirmar, otra letra para cancelar:");
        String option = this.scan.next();

        if(option.equalsIgnoreCase("S")) {
            this.datosTemporales.clear();
        } else {
            System.out.println("\nLos datos no se vaciaron");
        }

    }

    /*
     * OPCIÓN 6
     * Guarda los datos temporales en un archivo de texto
     */
    public void guardarDatos(){

        if (this.datosTemporales.isEmpty()) {
            System.out.println("\nNo hay datos");
            return;
        }

        // Indicamos la ruta y pedimos que indique el archivo para leer o ruta del archivo para crear y/o escribir
        System.out.println("\nRuta actual: " + System.getProperty("user.dir"));
        System.out.print("Escribe la ruta del archivo a crear y/o escribir: ");
        String ruta = this.scan.next();

        if (!esArchivoTexto(ruta)) {
            System.out.println("Solo se puede guardar un archivo de texto (con extensión .txt)");
            return;
        }

        // Escribimos en el archivo
        try {
            PrintStream archivo = new PrintStream(ruta);

            for (Map.Entry<String, String> elemento : this.datosTemporales.entrySet()) {
                archivo.println(" '" + elemento.getKey() + "' - '" + elemento.getValue() + "'");
            }

            vaciarDatos(); // Vacía el HashMap datosTemporales
            
            archivo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }


    }

    /*
     * OPCIÓN 7
     * Cargamos un HashMap desde un archivo txt
     */
    public void cargarDatos(){
        
        // Indicamos la ruta y pedimos que indique el archivo para leer o ruta del archivo para cargar
        System.out.println("\nRuta actual: " + System.getProperty("user.dir"));
        System.out.print("Escribe la ruta del archivo para cargar: ");
        String ruta = this.scan.next();

        if (!esArchivoTexto(ruta)) {
            System.out.println("Solo se puede leer un archivo de texto (con extensión .txt)");
            return;
        }

        // Cargamos el contenido del archivo txt en el HashMap datosTemporales
        try {
            InputStream archivo = new FileInputStream(ruta);

            try {
                int datos = archivo.read();
                String textoArchivo = "";
                String[] lineaTexto, claveValor;
                HashMap<String, String> mapTemp = new HashMap<String, String>();

                // Convertimos en String todo el contenido del archivo (siendo un ejercicio de estudio esperamos que no sea mucho)
                while (datos != -1){
                    textoArchivo += (char)datos;
                    datos = archivo.read();
                }

                // Lo convertimos en un array de Strings separandolos por salto de línea
                lineaTexto = textoArchivo.split("\n");

                // Obtenemos clave y valor de cada línea y lo guardamos dentro de un HashMap local
                for(String linea : lineaTexto) {
                    claveValor = linea.split(" - ");
                    mapTemp.put(
                        claveValor[0].replace('\'', ' ').trim(), // clave
                        claveValor[1].replace('\'', ' ').trim()  // valor
                    );
                }

                // Vaciamos datosTemporales, el HashMap global y luego copiamos el mapTemp dentro de datosTemporales
                this.datosTemporales.clear();
                this.datosTemporales = mapTemp;

            } catch (IOException e){
                System.out.println(e.getLocalizedMessage());
            }

            try{
                archivo.close(); 
            } catch (IOException e){
                System.out.println(e.getLocalizedMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        } catch (SecurityException e){
            System.out.println(e.getLocalizedMessage());
        }

    }

    public boolean esArchivoTexto(String ruta){
        String extensionRuta = ruta.substring(ruta.length()-4, ruta.length());

        if (extensionRuta.equalsIgnoreCase(this.EXTENSION_TXT)) return true;
        else return false;
    }

    public void comienzoLectura(String texto){
        System.out.println("##################################################");
        System.out.println("# Leyendo " + texto);
        System.out.println("##################################################");
        System.out.println();
    }

    public void finLectura(){
        System.out.println();
        System.out.println("##################################################");
        System.out.println("###               Fin de archivo               ###");
        System.out.println("##################################################");
    }

    public void terminar(){
        this.scan.close();
        this.exit = true;
    }

    public boolean exit(){
        return this.exit;
    }
    
}
