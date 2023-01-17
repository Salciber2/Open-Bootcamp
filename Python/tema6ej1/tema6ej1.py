# CLASES
class Vechiculo:
    color = None
    ruedas = None
    puertas = None

    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

class Coche(Vechiculo):
    velocidad = None
    cilindrada = None

    def __init__(self, velocidad, cilindrada, color, ruedas, puertas):
        super().__init__(color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada

# EJECUCIÓN DEL PROGRAMA
miCoche = Coche(220, 1400, 'Verde', 4, 5)

print('miCoche tiene', miCoche.ruedas, 'ruedas y', miCoche.puertas, 'puertas')
print('El color de miCoche es', miCoche.color)
print('La cilindrada de miCoche es',miCoche.cilindrada)
print('Alcanza una velocidad de', miCoche.velocidad)