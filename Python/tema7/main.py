from operaciones import division, multiplicacion, resta, suma

def main():
    print(division.dividir(5, 0))
    print(division.dividir(4, 2))
    print(multiplicacion.multiplicar(3, 7))
    print(resta.restar(68, 19))
    print(suma.sumar(10, 23))

    pass

if __name__ == '__main__':
    main()