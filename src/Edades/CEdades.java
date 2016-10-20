package Edades;

public class CEdades {
	private String nombre;
	private int nacimiento;

	public CEdades (String nombre, int nacimiento){
		this.setNacimiento(nacimiento);
		this.setNombre(nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public void verEdadActual(){
		int edad = 2015 - nacimiento;
		System.out.println("Hola "+nombre+", actualmente (2015) tienes "+edad+" años");
	}
	
	public void verEdadTiempo(int anyo){
		int edad = anyo - nacimiento;
		System.out.println("Hola "+nombre+", en el año "+anyo+" tendrás "+edad+" años");
	}
}
