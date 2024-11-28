Proceso mult_11_20
	Escribir"dame un numero del 11-20 para enseñarte su tabla"
	leer n
	si n<11 o n>20 Entonces
		Escribir "este numero no es correcto"
	SiNo
		Para l<-1 Hasta n Con Paso 1 Hacer
			Escribir l*n
		Fin Para
	FinSi

	
	
FinProceso
