package CadenaCaracteresRotada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CadenaCaracteres {
	static String prueba = "";
	static String aux = "";
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String [] args) throws IOException{
		int menu = 1;
	
		System.out.print("Introduce la palabra: ");
		prueba = in.readLine();
		
		while (menu != 0){
			System.out.println("\nMenú: \n"
					+ "0. Salir\n"
					+ "1. Modificar palabra\n"
					+ "2. Rotar derecha\n"
					+ "3. Rotar izquierda");
			menu = Integer.parseInt(in.readLine());
			switch(menu){
				case 1:		modificarCadena();
							break;
				case 2:		rotaDerecha(prueba);
							break;
				case 3: 	rotaIzquierda(prueba);
							break;
				
			}
		}
	}
	
	//OK
	public static void modificarCadena() throws IOException{
		System.out.print("Introduce la nueva palabra: ");
		prueba = in.readLine();
	}
	//OK
	//OK!
	public static void rotaDerecha(String palabra){
		System.out.println(palabra);
		for(int j = 0; j < palabra.length(); j++){
			aux = "";
			
			aux += palabra.charAt(palabra.length()-1);
			
			for(int i = 0; i < palabra.length()-1; i++){
				aux += palabra.charAt(i);
			}
			palabra = aux;
			System.out.println(aux);
		}
	}
	//OK
	public static void rotaIzquierda(String palabra){
		System.out.println(palabra);
		for(int j = 0; j < palabra.length(); j++){
			aux = "";
			
			for(int i = 1; i <= palabra.length()-1; i++){
				aux += palabra.charAt(i);
				//System.out.println(aux);
			}
			aux += palabra.charAt(0);
			palabra = aux;
			System.out.println(aux);
		}
	}
}








