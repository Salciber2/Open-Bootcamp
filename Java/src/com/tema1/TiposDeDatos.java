package com.tema1;

public class TiposDeDatos{

    public static void main(String[] args) {
        
        byte nroByte = 5;
        short nroShort = 10;
        int nroInt = 40;
        long nroLong = 320;

        float nroFloat = 10.5f;
        double nroDouble = 31.5;

        boolean verdad = true;
        boolean mentira = false;

        char caracter = '$';
        String texto = "Moneda";

        System.out.println("La variable nroByte tiene el valor " + nroByte);
        System.out.println("La variable nroShort tiene el valor " + nroShort);
        System.out.println("La variable nroInt tiene el valor " + nroInt);
        System.out.println("La variable nroLong tiene el valor " + nroLong);

        System.out.println();

        System.out.println("La variable nroFloat tiene el valor " + nroFloat);
        System.out.println("La variable nroDouble tiene el valor " + nroDouble);

        System.out.println();

        System.out.println("La variable verdad tiene el valor " + verdad);
        System.out.println("La variable mentira tiene el valor " + mentira);
        
        System.out.println();

        System.out.println("La variable caracter tiene el valor " + caracter);
        System.out.println("La variable texto tiene el valor " + texto);

    }
}