const elementos = document.querySelectorAll(".elemento")
const secciones = document.querySelectorAll(".seccion")
const papelera = document.querySelector(".papelera")

elementos.forEach(elemento => {
    elemento.addEventListener("dragstart", event => {
        elemento.classList.add("dragging")
        event.dataTransfer.setData("id", elemento.id)

    })

    elemento.addEventListener("dragend", () => {
        elemento.classList.remove("dragging")
    })
})

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault()
    })

    seccion.addEventListener("drop", event => {
        const id_elemento = event.dataTransfer.getData("id")
        const elemento = document.getElementById(id_elemento)
        seccion.appendChild(elemento)
    })
})

papelera.addEventListener("dragover", event => {
    event.preventDefault()
})

papelera.addEventListener("drop", event => {
    const id_elemento = event.dataTransfer.getData("id")
    const elemento = document.getElementById(id_elemento)
    const respuesta = confirm("¿Desea borrar el elemento?")
    if (respuesta) elemento.remove()
})