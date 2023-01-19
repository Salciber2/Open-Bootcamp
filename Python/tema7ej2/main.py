import time

def calcularDifHora(hora_actual, minuto_actual, hora_salida, minuto_salida):
    dif_horas = hora_salida - hora_actual
    dif_minutos = minuto_salida - minuto_actual

    if dif_minutos < 0:
        dif_minutos = 60 + dif_minutos
        dif_horas -= 1

    return dif_horas, dif_minutos

def main():
    tiempo = time.localtime()

    comienzo_trabajo = 10
    fin_trabajo = 19
    dia_semana = tiempo.tm_wday
    hora_actual = tiempo.tm_hour
    minuto_actual = tiempo.tm_min

    if dia_semana >= 5:
        print('Es fin de semana, descansamos')

    elif hora_actual > fin_trabajo:
        print('Ya salimos de trabajar')

    elif hora_actual >= comienzo_trabajo:
        tiempo_faltante = calcularDifHora(hora_actual, minuto_actual, fin_trabajo, 0)
        print('La persona está trabajando, le quedan', tiempo_faltante[0], 'horas y', tiempo_faltante[1], 'minutos de trabajo')

    elif hora_actual >= 0:
        print('La persona está descansando para ir a trabajar')
        
    else:
        print('Error de tiempo')

    pass

if __name__ == '__main__':
    main()