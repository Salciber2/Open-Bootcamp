package tema3;

public class Principal {
    public static void main(String[] args) {

        int valorSuma; // Variable para guardar el valor de la función sumar

        // Introducción
        System.out.println("Introducción a la programación");
        System.out.println("Ejercicios - Tema 3");
        System.out.println("");

        // Ejecutando función sumar
        valorSuma = sumar(1, 3, 7);
        System.out.println("valorSuma = " + valorSuma);

        valorSuma = sumar(653, 10, 700);
        System.out.println("valorSuma = " + valorSuma);

        valorSuma = sumar(-10, 311, -999);
        System.out.println("valorSuma = " + valorSuma);

        System.out.println("");

        // Creamos el objeto miCoche y usamos sus funciones
        // getCantidadPuertas para mostrar las puertas
        // agregarPuerta para agregar, como lo sugiere el nombre
        Coche miCoche = new Coche();
        System.out.println("La cantidad de puertas que tiene el coche es: " + miCoche.getCantidadPuertas());
        miCoche.agregarPuerta(1);
        System.out.println("La cantidad de puertas que tiene el coche es: " + miCoche.getCantidadPuertas());
    }

    static int sumar(int nro1, int nro2, int nro3){
        return nro1 + nro2 + nro3;
    }
}
