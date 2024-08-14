from Persona import Persona
from Empresa import Empresa

empresa = Empresa("De la costa", "C. Luis Gallino 425")

persona1 = Persona(25, "Masculino", True, True, "Administrativo")
persona2 = Persona(30, "Femenino", False, True, "Administrativo")
persona3 = Persona(22, "Masculino", True, False, "Administrativo")
persona4 = Persona(28, "Femenino", False, False, "Gerente")
persona5 = Persona(35, "Masculino", False, True, "Tesorero")
empresa.add_Empleado(persona1)
empresa.add_Empleado(persona2)
empresa.add_Empleado(persona3)
empresa.add_Empleado(persona4)
empresa.add_Empleado(persona5)
#------------------------------------------------
print(f'Empresa:{empresa.get_nombre()}, Empleados:{empresa.get_cantidad_empleados()}\n Direccion: {empresa.get_direccion()}')
print('--------------------------------')
for empleado in empresa.get_empleados():
    print(f'{empleado.toString()}\n')