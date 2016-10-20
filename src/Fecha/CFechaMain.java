package Fecha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CFechaMain {
  public static void main(String[] args) {
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    try {
	
	      CFecha fecha = new CFecha();
	      int dia = 0, mes = 0, anyo = 0, menu = -1;
	
	      while (menu != 0) {
	    	System.out.println("");
	        System.out.print("1. Modificar fecha\n" +
	                          "2. Visualizar fecha\n" +
	                          "3. Ayer era...\n" +
	                          "4. Mañana es...\n" +
	                          "5. Sumar días\n" +
	                          "0.- Salir\n" +
	                          "Escoge la opción: ");
	
	        menu = Integer.parseInt(in.readLine());
	        System.out.println("");
	
	        switch (menu) {
	          case 1:   System.out.print("Introduce el dia: ");
	                      dia = (Integer.parseInt(in.readLine()));
	                    System.out.print("Introduce el mes: ");
	                      mes = (Integer.parseInt(in.readLine()));
	                    System.out.print("Introduce el año: ");
	                      anyo = (Integer.parseInt(in.readLine()));
	                    fecha = new CFecha(dia, mes, anyo);
	                    break;
	
	          case 2:   fecha.verFecha();
	                    break;
	
	          case 3:   fecha.restarDias(-1);
	                    break;
	
	          case 4:   fecha.sumarDias(1);
	                    break;
	
	          case 5:   System.out.print("Días a sumar: ");
	                    fecha.sumarDias(Integer.parseInt(in.readLine()));
	                    break;
	
	        }
	      }
	    } catch (IOException e) {
	      System.out.println("Error: "+e);
	   }
  }
}

