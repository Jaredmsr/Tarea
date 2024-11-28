Proceso fibonacci
	Escribir "¿cuantos  numeros  quieres?"
	Leer n
	a<- 1
	num1<- 0
	num2<- 1
	acu<- 0 // variable que  ayuda a  guardar datos.
	Mientras a < n Hacer
		si n < 3 Entonces
			Si n <= 2 Entonces
				Escribir num1		
				
			Fin Si
			Si n = 2 Entonces
				Escribir num2		
			Fin Si
			a<-n
		SiNo
			acu<- num1 + num2
			Escribir suma
		Fin si
	Fin Mientras
FinProceso
