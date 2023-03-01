// Este archivo debe calcular el factorial de 10 utilizando un solo bucle for

let n = 10;
let resultado = 1;

for (let i = 2 ; i <= n ; i++){
    resultado *= i;
}

console.log("Factorial for")
console.log("El factorial de " + n + " es: " + resultado);