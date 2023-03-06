/*
Crea un archivo JS que contenga las siguientes líneas

- Una variable que contenga la lista de la compra (mínimo 5 elementos)

- Modifica la lista de la compra y añádele "Aceite de Girasol"

- Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"

- Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)

- Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)

- Una nueva lista que contenga los directores de la lista de películas original (utilizando map)

- Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)

- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)

- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)
*/

const compra = ["Leche", "Pan", "Agua", "Banana", "Fideos", "Tomate",]

console.log()
console.log("COMPRA")
console.log(compra)

compra.push("Aceite de Girasol")

console.log()
console.log("COMPRA")
console.log(compra)

compra.pop()

console.log()
console.log("COMPRA")
console.log(compra)

const peliculas = [
    { titulo: "Avatar", director: "James Cameron", fecha: "2009/09/22"},
    { titulo: "Gladiador", director: "Ridley Scott", fecha: "2000/05/05"},
    { titulo: "En busca de la felicidad", director: "Gabriele Muccino", fecha: "2006/12/15"}
]

// Cambié el año de filtro ya que elegí todas películas anteriores a 2010, puse 2008 para que devuelva por lo menos un valor
const peliculas2 = peliculas.filter((pelicula) => {
    let arrayFecha = pelicula.fecha.split("-")
    if(parseInt(arrayFecha[0]) > 2008) {
        return true
    }
    return false
})

console.log()
console.log("PELÍCULAS")
console.log(peliculas2)

const directores = peliculas.map((pelicula) => pelicula.director)

console.log()
console.log("DIRECTORES")
console.log(directores)

const titulos = peliculas.map((pelicula) => pelicula.titulo)

console.log()
console.log("TÍTULOS")
console.log(titulos)

const peliculasConcat = directores.concat(titulos)

console.log()
console.log("PELÍCULAS CONCAT")
console.log(peliculasConcat)

const peliculasFactorPropagacion = [...directores, ...titulos]

console.log()
console.log("PELÍCULAS FACTOR PROPAGACIÓN")
console.log(peliculasFactorPropagacion)