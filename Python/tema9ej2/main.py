from functools import reduce

def main():
    numeros = ''
    lista_numeros = []
    lista_impares = []
    isNumber = True
    total = 0

    print('Vamos a sumar los números impares a partir de una lista de números más grande que pueden o no incluir números pares.')
    numeros = input('Ingresa una lista de números separada por coma (ejemplo: 11, 12, 25, 37, 9): \n')

    lista_numeros = numeros.split(',')

    # Verificamos que sea número lo que se ingresó
    for i in range (0, len(lista_numeros)):
        lista_numeros[i] = lista_numeros[i].strip()
        if lista_numeros[i].isalnum() and not lista_numeros[i].isalpha(): # Con esta condición no puedo poner números negativos
            lista_numeros[i] = int(lista_numeros[i])
        else:
            isNumber = False
            print('Hay elementos que no son números.')
            break

    # Aplicamos la función filter y reduce
    if isNumber:
        lista_impares = list(filter(isOdd, lista_numeros))
        if len(lista_impares) > 0:
            total = reduce(add, lista_impares)
            print(f'El total de la suma de los números impares es: {total}')
        else:
            print('No hay números impares para sumar')

def isOdd(x):
    if x % 2 == 0:
        return False
    
    return True

def add(a, b):
    return a + b;

if __name__ == '__main__':
    main()