
from datetime import date
#date.today()

class Persona:
    __nombre: str
    __apellido: str
    __fecha_nacimiento = date
    
    def __init__(self, nombre, apellido, fecha_nacimiento):
        self.__nombre= nombre
        self.__apellido = apellido
        fecha_parseada = date.fromisoformat(fecha_nacimiento)
        self.__fecha_nacimiento = fecha_parseada

    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
    
    def get_apellido(self):
        return self.__apellido
    
    def set_apellido(self, apellido):
        self.__apellido = apellido
    
    def get_fecha_nacimiento(self):
        return self.__fecha_nacimiento
    
    def set_fecha_nacimiento(self, fecha_nacimiento):
        fecha_parseada = date.fromisoformat(fecha_nacimiento)
        self.__fecha_nacimiento = fecha_parseada
    
    def toString(self):
        return f'Nombre: {self.__nombre}, Apellido: {self.__apellido},\n Fecha de nacimiento: {self.__fecha_nacimiento}\n ' 