from Alumno import Alumno

alumno1 = Alumno() 
alumno1 = alumno1.iniciar()
alumno1.setNombre("Alejandro")
alumno1.setApellido("Rojas")
alumno1.setDni(11111111)

alumno2 = Alumno().iniciar_con_nom_ape("Martin","Rosales")
alumno2.setDni(22222222)

print(f'{alumno1.getNombreYapellido()}{"- DNI: "}{alumno1.getDni()}')
print(f'{alumno2.getNombreYapellido()}{"- DNI: "}{alumno2.getDni()}')
