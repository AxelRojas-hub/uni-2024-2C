class Categoria:
    def __init_(self, titulo):
        self.__titulo = titulo
        self.__series = []
        
    def agregar_serie(self,serie):
        self.__series.append(serie)

    def imprimir(self):
        print(self.__titulo)
        for ser in self.__series:
            ser.imprimir()