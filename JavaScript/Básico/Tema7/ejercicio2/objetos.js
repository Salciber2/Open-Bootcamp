/*
Crea un archivo llamado objetos.js que contenga las siguientes líneas

- Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)

- Una variable que obtenga tu edad a partir del objeto anterior

- Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s

- Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
*/

const obj = {
    nombre: "Santiago",
    apellido: "López",
    edad: 30,
    altura: 1.8,
    eresDesarrollador: true
};

let edad = obj.edad;

console.log("Variable edad: " + edad);

const amigos = [
    obj,
    { nombre: "Juan", apellido: "Gonzalez", edad: 29, altura: 1.76, eresDesarrollador: false },
    { nombre: "Camila", apellido: "Martinez", edad: 31, altura: 1.72, eresDesarrollador: false }
];

console.log("\nAmigos:");
console.log(amigos);

amigos.sort((a, b) => b.edad - a.edad);

console.log("\nAmigos ordenados:");

amigos.forEach((valor) => console.log(valor.nombre + " - " + valor.edad))