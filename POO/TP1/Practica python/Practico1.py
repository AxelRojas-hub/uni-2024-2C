"""
PUNTO 5
Almacenar hola mundo en una variable 
y mostrar el contenido
"""

def punto5():
    variable = "Hola mundo"
    print(variable)

""" 
PUNTO 6
Programa que pregunte el nombre al usuario
y lo muestre por pantalla
"""

def punto6():
    nombre = input("Ingrese su nombre: ")
    print(nombre)

"""
PUNTO 7
Sumar dos enteros que son ingresados por teclado
Mostrarlos por consola
"""

def punto7():
    numero1 = int(input("Escriba el primer número entero: "))
    numero2 = int(input("Escriba el segundo número entero: "))
    print (f"La suma es: {numero1+numero2}")

"""
PUNTO 8
Un programa que concatene dos frases ingresadas por teclado
Mostrarla por consola
"""

def punto8():
    cade1 = input("Ingrese la primer frase: ")
    cade2 = input("Ingrese la segunda frase: ")
    print(f"El resultado de las dos frases ingresadas son: {cade1 + cade2}")

"""
PUNTO 9
Programa que indique como es un numero ingresado por el usuario
con respecto a otro generado aleatoriamente del 1 al 10 al comenzar el programa
Evaluar si: es igual, menor, mayor, distinto, menor o igual y mayor o igual
"""
import random 

def punto9():
    num = int(input("Ingrese un número: "))
    numRandom = random.randint(1,10)  
    
    #Igual / Distinto
    if num == numRandom:
        print(f"{num} es igual a {numRandom}")
    else:
        print(f"{num} es distinto a {numRandom}")
    
    #Mayor / Menor
    if num > numRandom:
        print(f"{num} es menor a {numRandom}")
    elif num<numRandom:
        print(f"{num} es menor a {numRandom}")
    
    #Mayor o igual / Menor o igual
    if num <= numRandom:
        print(f"{num} es menor o igual a {numRandom} ")
    elif num>= numRandom:
        print(f"{num} es mayor o igual a {numRandom}")

"""
PUNTO 10
Programa que calcule el indice de masa corporal(peso/estatura**)
Datos ingresados por el usuario, imprimir en pantalla
"""
def punto10():
    estatura = float(input("Ingrese su estatura en metros: "))
    peso = float(input("Ingrese su peso en kg: "))
    imc = peso/(estatura*estatura)
    print(f"Su indice de masa corporal es: {imc}")

"""
PUNTO 11
Programa que elija dos num enteros aleatorios.
Si son iguales, repite hasta que sean distintos.
Preguntar si apostamos por val1 o val2 (gana el mas alto)
Mostrar valores e indicar si el usuario gano o perdio
Preguntar si quiere volver a jugar, en caso de no, mostrar cantGanadas y cantPerdidas
Contemplar consistencias para cualquier valor no numerico
"""

def punto11():
    iguales = True
    partidasGanadas = 0
    partidasPerdidas = 0
    rta = 's'
    while rta == 's':
        val1 = random.randint(1,100)
        val2 = random.randint(1,100)
        #Verifica si los valores son distintos sino repite la asignacion
        while iguales:
            val1 = random.randint(1,100)
            val2 = random.randint(1,100)
            if val1 != val2:
                iguales = False
        apuesta = int(input("A cual valor apuesta? (1 o 2)"))
        #Consistencia del input
        while apuesta != 1 and apuesta != 2: 
            print("La apuesta debe ser al valor 1 o 2")
            apuesta = int(input("A cual valor apuesta? (1 o 2)"))
        #Imprime resultados
        print(f"El valor 1 es: {val1}")
        print(f"El valor 2 es: {val2}")
        if (val1>val2 and apuesta == 1) or (val2 > val1 and apuesta == 2):
            print("Ganaste!")
            partidasGanadas += 1
        else: 
            print("Perdiste")
            partidasPerdidas += 1
        rta = input("Ingrese 's'si quiere seguir jugando, caso contrario finalizara la ejecucion ").lower()
    
    print(f"Partidas ganadas: {partidasGanadas}")
    print(f"Partidas perdidas: {partidasPerdidas}")


""" Llamados """

#punto5()
#punto6()
#punto7()
#punto8()
#punto9()
#punto10()
#punto11()