/*
Crea un archivo JS que contenga las siguientes líneas

- Una variable que contenga tu altura en centímetros (entero)

- Una variable que contenga tu altura en metros (número de coma flotante)

- Una variable que contenga tu peso en kilogramos (número de coma flotante)

- Una variable que contenga tu altura en metros redondeada hacia arriba

- Una variable que contenga tu peso en kilogramos redondeado hacia abajo

- Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
*/

let altura_cm = 180;
let altura_mts = 1.8;
let peso_kg = 75.5;

let altura_mts_up = Math.ceil(altura_mts);
let peso_kg_down = Math.floor(peso_kg);

let max = Number.MAX_VALUE + 1 === Number.MAX_VALUE;

console.log(max);