package tema9;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("Ariel");
        cliente.setEdad(35);
        cliente.setTelefono("1122334455");
        cliente.setCredito(12500.0);

        System.out.println("CLIENTE");
        System.out.println(cliente.getNombre() + " tiene " + cliente.getEdad() + " años.");
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println();

        trabajador.setNombre("Santiago");
        trabajador.setEdad(29);
        trabajador.setTelefono("6677889900");
        trabajador.setSalario(100000.0);

        System.out.println("TRABAJADOR");
        System.out.println(trabajador.getNombre() + " tiene " + trabajador.getEdad() + " años.");
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
