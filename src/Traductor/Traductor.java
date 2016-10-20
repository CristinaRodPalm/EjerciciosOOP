package Traductor;

import java.io.*;

public class Traductor {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static String [][] palabra = new String [50][2];
	static int contador;
	static File archivo = new File("C:/Users/User/workspace/EjerciciosOOP/src/Traductor/Palabras.txt");
	
	public static void main (String [] args) throws IOException{
		leerArchivo();
		int menu = 1;
		while (menu != 0){
			System.out.println("Menú: \n"
					+ "0. Salir\n"
					+ "1. Español - Inglés\n"
					+ "2. Inglés - Español\n"
					+ "3. Mostrar matriz\n");
			menu = Integer.parseInt(in.readLine());
			switch(menu){
				case 1:		espAing();
							break;
				case 2:		ingAesp();
							break;
				case 3: 	mostrarMatriz();
			}
		}
	}
	
	private static void leerArchivo() throws IOException{
		String linea; contador = 0;
		BufferedReader lector = new BufferedReader(new FileReader(archivo.getAbsoluteFile()));
		while((linea = lector.readLine()) != null){
			String [] split = linea.split(", ");
			palabra[contador][0] = split[0];
			palabra[contador][1] = split[1];
			contador++;
		}
		lector.close();
	}
	private static void escribirArchivo() throws IOException{
		BufferedWriter puntero = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile()));
		
		for(int j = 0; j < contador; j++){
				puntero.write(palabra[j][0]+", "+palabra[j][1]);
				puntero.newLine();
		}
		puntero.close();
	}
	private static void mostrarMatriz() throws IOException{
		for(int i = 0; i < contador; i++){
			System.out.println("Español: "+palabra[i][0]);

			System.out.println("Inglés: "+palabra[i][1]);
		}
	}
	
	private static void espAing() throws IOException{
		System.out.print("Introduce la palabra que quieres traducir: ");
		String esp = in.readLine().toLowerCase();
		boolean existe = false;
		for(int i = 0; i < contador; i++){
			if(palabra[i][0].equals(esp)){
				System.out.println(esp+" es "+palabra[i][1]); 
				existe = true;
				break;
			}		
		}
		if(existe == false){
			int j = contador; int k = contador;
			palabra[j++][0] = esp;
			System.out.print("Introduce la traduccion de "+esp+": ");
			palabra[k++][1] = in.readLine().toLowerCase();
			contador++;
		}
		escribirArchivo();
	}
	private static void ingAesp() throws IOException{
		System.out.print("Introduce la palabra que quieres traducir: ");
		String ing = in.readLine().toLowerCase();
		boolean existe = false;
		for(int i = 0; i < contador; i++){
			if(palabra[i][1].equals(ing)){
				System.out.println(ing+" es "+palabra[i][0]); 
				existe = true;
				break;
			}		
		}
		if(existe == false){
			int j = contador; int k = contador;
			palabra[j++][1] = ing;
			System.out.print("Introduce la traduccion de "+ing+": ");
			palabra[k++][0] = in.readLine().toLowerCase();
			contador++;
		}
		escribirArchivo();
	}
}