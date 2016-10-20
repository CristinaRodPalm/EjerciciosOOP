package Esfera;

public class CEsfera {
	
	private double radio;
	
	public CEsfera(double radio){
		 this.setRadio(radio);
	}
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}


	public void calcularSuperficie (double radio){
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		System.out.println(superficie);
	}
	
	public void calcularVolumen (double radio){
		double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
		System.out.println(volumen);
	}

}
