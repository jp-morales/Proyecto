package org.ejercicios;

import java.util.Scanner;

public class AppEjercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner entrada =new Scanner(System.in);
		 
		 
		Condicionales mensage =new Condicionales();
		int edad=0;
		String salida="";
		
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		salida= mensage.MostrarMensaje(edad);
		System.out.println(salida);
		
		entrada.close();
	}

	

}
