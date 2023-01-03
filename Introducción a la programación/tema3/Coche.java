package tema3;

public class Coche {
    int cantidadPuertas = 0;

    public void agregarPuerta(int cant){
        this.cantidadPuertas += cant;
        System.out.println("Has agregado una puerta");
    }

    public int getCantidadPuertas(){
        return this.cantidadPuertas;
    }
}
