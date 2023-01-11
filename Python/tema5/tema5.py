# Función para saber si el año es bisiesto
def isBisiesto(tuplaDate):

    # Devolvemos falso si la fecha no es válida
    if tuplaDate[2] == False:
        return False

    year1 = tuplaDate[2] // 100
    year2 = tuplaDate[2] - year1 * 100

    if year2 == 0:
        if year1 % 4 == 0:
            return True
        else:
            return False
    elif year2 % 4 == 0:
        return True

    return False

# Función para separar la cadena en 3 números, dia, mes y año
def splitDate(date):
    day = 0
    month = 0
    year = 0

    if date.isnumeric():
        day = int(date) // 1000000
        month = (int(date) - day * 1000000) // 10000
        year = (int(date) - day * 1000000 - month * 10000)
        return day, month, year
    else:
        return 0, 0, False # De esta forma avisamos que no es una fecha válida

# Inicia el programa
print('Ingresa un año con el formato DDMMAAAA:')

# Todavía no vi como pedir datos al usuario, suponemos que este dato lo puso el usuario con el teclado
date = '1102190s'
print(date)

# Separamos la fecha - tuplaDate = (day, month, year)
tuplaDate = splitDate(date)

if tuplaDate[2]:
    if isBisiesto(tuplaDate):
        print('El año es bisiesto')
    else:
        print('El año no es bisiesto')
else:
    print('La fecha no es válida')