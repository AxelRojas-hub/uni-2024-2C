#[X] Definir Persona con 
# nombre:string, apellido:string y fecha de nacimiento:date
#[X] Constructor que reciba tres parametros, uno por atributo
#[X] Getters y setters de cada atributo
#[X] Metodo toString que retorne una cadena con el val de todos los att
#[X] Instanciar tres veces e imprimir lo que devuelve toString

from Persona import Persona

persona1= Persona("Axel","Rojas","1999-02-11")
persona2= Persona("Guadalupe","Rojas","2016-02-13")
persona3= Persona("Susana","Morales","1968-10-18")

#print(type(persona1.get_fecha_nacimiento()))

print(persona1.toString())
print(persona2.toString())
print(persona3.toString())