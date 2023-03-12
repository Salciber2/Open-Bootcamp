let nombre = "Santiago"
let apellido = "López"

const persona = {
    nombre: nombre,
    apellido: apellido
}

// sessionStorage.setItem("persona", persona)
// localStorage.setItem("persona", persona)

let hoy = new Date()
let horas = hoy.getHours()
let minutos = hoy.getMinutes() + 2

if (minutos >= 60) {
    minutos -= 60
    horas++
    if (horas >= 24) horas - 24
}

let fecha = new Date(hoy.getFullYear(), hoy.getMonth(), hoy.getDate(), horas, minutos).toUTCString()

console.log(fecha)

// document.cookie = "persona=" + JSON.stringify(persona) + ";expires=" + fecha