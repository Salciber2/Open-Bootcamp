const lista = {
    "nombre": "Santiago",
    "edad": 30,
    "desarrollador": true,
    "nacimiento": "1993/02/04",
    "libro": {
        "titulo": "Sálvese quien pueda",
        "autor": "Andrés Oppenheimer",
        "fecha": 2018,
        "url": "www.salvesequienpueda.com.ar" // Es una url ficticia
    }
}

console.log("Edad: " + lista.edad);

console.log("Libro que me gusta: " + lista.libro.titulo);