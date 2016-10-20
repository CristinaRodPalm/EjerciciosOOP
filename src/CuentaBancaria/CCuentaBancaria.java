package CuentaBancaria;
/*
 * Clase formada por:
 * 	1. Datos miembros (dm) -> propiedades
 * 	2. Funciones miembros (fm) -> métodos
 * 	
 * 	Los objetos se crean con la definición de la clase (propiedades)
 * 
 * 		->dm <- x - ext
 * 	ok	|
 * 		<-fm <- - - ext
 */

class cCuentaBancaria{
	private double saldo;
	private	String titular;
	private	String num_cuenta;
	private double tipo_interes;
	
	//CONSTRUCTOR -> inicializar dm
	public cCuentaBancaria(){}
	public cCuentaBancaria(double saldo, String titular, String num_cuenta, double tipo_interes){
		this.setSaldo(saldo);
		this.setTitular(titular);
		this.setNumCuenta(num_cuenta);
		this.setTipoInteres(tipo_interes);
	}
	
	public void setNumCuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;		
	}
	public void setTipoInteres(double tipo_interes) {
		this.tipo_interes = tipo_interes;	
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public String getTitular(){
		return titular;
	}
	
	
	public void ingreso(double cantidad){
		if (cantidad > 0) saldo = saldo + cantidad;
	}
	
	public void reintegro(double cantidad){
		if (cantidad > 0){
			if (cantidad > saldo) System.out.println("No hay suficiente saldo");
			saldo -= cantidad; //saldo = saldo - cantidad;
		}
	}
	
	public void verSaldo(){
		System.out.println(saldo);
	}
	
	public void calculoInteres(){
		saldo += (tipo_interes / 100 ) * saldo;
		System.out.println(saldo);
	}
	
	public void verDatos(){
		System.out.println("Saldo: "+ saldo +", "
				+ "Titular: "+ titular +", "
						+ "Numero de cuenta: "+ num_cuenta +", "
								+ "Tipo de interés: "+ tipo_interes);
	}

}