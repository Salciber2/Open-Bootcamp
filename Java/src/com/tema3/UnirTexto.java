package com.tema3;

public class UnirTexto {

    public static void main(String[] args) {
        

        String[] textos = {"Java", "Python", "HTML", "CSS", "JavaScript"};
        String union = " ";

        // BUCLE SOLO -----------------------------------------------------------------------------

        String textoConcat = "";

        for (int i = 0 ; i < textos.length ; i++){
            textoConcat = textoConcat.concat(textos[i]);
            if(i < textos.length - 1) textoConcat = textoConcat.concat(union);
        }
        textoConcat = textoConcat.trim();

        System.out.println(textoConcat);

        // BUCLE DENTRO DE FUNCION ----------------------------------------------------------------

        String textoFuncion = unirTextos(textos, union);

        System.out.println(textoFuncion);
    }

    public static String unirTextos(String[] textos, String union){
        String nuevoTexto = "";
        for (int i = 0 ; i < textos.length ; i++){
            nuevoTexto += textos[i];
            if(i < textos.length - 1) nuevoTexto += union;
        }
        return nuevoTexto.trim();
    }
    
}
