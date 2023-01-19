def main():
    f = open('archivo.txt', 'w')
    texto = 'Hola mundo!'
    f.write(f'{texto}')
    f.close()

    f = open('archivo.txt', 'a')
    texto = 'Otra línea'
    f.write(f'\n{texto}')
    f.close()


if __name__ == '__main__':
    main()