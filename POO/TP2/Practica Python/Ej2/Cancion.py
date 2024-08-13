class Cancion:
    __nombre = str;
    __autor: str;
    __duracion: float;
    
    @property
    def __nombre(self):
        return self.__nombre
    
    @__nombre.setter
    def __nombre(self, val):
        self.__nombre = val
    
    @property
    def __autor(self):
        return self.__autor
    
    @__autor.setter
    def __autor(self, val):
        self.__autor = val
    
    @property
    def __duracion(self):
        return self.__duracion
    
    @__duracion.setter
    def __duracion(self, val):
        self.__duracion = val