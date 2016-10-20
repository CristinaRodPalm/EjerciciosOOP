package CuadradoMagico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuadradoMagico {
	static int cuadrado[][];
	static int n = 0;
	public static void main (String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int menu = -1;
		while(menu != 0){
			System.out.println("Menu\n"
					+ "0. Salir\n"
					+ "1. Pedir n \n"
					+ "2. Ver cuadrado mágico");
			menu = Integer.parseInt(in.readLine());
			switch(menu){
			case 1: System.out.print("Introduce el tamaño del cuadrado: ");
					try{ n = Integer.parseInt(in.readLine()); } catch (IOException e) {}
					esImpar();
					break;
			case 2: 	llenar(); 
					break;
			}
		}
		
		llenar();
	}
	
	public static void llenar(){
		cuadrado[0][n/2] = 1;
		int i = 0; int j = n/2;
		for(int k = 2; k <= n*n; k++){
			i--; j++;
			if(i < 0) i = n-1;
			if(j > n-1) j = 0;
			if(cuadrado[i][j] != 0){
				i = i + 2; j--;
				if(i > n) i = i - n;
				if (j < 0) j = j + n;
			}
			cuadrado[i][j] = k;
			mostrar();
			System.out.println("\n");
		}
		
	}
	public static void esImpar(){
		if(n%2 == 0){
			System.out.println("El número debe ser impar");
		}else{
			cuadrado = new int[n][n];
		}
	}
	public static void mostrar(){
		for(int k = 0; k < n; k++){
			for(int h = 0; h < n; h++){
				System.out.print(cuadrado[k][h]+"\t");
			}
			System.out.println("");
		}
	}
	
	
}
