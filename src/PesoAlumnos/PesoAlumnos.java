package PesoAlumnos;

import java.io.*;

public class PesoAlumnos {
	static int peso[] = new int[91]; //de 10 a 100 kg
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main (String [] args) throws IOException{
		int menu = 1;		
		int numero = lineasFichero();
		
		rellenarHistograma();

		while(menu != 0){
			System.out.println("Menu:\n"
					+ "0. Salir\n"
					+ "1. Ver histograma\n"
					+ "2. Modificar histograma con valores aleatorios");
			try{
				menu = Integer.parseInt(in.readLine());
			}catch(Exception e){}
			switch(menu){
				case 1: 	verHistograma();
							break;
				case 2: 	modificarHistograma(numero);
							break; 
			}
		}
	}
	
		public static void verHistograma() {

			System.out.println("Peso \t\t\t Número de alumnos");
			for(int i = 0; i < 91 ; i++){
				if(peso[i] != 0){ 
					System.out.print((i+10)+"\t\t\t\t");
					for(int j = 0; j < peso[i]; j++){
						System.out.print("*");
					}
					System.out.println("");
				}
			}
		}

		//OPCIÓN A
		/*public static void rellenarHistograma(){
			for(int i = 0; i < 10; i++){
				System.out.println("Peso del alumno "+(i+1));
				try{
					peso[Integer.parseInt(in.readLine())-10]++;
				}catch (Exception e){}
			}
		}
		public static void modificarHistograma() {
			for(int i = 0; i < 91; i++){
				peso[i] = 0;
			}
			for(int i = 0; i < 10; i++){
				int random;
				do{
					random = (int)(Math.random() * 91) + 0;
				}while(random < 10);
				peso[random]++;
			}
		}*/

		
		//OPCIÓN B
		/*public static void rellenarHistograma(){
			for(int i = 0; i < 10; i++){
				int random;
				do{
					random = (int)(Math.random() * 91) + 0;
				}while(random < 10);
				peso[random]++;
			}
		}
		public static void modificarHistograma() {
			for(int i = 0; i < 91; i++){
				peso[i] = 0;
			}
			for(int i = 0; i < 10; i++){
				int random;
				do{
					random = (int)(Math.random() * 91) + 0;
				}while(random < 10);
				peso[random]++;
			}
		}*/
		
		//OPCIÓN C
		public static int rellenarHistograma(){
			int numero = 0;
			try{
				//abrir el fichero
				FileReader lector = new FileReader("C:/Users/User/workspace/EjerciciosOOP/src/PesoAlumnos/histograma.txt");
				//crear el lector del fichero
				BufferedReader br = new BufferedReader(lector);
				//leer mensaje linea a linea
				String linea;
				//mientrasnumero el contenido de la linea no sea nulo...
				while((linea = br.readLine()) != null){
					int posicion = Integer.parseInt(linea) - 10;
					peso[posicion]++;
					numero++;
				}
				//cerrar el fichero
				lector.close();
			}catch(Exception e){ 
				e.printStackTrace(); 
			}
			return numero;
		}
		
		public static void modificarHistograma(int num) {
			for(int i = 0; i < 91; i++){
				peso[i] = 0;
			}
			for(int i = 0; i < num; i++){
				int random = 0;
				while(random < 10){
					random = (int)(Math.random() * 91) + 0;
				}
				peso[random]++;
			}
		}

		public static int lineasFichero() throws IOException{
			int numero = 0;
			//abrir el fichero
			FileReader lector = new FileReader("C:/Users/User/workspace/EjerciciosOOP/src/PesoAlumnos/histograma.txt");
			//crear el lector del fichero
			BufferedReader br = new BufferedReader(lector);
			//leer mensaje linea a linea
			String linea;
			//mientrasnumero el contenido de la linea no sea nulo...
			while((linea = br.readLine()) != null){
				numero++;
			}
			return numero;
		}
}