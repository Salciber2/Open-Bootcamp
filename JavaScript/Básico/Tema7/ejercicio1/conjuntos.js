/*
Crea un archivo llamado conjuntos.js que contenga las siguientes líneas

- Un nuevo Set con los nombres de tu familia

- Modifica el Set original añadiendo tu nombre (duplicado) (debería darte lo mismo)

- Modifica el Set original añadiendo el nombre "Javascript" (ya que empieza a formar parte de tu vida ;)
*/

const familia = new Set(["Santiago", "Juan", "Laura"]);

console.log(familia);

familia.add("Santiago");

console.log(familia);

familia.add("Javascript")

console.log(familia)