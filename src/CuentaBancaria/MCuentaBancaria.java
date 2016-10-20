package CuentaBancaria;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MCuentaBancaria {
	public static void main (String [] args){
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    
			//valores constantes
			System.out.println("Cuenta bancaria con valores constantes: ");
			cCuentaBancaria cuenta1 = new cCuentaBancaria(100, "Francesc", "ARV21", 3);
			
			cuenta1.verDatos();
			cuenta1.ingreso(500);
			System.out.print("Ver saldo: ");cuenta1.verSaldo();
			cuenta1.reintegro(300);
			System.out.print("Ver saldo: ");cuenta1.verSaldo();
			System.out.print("Calculo interés: ");cuenta1.calculoInteres();
			
			
			//valores variables
			System.out.println("\n\nCuenta bancaria con valores variables (pedidos por teclado): ");
			System.out.println("Introduce el nombre del titular: ");
			cuenta1.setTitular(in.readLine());
			System.out.println("Introduce el saldo: ");
			cuenta1.setSaldo(Integer.parseInt(in.readLine()));
			
			
			//menu de opciones
			int menu = 0;
			while(menu <= 0 || menu < 6){
				System.out.println("Con menú de opciones: ");
				System.out.println("1. Ver los datos de tu cuenta\n"
									+ "2. Ingresar dinero\n"
									+ "3. Retirar dinero\n"
									+ "4. Ver saldo\n"
									+ "5. Calcular interés");
				
				menu = Integer.parseInt(in.readLine());
				
				switch(menu){
					case 1:		cuenta1.verDatos(); 
								break;
					case 2: 	System.out.print("Introduce la cantidad que quieras ingresar: ");
								cuenta1.ingreso(Double.parseDouble(in.readLine()));
								break;
					case 3: 	System.out.println("Introduce la cantidad que quieras retirar: ");
								cuenta1.reintegro(Double.parseDouble(in.readLine()));
								break;
					case 4:		cuenta1.verSaldo();
								break;
					case 5:		cuenta1.calculoInteres();
								break;
				}
			}
			
		}catch(Exception e){
			
		}
	}
}
