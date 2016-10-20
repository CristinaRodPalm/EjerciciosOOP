package menuOperaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CmenuOperaciones {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	int opcion;
	
	private static int num1;
	private static int num2;
	
	public CmenuOperaciones (){
		
	}
	public CmenuOperaciones(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int verMenu(){
			System.out.println("0. Salir\n"
					+ "1. Sumar\n"
					+ "2. Restar\n"
					+ "3. Multiplicar\n"
					+ "4. Dividir");
		
		try{ opcion = Integer.parseInt(in.readLine()); }catch(Exception e){}
		return opcion;
	}
	
	public static void multiplicar(){
		System.out.println("Multiplicación: "+num1*num2);
	}
	public static void dividir(){
		System.out.println("División: "+num1/num2);
	}
	public static void sumar(){
		System.out.println("Suma: "+(num1+num2));
	}
	public static void restar(){
		System.out.println("Resta: "+(num1-num2));
	}
}
