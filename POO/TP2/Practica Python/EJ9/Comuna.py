from datetime import date

class Comuna:
    __nombre: str
    __familias: list
    __fecha: date
    
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__familias = []
        self.__fecha = date.today

    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self,nombre):
        self.__nombre = nombre
        
    def get_fecha(self):
        return self.__fecha
    
    def set_fecha(self, fecha):
        self.__fecha = date.fromisoformat(fecha)
    
    def add_familia(self, familia):
        self.__familias.append(familia)
        
    def get_cantidad_familias(self):
        return len(self.__familias)
    
    def get_cantidad_personas(self):
        personas= 0
        for familia in self.__familias:
            personas += len(familia.get_personas())
        return personas
    
    def get_promedio_edad(self):
        suma_edad=0
        personas= 0
        familias = self.__familias
        for familia in familias:
            for persona in familia.get_personas():
                suma_edad += persona.get_edad()
            personas = personas + len(familia.get_personas())
        return suma_edad/personas
    
    def get_trabajadores(self):
        trabajadores=0
        familias= self.__familias;
        for familia in familias:
            for persona in familia.get_personas():
                if persona.get_trabaja():
                    trabajadores += 1
        return trabajadores