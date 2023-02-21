/*
 * Ejercicio 1 - While
 * Escribe una tabla de multiplicar del 1 al 10 para un número entero que recibe por consola. Es decir, un programa que presente para el 1:
 * 
 * 1 x 1 = 1
 * 1 x 2 = 2
 * …
 * 1 x 10 = 10
 */

int nro = 0;
Console.Write("Introduce un número para poner la tabla de multiplicar: ");
nro = Convert.ToInt32(Console.ReadLine());
int contador = 1;
while (contador <= 10)
{
    Console.WriteLine($"{nro} x {contador} = {nro * contador}");
    contador++;
}

/*
 * Ejercicio 2 - Do While
 * Escribe un programa que realice estos pasos:
 * 
 *  - Reciba al menos un número por consola
 *  - Determine si el número es positivo o negativo
 *  - Presente un contador para cada tipo (positivo y negativo).
 *  
 *  Nota: el cero se puede abordar en una clase adicional ya que no es ni positivo ni negativo.
 *  Tienes completa libertad para elegir el formato de la salida.
 */

int nro2 = 0;
int positivos = 0, negativos = 0;

Console.WriteLine();
do
{
    Console.Write("Introduce un número positivo o negativo ('0' cero para terminar): ");
    nro2 = Convert.ToInt32(Console.ReadLine());

    if (nro2 > 0) positivos++;
    else if (nro2 < 0) negativos++;

} while (nro2 != 0);

Console.WriteLine();
Console.WriteLine("Posivitos ingresados: " + positivos);
Console.WriteLine("Negativos ingresados: " + negativos);


/*
 * Ejercicio 3 - For
 * Escribe un programa que realice estos pasos:
 * 
 *  - Reciba 3 datos:
 *      - ancho
 *      - alto
 *      - relleno o no
 *  - Dibuje en consola con un mismo caracter, por ejemplo *,
 *    un rectángulo de las dimensiones introducidas y use el tercer dato
 *    para discernir si el rectángulo está relleno (tiene más * dentro) o no.
 *  - En caso de recibir el mismo número n dos veces debe dibujar un cuadrado de lado n.
 *  
 *  Reto: Extiende el programa anterior para recibir otro número que sea el
 *  número de cuadrados o rectángulos que se deben dibujar en la pantalla. Ejemplos:
 *  
 *   - Input: 2,2,2, relleno = true
 *     Output:
 *     ** **
 *     ** **
 *   - Input: 3, 4, 1, relleno = false
 *     Output:
 *     ***
 *     * *
 *     * *
 *     ***
 */

// Variables para el programa base
int ancho = 0, alto = 0;
Boolean relleno = false;

Boolean rellenoAncho = false;
Boolean rellenoAlto = false;

// Variables para la extensión del programa
int cantidad = 1;
int restante;
int capacidad = 1;
int lineas = 1;

// Definimos la base de los cuadrados que dibujamos con strings
const string IMPRESION_RELLENO = " X ";
const string IMPRESION_VACIO = "   ";
const int IMPRESION = 3; // Corresponde a los caracteres que dibujan el cuadrado ' X ' o '   '

// Definimos los separadores entre los cuadrados
const string SEPARADOR_STR = " || ";
const int SEPARADOR = 4; // Corresponde a los caracteres del separador ' || '

/*
 * Definimos el ancho máximo, si la pantalla es chica se puede poner un número menor.
 * En mi caso puse 50.
 * 
 * 50 Es el máximo para el cuadrado, la extensión de la pantalla es mayor en base a ese número
 */
const int ANCHO_MAXIMO = 50;
const int EXTENSION_PANTALLA = ANCHO_MAXIMO * IMPRESION + SEPARADOR;

string bordeCuadrado = "", medioCuadrado = "";

// Empezamos a pedir datos
Console.WriteLine("\nVamos a dibujar cuadrados.");

do
{
    Console.Write("Ingresa el ancho (máximo " + ANCHO_MAXIMO + "): ");
    ancho = Convert.ToInt32(Console.ReadLine());
} while (ancho > ANCHO_MAXIMO || ancho <= 0);

Console.Write("Ingresa el alto: ");
alto = Convert.ToInt32(Console.ReadLine());

Console.Write("Ingresa la cantidad: ");
cantidad = Convert.ToInt32(Console.ReadLine());
restante = cantidad;

Console.Write("Ingresa 'true' si lo rellenamos o 'false' si no: ");
relleno = Convert.ToBoolean(Console.ReadLine());

// Armamos los cuadrados en los string
Console.WriteLine();

for (int i = 0; i < ancho; i++)
{
    bordeCuadrado += IMPRESION_RELLENO;

    rellenoAncho = i > 0 && i < (ancho - 1);

    if (rellenoAncho && !relleno)
    {
        medioCuadrado += IMPRESION_VACIO;
    }
    else
    {
        medioCuadrado += IMPRESION_RELLENO;
    }
}

// Definimos cuantos cuadrados entran en cada línea
capacidad = EXTENSION_PANTALLA / (ancho * IMPRESION);
if (capacidad >= cantidad)
{
    capacidad = cantidad;
    lineas = 1;
}
else
{
    lineas = (cantidad / capacidad);
    if (capacidad > 1) lineas++;
}

Console.WriteLine("\nLíneas: " + lineas + "\n");

// Finalmente los dibujamos, el primer for con variable i dibuja los cuadrados en cada línea.
for (int i = 0; i < lineas; i++)
{
    // Actualizamos cuantos cuadrados faltan imprimir
    if (restante < capacidad) capacidad = restante;
    restante -= capacidad;

    // Este for, con variable j dibuja la altura de todos los cuadrados que entran en la línea
    for (int j = 0; j < alto; j++)
    {
        rellenoAlto = j > 0 && j < (alto - 1);

        // Este último for dibuja todos los puntos de ancho de todos los cuadrados que entran en la línea
        for (int k = 0; k < capacidad; k++)
        {
            if (relleno) Console.Write(bordeCuadrado);
            else if (rellenoAlto) Console.Write(medioCuadrado);
            else Console.Write(bordeCuadrado);

            if (k < capacidad - 1) Console.Write(SEPARADOR_STR);
        }
        Console.WriteLine();
    }

    // Separadores entre líneas
    if (i < lineas - 1)
    {
        Console.WriteLine();
        for (int j = 0; j < EXTENSION_PANTALLA; j++)
        {
            Console.Write("=");
        }
    }
    Console.WriteLine("\n");
}