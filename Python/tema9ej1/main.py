def main():
    paises = ''
    lista_paises = []    
    paises_sin_repetir = []

    paises = input('Ingresá una lista de paises separados por coma (ejemplo: Argentina, Brasil, Chile, Dinamarca, España, etc.):\n');

    lista_paises = paises.split(',')

    for i in range(0, len(lista_paises)):
        lista_paises[i] = lista_paises[i].strip().capitalize()

    lista_paises.sort()

    paises_sin_repetir = set(lista_paises)

    print(paises_sin_repetir)

if __name__ == '__main__':
    main()