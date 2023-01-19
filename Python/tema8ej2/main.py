import pickle

class Vehiculo:
    color = ''
    puertas = 0
    velocidad_max = 0

    def __init__(self, color, puertas, velocidad_max):
        self.color = color
        self.puertas = puertas
        self.velocidad_max = velocidad_max

    def __str__(self):
        return f'El vehículo es {self.color}, tiene {self.puertas} puertas y alcanza una {self.velocidad_max} velocidad máxima.'

def main():
    miVehiculo = Vehiculo('Rojo', 4, 225)

    fichero = open('vehiculo.bin', 'wb')
    pickle.dump(miVehiculo, fichero)
    fichero.close()

    fichero = open('vehiculo.bin', 'rb')
    vehiculoCargado = pickle.load(fichero)
    fichero.close()

    print(vehiculoCargado)
    print(vehiculoCargado.color)

    pass

if __name__ == '__main__':
    main()