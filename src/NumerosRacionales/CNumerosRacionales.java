package NumerosRacionales;

public class CNumerosRacionales {
	private int numerador;
	private int denominador;
	
	public CNumerosRacionales(){}
	public CNumerosRacionales(int numerador, int denominador){
		if(denominador != 0){
			this.setNumerador(numerador);
			this.setDenominador(denominador);
		}else{
			System.out.println("Denominador = 0, no se puede construir la función");
		}
	}
	
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public void visualizarDatos(){
		System.out.println(numerador+"/"+denominador);
	}
	
	public CNumerosRacionales multiplicar (CNumerosRacionales r){
		CNumerosRacionales res = new CNumerosRacionales();
		res.numerador = this.numerador * r.numerador;
		res.denominador = this.denominador  * r.denominador;
		return res;
	}
	public CNumerosRacionales dividir (CNumerosRacionales r){
		CNumerosRacionales res = new CNumerosRacionales();
		res.numerador = this.numerador * r.denominador;
		res.denominador = this.denominador * r.numerador;
		return res;
	}
	public CNumerosRacionales sumar (CNumerosRacionales r){
		CNumerosRacionales res = new CNumerosRacionales();
		res.numerador = (this.denominador * r.numerador)+(this.numerador * r.denominador);
		res.denominador = this.denominador * r.denominador;
		return res;
	}
	public CNumerosRacionales restar (CNumerosRacionales r){
		CNumerosRacionales res = new CNumerosRacionales();
		res.numerador = (this.numerador * r.denominador)-(this.denominador * r.numerador);
		res.denominador = this.denominador * r.denominador;
		return res;
	}

	public CNumerosRacionales simplificar(){
		if(numerador > denominador){
			for (int i = 1; i <= denominador ; i++){
				if ((numerador % i == 0) && (denominador % i == 0)){
					numerador /= i;
					denominador /= i;
				}
			}		
		}else{
			for (int i = 1; i <= numerador; i++){
				if ((numerador % i == 0) && (denominador % i == 0)){
					numerador /= i;
					denominador /= i;
				}
			}
		}

		CNumerosRacionales simplificada = new CNumerosRacionales(numerador, denominador);
		return simplificada;
	}
	
}
