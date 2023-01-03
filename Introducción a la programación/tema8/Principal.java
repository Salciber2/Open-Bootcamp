package tema8;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Santiago");
        persona.setEdad(29);
        persona.setTelefono("1122334455");

        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " y su número de teléfono es: " + persona.getTelefono());
    }
}
