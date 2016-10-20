package Fecha;

public class CFecha {
	private int dia;
	private int mes;
	private int anyo;

	private int diaAux;
	private int mesAux;
	private int anyoAux;

	//Constructor por defecto
	public CFecha() {
		dia = 1;
		mes = 1;
		anyo = 2000;
	}

	//Constructor con parametros (controlar datos)
	public CFecha(int dia, int mes, int anyo) {
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:  if (dia > 30) {
			dia = 1;
			mes++;
		}
		break;

		case 2:   if (dia > 28) {
			if (dia == 29) {
				dia = 1;
				mes = 3;
			}
			if (anyo % 4 != 0) {
				dia = 1;
				mes = 3;
			}
		}
		break;
		case 12:  if (dia > 31) {
			dia = 1;
			mes = 1;
			anyo++;
		}
		}
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public void verFecha() {
		System.out.println(dia + "/" + mes + "/" + anyo);
	}

	//método sumar días
	public void sumarDias(int cantidad) {
		diaAux = dia;
		mesAux = mes;	
		anyoAux = anyo;

		while (cantidad > 0) {
			if (cantidad > 0) {
				switch (mesAux) {
					case 4:
					case 6:
					case 9:
					case 11:  	if (diaAux + cantidad > 30) {
									cantidad = cantidad - (31 - diaAux);
									mesAux++;
									diaAux = 1;
									break;
								}else{
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
	
					case 2:   	if (cantidad + diaAux > 28) {
									if (anyoAux % 4 == 0) {
										cantidad = cantidad - (30 - diaAux);
										diaAux = 1;
										mesAux++;
										break;
									}
									if (anyoAux % 4 != 0) {
										cantidad = cantidad - (29 - diaAux);
										diaAux = 1;
										mesAux++;
										break;
									}
								}else{
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:  	if (cantidad + diaAux > 31) {
									cantidad = cantidad - (32 - diaAux);
									diaAux = 1;
									mesAux++;
									break;
								} else {
									diaAux = cantidad + diaAux;
									cantidad = 0;
									break;
								}
	
					case 12:  	if (cantidad + diaAux > 31) {
									cantidad = cantidad - (32 - diaAux);
									diaAux = 1;
									mesAux = 1;
									anyoAux++;
									break;
								} else {
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}	
				}//fin switch
			}//fin if
		}//fin while
		System.out.println(diaAux + "/" + mesAux + "/" + anyoAux);
	}

	//método restar días
	public void restarDias(int cantidad) {
		diaAux = dia;
		mesAux = mes;	
		anyoAux = anyo;

		while (cantidad < 0) {
			if (cantidad < 0) {
				switch (mesAux) {

					case 2:		if (diaAux + cantidad < 1) {
									cantidad = cantidad + diaAux;
									mesAux--;
									diaAux = 31;
									break;
								}else{
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
					case 4:
					case 6:
					case 9:
					case 11:  	if (diaAux + cantidad < 1) {
									cantidad = cantidad + diaAux;
									mesAux--;
									diaAux = 31;
									break;
								} else {
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
	
					case 3:   	if (diaAux + cantidad < 1) {
									if (anyoAux % 4 == 0) {
										cantidad = cantidad + diaAux;
										diaAux = 29;
										mesAux--;
										break;
									}
									if (anyoAux % 4 != 0) {
										cantidad = cantidad + diaAux;
										diaAux = 28;
										mesAux--;
										break;
									}
								}else{
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
	
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:  	if (diaAux + cantidad < 1) {
									cantidad = cantidad + diaAux;
									diaAux = 30;
									mesAux--;
									break;
								}else{
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
	
					case 1:   	if (diaAux + cantidad < 1) {
									cantidad = cantidad + diaAux;
									diaAux = 31;
									mesAux = 12;
									anyoAux--;
									break;
								}else{
									diaAux = diaAux + cantidad;
									cantidad = 0;
									break;
								}
				}//fin switch
			}//fin if
		}//fin while
		System.out.println(diaAux + "/" + mesAux + "/" + anyoAux);
	}//fin metodo

}
