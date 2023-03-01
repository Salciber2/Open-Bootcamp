// Este archivo debe calcular el factorial de 10 utilizando un bucle while

let n = 10;
let resultado = 1;
let i = 2;

while (i <= n){
    resultado *= i;
    i++;
}

console.log("Factorial while")
console.log("El factorial de " + n + " es: " + resultado);