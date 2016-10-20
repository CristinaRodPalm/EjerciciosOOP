package Esfera;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MEsfera {

	public static void main (String [] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int menu = 4;
			
			System.out.println("Introduce el radio de tu esfera: ");
			double radio = Double.parseDouble(in.readLine());
			CEsfera esfera = new CEsfera(radio);
			
			while(menu != 0){
				System.out.println("0. Salir\n"
						+ "1. Modificar esfera\n"
						+ "2. Calcular superfície\n"
						+ "3. Calcular volumen");
				menu = Integer.parseInt(in.readLine());
				switch(menu){
					case 1: 	System.out.println("Introduce el nuevo radio de la esfera: ");
								esfera.setRadio(Double.parseDouble(in.readLine()));
								break;
					case 2: 	System.out.print("Superfície: ");esfera.calcularSuperficie(radio);
								break;
					case 3:		System.out.print("Volumen: ");esfera.calcularVolumen(radio);
								break;
					
				}
			}

		}catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}
