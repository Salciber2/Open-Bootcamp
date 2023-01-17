class Alumno:
    nombre = None
    nota = None

    def __init__ (self, nombre):
        self.nombre = nombre

    def getNombre(self):
        return self.nombre

    def setNota(self, nota):
        self.nota = nota

    def getNota(self):
        return self.nota

alumno1 = Alumno('Santiago')
alumno1.setNota(10)

if alumno1.getNota() >= 7:
    print('El alumno', alumno1.getNombre(), 'aprobó la materia con', alumno1.getNota())
else:
    print('El alumno', alumno1.getNombre(), 'sacó', alumno1.getNota(), 'y no aprobó.')