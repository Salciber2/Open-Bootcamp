import sqlite3

def main():

    # Variables
    opcion = -1
    query = 'SELECT * FROM Alumnos'
    id = 0
    nombre = ''
    apellido = ''

    # Preguntamos como se quiere buscar
    print('Bienvenido a la tabla Alumnos')    

    while opcion < 0 or opcion > 4:
        print('\nElige por que campo buscar:')
        print('1.- ID')
        print('2.- Nombre')
        print('3.- Apellido')
        print('4.- Pedir todos')
        print('0.- Cerrar')
        opcion = input()
        if opcion.isalnum() and not opcion.isalpha():
            opcion = int(opcion)
        else:
            opcion = -1

    print()

    # Confirmamos la query
    match opcion:
        case 0:
            exit(0)
        case 1:
            id = input('Ingresa el id: ')
            query += f' WHERE id = {id}'
        case 2:
            nombre = input('Ingresa el nombre: ')
            query += f' WHERE nombre = "{nombre}"'
        case 3:
            apellido = input('Ingresa el apellido: ')
            query += f' WHERE apellido = "{apellido}"'

    # Conexión BD
    conn = sqlite3.connect('base.db')
    cursor = conn.cursor()

    rows = cursor.execute(query)

    for row in rows:
        print(row)

    cursor.close()
    conn.close()

if __name__ == '__main__':
    main()

## Querys de creación e inserción de datos

# queryTable = "CREATE TABLE Alumnos (id INT PRIMARY KEY, nombre TEXT NOT NULL, apellido TEXT NOT NULL)"

# query1 = "INSERT into Alumnos (id, nombre, apellido) VALUES (1, 'Santiago', 'López')"
# query2 = "INSERT into Alumnos (id, nombre, apellido) VALUES (2, 'Maria', 'Gonzalez')"
# query3 = "INSERT into Alumnos (id, nombre, apellido) VALUES (3, 'Jaun', 'Rodriguez')"
# query4 = "INSERT into Alumnos (id, nombre, apellido) VALUES (4, 'José', 'Gomez')"
# query5 = "INSERT into Alumnos (id, nombre, apellido) VALUES (5, 'Carlos', 'Fernandez')"
# query6 = "INSERT into Alumnos (id, nombre, apellido) VALUES (6, 'Jorge', 'Diaz')"
# query7 = "INSERT into Alumnos (id, nombre, apellido) VALUES (7, 'Luis', 'Martinez')"
# query8 = "INSERT into Alumnos (id, nombre, apellido) VALUES (8, 'Miguel', 'Perez')"
# query9 = "INSERT into Alumnos (id, nombre, apellido) VALUES (9, 'Ana', 'Garcia')"