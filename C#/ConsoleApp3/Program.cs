/*
 * Ejercicio 1
 * Crea una estructura de datos para un cliente con estos campos:
 * 
 * Nombre completo
 * Teléfono
 * Dirección
 * Email
 * Si es nuevo cliente
 * 
 * Bonus: escribe un método para presentar estos datos desde la estructura al hacer Console.WriteLine(...)
 */

Cliente cliente1 = new Cliente("Santiago", "1122334455", "Calle 67", "santiago89@mail.com", true);

Console.WriteLine(cliente1);

public struct Cliente
{
    public Cliente(string nombreCompleto, string telefono, string direccion, string email, Boolean nuevo)
    {
        this.nombreCompleto = nombreCompleto.Trim();
        this.telefono = telefono.Trim();
        this.direccion = direccion.Trim();
        this.email = email.Trim();
        this.nuevo = nuevo;
    }

    public string nombreCompleto { get; set; }

    public string telefono { get; set; }

    public string direccion { get; set; }

    public string email { get; set;  }

    public Boolean nuevo { get; set; }

    public override string ToString()
    {
        return "Cliente: " + nombreCompleto +
            "\n" + "Teléfono: " + telefono +
            "\n" + "Dirección: " + direccion +
            "\n" + "Email: " + email +
            "\n" + "Es nuevo: " + nuevo;
    }

}