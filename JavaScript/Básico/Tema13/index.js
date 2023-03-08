let nombre = "Santiago"
let apellido = "López"

let estudiante = nombre.concat(" ", apellido)

let estudianteMayus = estudiante.toUpperCase()
let estudianteMinus = estudiante.toLowerCase()

let largoEstudiante = estudiante.length

let letraN = nombre.charAt(0)
let letraA = apellido.charAt(apellido.length - 1)

// Ya que la variable no tiene espacios al principio y al final, le agrego replace para sacar el espacio entre nombre y apellido
// En este caso podría omitirse el método trim
let estudianteSinEspacio = estudiante.replace(" ", "")

let existeNombre = estudiante.includes(nombre)

console.log(existeNombre)