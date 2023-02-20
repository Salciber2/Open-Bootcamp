/*
 * Ejercicio 1
 * Variables Escribe un programa que reciba datos de una persona y genera un mensaje,
 * usa una variable para cada dato y otra para el mensaje.
 * Ej: nombre, apellido, edad, sabe programar, etc.
 */

string? nombre;
string? apellido;
int? edad;
Boolean? programador;

Console.Write("Escribe tu nombre: ");
nombre = Console.ReadLine();

Console.Write("Escribe tu apellido: ");
apellido = Console.ReadLine();

Console.Write("Ingresa tu edad: ");
edad = Convert.ToInt32(Console.ReadLine());

Console.Write("Escribe 'true' si sabe programar, 'false' si no sabe: ");
programador = Convert.ToBoolean(Console.ReadLine());

Console.WriteLine();
Console.WriteLine(nombre + " " + apellido + " tiene " + edad + " años.");
Console.WriteLine(nombre + " programa: " + programador);

/*
 * Ejercicio 2
 * Tipos Usando los tipos de variables más adecuados, describe los objetos siguientes:
 * 
 *  - Coche: puertas, ruedas, marca, ITV vigente
 *  - Mesa: peso, largo, material, color
 * 
 * Nota: puedes escribir estos datos por consola si prefieres verlos. La idea del ejercicio es almacenar los datos en los tipos más adecuados.
 */

int puertas = 5;
int ruedas = 4;
string marca = "Chevrolet";
Boolean ITVVigente = true;

Console.WriteLine();
Console.WriteLine("El " + marca + " de " + puertas + " puertas tiene " + ruedas + " ruedas y la ITV está vigente: " + ITVVigente);

/*
 * Ejercicio 3
 * Operadores Determina los operadores para verificar las siguientes condiciones:
 * 
 *  - Un número es mayor o igual a 18
 *  - Un char es ‘a’
 *  - Se cumplen dos conciones a la vez (ambas verdaderas)
 *  - Se cumple una de dos condiciones a la vez (una true y otra false)
 * 
 * Nota: puedes escribir estos datos por consola si prefieres verlos. La idea del ejercicio es almacenar los datos en los tipos más adecuados.
 */


// Un número es mayor o igual a 18
Console.WriteLine();
Console.Write("Ingresa un número: ");
int? numero = Convert.ToInt32(Console.ReadLine());

Boolean mayorDeEdad = numero >= 18;
Console.WriteLine("¿Es mayor de edad? " + mayorDeEdad);

// Un char es ‘a’
Console.WriteLine();
Console.Write("Ingresa un caracter: ");
char? caracter = Convert.ToChar(Console.Read());

Boolean aMinus = caracter == 'a';
Console.WriteLine("¿Ingresó la letra 'a' minúscula? " + aMinus);

// Se cumplen dos conciones a la vez (ambas verdaderas)
Boolean yTrue = 10 < 15 && 15 < 20;
Console.WriteLine();
Console.WriteLine("yTrue: " + yTrue);

// Se cumple una de dos condiciones a la vez (una true y otra false)
Boolean oTrue = 25 > 20 || 15 > 20;
Console.WriteLine();
Console.WriteLine("oTrue: " + oTrue);