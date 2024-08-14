# Como parte de un censo, para relevar la cantidad de personas
# de una comuna se solicita un sistema que permita cargar familias
# donde cada una esta compuesta por varias personas. 
# De las personas es importante conocer: edad, sexo, si estudia y si trabaja
# Desarrollar y diseñar clases y diagrama de clases

from Persona import Persona 
from Familia import Familia

persona1 = Persona(25, "Masculino", True, True)
persona2 = Persona(30, "Femenino", False, True)
persona3 = Persona(22, "Masculino", True, False)
persona4 = Persona(28, "Femenino", False, False)
persona5 = Persona(35, "Masculino", False, True)
#-----Agrega personas a la familia
familia1= Familia(1)
familia1.add_persona(persona1)
familia1.add_persona(persona2)
familia1.add_persona(persona3)
familia1.add_persona(persona4)
familia1.add_persona(persona5)
#------------------------------------------------
persona6 = Persona(19, "Femenino", True, True)
persona7 = Persona(27, "Masculino", True, False)
persona8 = Persona(21, "Femenino", True, True)
persona9 = Persona(32, "Masculino", False, False)
persona10 = Persona(24, "Femenino", True, False)
#-----Agrega personas a la familia
familia2= Familia(2)
familia2.add_persona(persona6)
familia2.add_persona(persona7)
familia2.add_persona(persona8)
familia2.add_persona(persona9)
familia2.add_persona(persona10)
#------------------------------------------------
persona11 = Persona(29, "Masculino", True, True)
persona12 = Persona(23, "Femenino", False, True)
persona13 = Persona(31, "Masculino", False, False)
persona14 = Persona(26, "Femenino", True, True)
persona15 = Persona(34, "Masculino", True, False)
#-----Agrega personas a la familia
familia3= Familia(3)
familia3.add_persona(persona11)
familia3.add_persona(persona12)
familia3.add_persona(persona13)
familia3.add_persona(persona14)
familia3.add_persona(persona15)
#-----------------------------------------------

print(f'Familia: {familia1.get_id()}')
for persona in familia1.get_personas():
    print(f'Edad: {persona.get_edad()},Sexo:{persona.get_sexo()}, Estudia:{persona.get_estudia()}, Trabaja:{persona.get_trabaja()}\n' )