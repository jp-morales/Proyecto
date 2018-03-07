package org.ejercicios;

public class Condicionales {
	
	public String MostrarMensaje (int edad)
	{
		String mensaje="";
		
		if (edad <12)
			mensaje="Eres un niño";
		
		if(edad > 12 && edad<19)
			mensaje ="eres adolecente";
		
		if (edad>=19)
			mensaje="eres chavorruco";
		
		return mensaje;
		
	
		
	}

}
