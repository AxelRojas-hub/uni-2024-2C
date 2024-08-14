class Alumno:
    __nombre = str
    __apellido = str
    __dni = int
    
    def __init__(self):
        pass
    
    @classmethod
    def iniciar(cls):
        alumno = cls.__new__(cls)
        return alumno
    
    @classmethod
    def iniciar_con_nom_ape(cls,nombre,apellido):
        alumno = cls.__new__(cls)
        alumno.__nombre = nombre
        alumno.__apellido = apellido
        return alumno
    
    
    def setNombre(self, val):
        self.__nombre = val
    
    
    def setApellido(self, val):
        self.__apellido = val
    
    
    def setDni(self, val):
        self.__dni = val
    
    
    def getNombreYapellido(self):
        return f"{self.__nombre} {self.__apellido}"
    
    def getDni(self):
        return self.__dni