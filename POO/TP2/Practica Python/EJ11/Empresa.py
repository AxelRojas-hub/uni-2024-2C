from Persona import Persona
class Empresa:
    __nombre: str
    __direccion: str
    __empleados: list

    def __init__(self, nombre,direccion) :
        self.__nombre= nombre
        self.__direccion= direccion
        self.__empleados = []
        
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.__nombre = nombre
    
    def get_direccion(self):
        return self.__direccion
    def set_direccion(self, direccion):
        self.__direccion = direccion
    
    def get_empleados(self):
        return self.__empleados
    
    def add_Empleado(self, empleado):
        self.__empleados.append(empleado)
        
    def get_cantidad_empleados(self):
        return len(self.__empleados)