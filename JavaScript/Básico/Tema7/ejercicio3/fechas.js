/*
Crea un archivo llamado fechas.js que contenga las siguientes líneas

- La fecha de hoy

- La fecha de tu nacimiento

- Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento

- Una variable que contenga el día de tu nacimiento

- Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)

- Una variable que contenga el año de tu nacimiento (con 4 dígitos)
*/

const hoy = new Date();

const miNacimiento = new Date("02/04/1993");

console.log("Hoy:")
console.log(hoy.toUTCString());
console.log("Mi nacimiento:")
console.log(miNacimiento.toUTCString());

const esMasTarde = hoy > miNacimiento;

console.log("¿Es más tarde hoy que mi nacimiento?: " + esMasTarde);

const diaNacimiento = miNacimiento.getDate();

console.log("Dia: " + diaNacimiento);

const mesNacimiento = miNacimiento.getMonth() + 1;

console.log("Mes: " + mesNacimiento);

const anyoNacimiento = miNacimiento.getFullYear();

console.log("Año: " + anyoNacimiento);