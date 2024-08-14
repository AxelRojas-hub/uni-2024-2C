# Como parte de un censo, para relevar la cantidad de personas
# de una comuna se solicita un sistema que permita cargar familias
# donde cada una esta compuesta por varias personas. 
# De las personas es importante conocer: edad, sexo, si estudia y si trabaja
# Desarrollar y diseñar clases y diagrama de clases

from Persona import Persona 
from Familia import Familia
from Comuna import Comuna

persona1 = Persona(55, "Masculino", True, True)
persona2 = Persona(49, "Femenino", False, True)
persona3 = Persona(25, "Masculino", True, False)
persona4 = Persona(10, "Femenino", False, False)
persona5 = Persona(7, "Masculino", False, True)
#-----Agrega personas a la familia
familia1= Familia(1)
familia1.add_persona(persona1)
familia1.add_persona(persona2)
familia1.add_persona(persona3)
familia1.add_persona(persona4)
familia1.add_persona(persona5)
#------------------------------------------------
persona6 = Persona(19, "Femenino", True, True)
persona7 = Persona(16, "Masculino", True, False)
persona8 = Persona(5, "Femenino", True, True)
persona9 = Persona(30, "Masculino", False, False)
persona10 = Persona(35, "Femenino", True, False)
#-----Agrega personas a la familia
familia2= Familia(2)
familia2.add_persona(persona6)
familia2.add_persona(persona7)
familia2.add_persona(persona8)
familia2.add_persona(persona9)
familia2.add_persona(persona10)
#------------------------------------------------
persona11 = Persona(3, "Masculino", True, True)
persona12 = Persona(5, "Femenino", False, True)
persona13 = Persona(6, "Masculino", False, False)
persona14 = Persona(16, "Femenino", True, True)
persona15 = Persona(40, "Masculino", True, False)
#-----Agrega personas a la familia
familia3= Familia(3)
familia3.add_persona(persona11)
familia3.add_persona(persona12)
familia3.add_persona(persona13)
familia3.add_persona(persona14)
familia3.add_persona(persona15)
#-----------------------------------------------
comuna = Comuna("Stella Maris")
comuna.add_familia(familia1)
comuna.add_familia(familia2)
comuna.add_familia(familia3)
print(f'Comuna {comuna.get_nombre()}, Familias censadas: {comuna.get_cantidad_familias()}')
print(f'Personas censadas: {comuna.get_cantidad_personas()}')
print(f'Promedio edad:{"%.1f" % comuna.get_promedio_edad()}') 
print(f'Personas que trabajan: {len(comuna.get_trabajadores())}')
print(f'Personas que pueden trabajar:{len(comuna.get_list_pueden_trabajar())}')
print(f'Personas que pueden manejar:{len(comuna.get_list_pueden_manejar())}')

#"%.1f % var limita a un decimal"