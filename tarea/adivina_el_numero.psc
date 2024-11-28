Proceso adivina_el_numero
intentos<- 10
num_secreto<- azar(100)+1
Escribir "adivina el numero del 1-100. Ingresa el numero:"
Leer num_ingresado
Mientras num_ingresado<>num_secreto y intentos>1 Hacer
	si num_ingresado<num_secreto Entonces
		Escribir "es muy  menor"
	SiNo
		Escribir "es  muy mayor"
	FinSi
	intentos=intentos-1
	Escribir "solo te quedan ", intentos , " intentos"
	Leer num_ingresado
FinMientras
si num_ingresado=num_secreto Entonces
	Escribir "Felicidades haz encontrado el numero"
sino
	si intentos=0 Entonces
		Escribir "Perdiste, el numero era ", num_secreto
	FinSi
	Escribir "Perdiste, el numero era ", num_secreto
FinSi

FinProceso
