class Materia:
    __nombre = ''
    __codigo = ''
    
    def __init__(self, nombre, codigo):
        self.__nombre = nombre
        self.__codigo = codigo
    
    @classmethod
    def iniciar_con_nombre(cls, nombre):
        materia = cls.__new__(cls)
        materia.__nombre = nombre
        return materia
    
    def get_nombre(self):
        return self.__nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def set_codigo(self, codigo):
        self.__codigo = codigo