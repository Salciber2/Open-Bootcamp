package tema4;

public class Principal {
    public static void main(String[] args) {
        int numeroIf = -10;
        int numeroWhile = 0;
        String estacion = "INVIERNO";

        System.out.println("IF");

        // Punto 1 del ejercicio del tema 4 - IF, ELSE IF, ELSE
        if(numeroIf > 0){
            System.out.println("El número " + numeroIf + " es positivo.");
        } else if(numeroIf < 0){
            System.out.println("El número " + numeroIf + " es negativo.");
        } else{
            System.out.println("El número es el cero.");
        }

        System.out.println();
        System.out.println("WHILE");

        // Punto 2 del ejercicio del tema 4 - WHILE
        while(numeroWhile < 3){
            System.out.println("NúmeroWhile: " + numeroWhile);
            numeroWhile++;
        }

        System.out.println();
        System.out.println("DO-WHILE");

        // Punto 3 del ejercicio del tema 4 - DO-WHILE
        do{
            System.out.println("NúmeroDoWhile: " + numeroWhile);
            numeroWhile++;
        } while(numeroWhile < 3);

        System.out.println();
        System.out.println("FOR");

        // Punto 4 del ejercicio del tema 4 - FOR
        for(int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++){
            System.out.println("NúmeroFor: " + numeroFor);
        }

        System.out.println();
        System.out.println("SWTICH");

        // Punto 5 del ejercicio del tema 5 - SWITCH
        switch(estacion){
            case "INVIERNO":
                System.out.println("Winter is coming.");
                break;
            case "OTOÑO":
                System.out.println("Estamos en la estación otoño.");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en la estación primavera.");
                break;
            case "VERANO":
                System.out.println("Estamos en la estación verano.");
                break;
            default:
                System.out.println("El texto no representa una estación válida.");
        }
    }
}
