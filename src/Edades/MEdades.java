package Edades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MEdades {
	public static void main (String [] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			/*
			2. Realizar un programa que pregunte el nombre y el año de nacimiento y dé como resultado: 

			Hola nombre, en el año 2003 tendrás n años.
			Menu:
			0.-Salir
			1.- Modificar datos
			2.-Edad actual   
			3.-Edad en el año dado   
			 */
			System.out.print("Introduce tu nombre: "); String nombre = in.readLine();
			System.out.print("Introduce tu año de nacimiento: "); int anyo = Integer.parseInt(in.readLine());
			
			CEdades persona = new CEdades(nombre, anyo);
			
			int menu = 1;
			while(menu != 0){
				System.out.println("0. Salir\n"
						+ "1. Modificar datos\n"
						+ "2. Edad actual\n"
						+ "3. Edad en dado año");
				menu = Integer.parseInt(in.readLine());
				switch(menu){
					case 1: 	System.out.print("Introduce tu nombre: "); persona.setNombre(in.readLine());
								System.out.print("Introduce tu año de nacimiento: "); persona.setNacimiento(Integer.parseInt(in.readLine()));
								break;
					case 2: 	persona.verEdadActual();
								break;
					case 3:		System.out.print("Que año quieres consultar? "); persona.verEdadTiempo(Integer.parseInt(in.readLine()));
								break;
				}
			}
		}catch(Exception e){

		}
	}
}
