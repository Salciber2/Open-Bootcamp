// Este archivo debe calcular el factorial de 10 utilizando un bucle while, una bifurcación if y una sentencia break

let n = 10;
let resultado = 1;
let i = 2;

while (true){
    resultado *= i;
    if (i == n) break;
    i++;
}

console.log("Factorial break")
console.log("El factorial de " + n + " es: " + resultado);