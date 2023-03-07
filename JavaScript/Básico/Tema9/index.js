const logger = require('./logger');

// Función que puede tirar errores
const dividir = (a, b) => {
    if (typeof a === "number" && typeof b === "number") {
        if (b != 0) return a / b;
        throw new Error("No se puede dividir por 0.");
    }
    throw new Error("Debe ingresar valores numéricos.");
}

// Ejemplo correcto
try{    
    const resultado1 = dividir(4, 2);
    console.log("Resultado 1: " + resultado1);
} catch (e) {
    console.error(`${e}`);
}

// Ejemplo error 1
try{
    const resultado2 = dividir(6, "3");
    console.log("Resultado 2: " + resultado2);
} catch (e) {
    console.error(`${e}`);
    logger.error(`${e}`);
}

// Ejemplo error 2
try{
    const resultado2 = dividir(8, 0);
    console.log("Resultado 2: " + resultado2);
} catch (e) {
    console.error(`${e}`);
    logger.error(`${e}`);
}