/*
Crea un archivo JS que contenga las siguientes líneas

- Una función sin parámetros que devuelva siempre "true"

- Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado

- Una función generadora de índices pares automáticos
*/

function verdad () { return true };

console.log(verdad());

const promesa = new Promise((resolve, reject) => {
    if (verdad()) {
        setTimeout(() => {
            console.log("Hola soy una promesa")
        }, 5000)
        resolve();
    }
    else reject();
})

function* getPairIndex(){
    let id = 0;
    while(verdad()){
        id += 2;
        if (id === 20) return id;
        yield id;
    }
}

const newIndex = getPairIndex();

console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());
console.log(newIndex.next());