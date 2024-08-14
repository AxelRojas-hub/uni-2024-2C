class Familia:
    __personas:list
    __id_familia:0
    
    def __init__(self, id):
        self.__id_familia = id
        self.__personas = []
    
    def get_id(self):
        return self.__id_familia
    
    def set_id(self, id):
        self.__id_familia = id
        
    def get_personas(self):
        return self.__personas
    def add_persona(self, persona):
        self.__personas.append(persona)
    