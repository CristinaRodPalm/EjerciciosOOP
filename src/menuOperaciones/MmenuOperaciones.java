package menuOperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MmenuOperaciones {
	public static void main (String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Introduce el operando 1: ");
		int num1 = Integer.parseInt(in.readLine());
		System.out.print("Introduce el operando 2: ");
		int num2 = Integer.parseInt(in.readLine());
		
		CmenuOperaciones auxiliar = new CmenuOperaciones(num1, num2);
		
		int opcion = 1;
		
		while(opcion != 0){
			opcion = auxiliar.verMenu();
			switch(opcion){
				case 1: auxiliar.sumar(); break;
				case 2: auxiliar.restar(); break;
				case 3: auxiliar.multiplicar(); break;
				case 4: auxiliar.dividir(); break;
			}
		}
		
		
	}
}
