/*
Ejercicio 1 - If

Escribe un programa que:

Pida datos a un cliente: Nombre, email, cupón

Determine si un cliente tiene un cupon descuento

Muestre un precio rebajado en función del descuento

Muestre el precio de un producto sin descuento si no hay cupón

Nota: puedes poner un precio fijo de un producto o uno variable.
*/

string? nombre = "";
string? email = "";
double cupon = 0;
double precioProducto = 0;
double precioFinal = 0;

Console.Write("Ingresa tu nombre: ");
nombre = Console.ReadLine();

Console.Write("Ingresa tu email: ");
email = Console.ReadLine();

Console.Write("Ingresa el porcentaje de descuento de tu cupón (0 si no tienes):");
cupon = Convert.ToInt32(Console.ReadLine());

Console.Write("Ingresa el precio del producto:");
precioProducto = Convert.ToInt32(Console.ReadLine());

if (cupon < 0 || precioProducto < 1) Console.WriteLine("El precio o el cupón no son válidos.");
else
{
    if (cupon == 0) precioFinal = precioProducto;
    else precioFinal = precioProducto * (1 - (cupon / 100));

    Console.WriteLine("El precio final del producto es: " + precioFinal);
}

/*
Ejercicio 2 - Switch

Haz una lista de lenguajes de programación, por ejemplo: C#, Java, C++.
Presenta la lista en consola y pide que el usuario seleccione el lenguaje mediante 1, 2, 3 o a, b, c. Presenta el resultado en consola.

Nota: puedes añadir al resultado el “Hola, mundo” para el caso de C#.
*/

var lenguajes = new List<string> { "C", "C++", "C#", "Java", "JavaScript", "HTML", "CSS", "PHP", "Python" };
int opcion = 0;

Console.WriteLine("Elige un lenguaje:");
for (int i = 0; i < lenguajes.Count(); i++)
{
    Console.WriteLine((i+1) + ".- " + lenguajes.ElementAt(i));
}

opcion = Convert.ToInt32((Console.ReadLine()));

switch (opcion)
{
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
        Console.WriteLine("Elegiste el lenguaje " + lenguajes.ElementAt(opcion - 1) + ".");
        break;
    default:
        Console.WriteLine("Elegiste un opción que no existe.");
        break;
}
