package NumerosRacionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MNumerosRacionales {
	public static void main (String [] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			CNumerosRacionales numeroAux = new CNumerosRacionales(4, 5);
			CNumerosRacionales simplificada = new CNumerosRacionales();
			
			System.out.println("Crear numero racional con denominador 0");
			CNumerosRacionales numeroPrueba = new CNumerosRacionales(2, 0);
			
			CNumerosRacionales numeroRacional1 = new CNumerosRacionales(2, 2);
			System.out.print("\nNumero racional creado: ");
			numeroRacional1.visualizarDatos();
			System.out.print("Numero racional para las operaciones: ");
			numeroAux.visualizarDatos();
			
			System.out.println("\nModificar racional creado: ");
			System.out.print("Introduce nuevo numerador: ");
			numeroRacional1.setNumerador(Integer.parseInt(in.readLine()));
			System.out.print("Introduce nuevo denominador: ");
			numeroRacional1.setDenominador(Integer.parseInt(in.readLine()));
			System.out.print("\nNumero racional modificado: ");
			numeroRacional1.visualizarDatos();
			
			System.out.print("\nSuma: ");
			CNumerosRacionales sumado = numeroRacional1.sumar(numeroAux);
			sumado.visualizarDatos();
			System.out.print("Simplificada: ");
			simplificada = sumado.simplificar(); simplificada.visualizarDatos();
			
			System.out.print("\nResta: ");
			
			CNumerosRacionales restado = numeroRacional1.restar(numeroAux);
			restado.visualizarDatos();
			System.out.print("Simplificada: ");
			simplificada = restado.simplificar(); simplificada.visualizarDatos();
			
			System.out.print("\nMultiplicacion: ");
			CNumerosRacionales multi = numeroRacional1.multiplicar(numeroAux);
			multi.visualizarDatos();
			System.out.print("Simplificada: ");
			simplificada = multi.simplificar(); simplificada.visualizarDatos();
			
			System.out.print("\nDivision: ");
			CNumerosRacionales dividido = numeroRacional1.dividir(numeroAux);
			dividido.visualizarDatos();
			System.out.print("Simplificada: ");
			simplificada = dividido.simplificar(); simplificada.visualizarDatos();
				
			System.out.println("");
			
			CNumerosRacionales fechaSimplificar = new CNumerosRacionales();
			System.out.println("Simplificar: ");
			System.out.print("Introduce el numerador: ");
			fechaSimplificar.setNumerador(Integer.parseInt(in.readLine()));
			System.out.print("Introduce el denominador: ");
			fechaSimplificar.setDenominador(Integer.parseInt(in.readLine()));
			System.out.print("Simplificada: ");
			simplificada = fechaSimplificar.simplificar(); fechaSimplificar.visualizarDatos();
			
		}catch(Exception e){

		}
	}
}
