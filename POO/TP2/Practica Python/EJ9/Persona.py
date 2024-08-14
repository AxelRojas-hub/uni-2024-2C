class Persona:
    __edad: int
    __sexo: str
    __estudia: bool
    __trabaja: bool
    
    def __init__(self, edad, sexo, estudia, trabaja):
        self.__edad= edad
        self.__sexo= sexo
        self.__estudia= estudia
        self.__trabaja= trabaja
    
    def get_edad(self):
        return self.__edad
    
    def set_edad(self,edad):
        self.__edad=edad
        
    def get_sexo(self):
        return self.__sexo
    
    def set_sexo(self,sexo):
        self.__sexo=sexo
        
    def get_estudia(self):
        return self.__estudia
    def set_estudia(self,estudia):
        self.__estudia=estudia
    
    def get_trabaja(self):
        return self.__trabaja
    def set_trabaja(self,trabaja):
        self.__trabaja=trabaja