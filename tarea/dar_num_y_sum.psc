Proceso dar_num_y_sum
	Escribir "¿hasta que numero quieres que sume?"
	Leer num
	si num<100 Entonces
		Para n<-1 Hasta n+1 Con Paso 1 Hacer
			n=n+num
			Escribir n*num
		Fin Para
		
	SiNo
		Escribir "este numero no es valido"
	FinSi
	
FinProceso
