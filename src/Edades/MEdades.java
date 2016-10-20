package Edades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MEdades {
	public static void main (String [] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			/*
			2. Realizar un programa que pregunte el nombre y el a�o de nacimiento y d� como resultado: 

			Hola nombre, en el a�o 2003 tendr�s n a�os.
			Menu:
			0.-Salir
			1.- Modificar datos
			2.-Edad actual   
			3.-Edad en el a�o dado   
			 */
			System.out.print("Introduce tu nombre: "); String nombre = in.readLine();
			System.out.print("Introduce tu a�o de nacimiento: "); int anyo = Integer.parseInt(in.readLine());
			
			CEdades persona = new CEdades(nombre, anyo);
			
			int menu = 1;
			while(menu != 0){
				System.out.println("0. Salir\n"
						+ "1. Modificar datos\n"
						+ "2. Edad actual\n"
						+ "3. Edad en dado a�o");
				menu = Integer.parseInt(in.readLine());
				switch(menu){
					case 1: 	System.out.print("Introduce tu nombre: "); persona.setNombre(in.readLine());
								System.out.print("Introduce tu a�o de nacimiento: "); persona.setNacimiento(Integer.parseInt(in.readLine()));
								break;
					case 2: 	persona.verEdadActual();
								break;
					case 3:		System.out.print("Que a�o quieres consultar? "); persona.verEdadTiempo(Integer.parseInt(in.readLine()));
								break;
				}
			}
		}catch(Exception e){

		}
	}
}
