package Ficheros;

import java.io.*;

public class LecturaFicheros {
	static String ruta = "C:/Users/User/workspace/Ejercicios_OOP/src/Traductor/Palabras.txt";
	public static void main(String[] args) {

		String mensajeEscribir = "Mensaje que se escribira en el fichero";
		String mensajeLeido = "";

		//ESCRIBIR
		try{
			//abrir el fichero
			FileWriter fichero = new FileWriter(ruta);
			//escribir en el fichero
			fichero.write(mensajeEscribir);
			//cerrar el fichero
			fichero.close();
		}catch(Exception e){
			e.printStackTrace();
		}


		//LEER
		try{
			//abrir el fichero
			FileReader lector = new FileReader(ruta);
			BufferedReader br = new BufferedReader(lector);
			//leer mensaje
			String linea;
			while((linea = br.readLine()) != null){
				System.out.println(linea);
			}
			lector.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//ver si ha funcionado
		//System.out.println("El mensaje guardado es "+mensajeLeido);
	}
}