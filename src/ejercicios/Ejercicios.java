package ejercicios;

import java.util.Arrays;

public class Ejercicios {
	//----------------------ACTIVIDAD: Desglosar una cantidad en billetes y monedas
	public int[]desgloseMoneda(int cantidad) {
		int[]monedas= {500,200,100,50,20,10,5,2,1};
		int[]resultado = new int[monedas.length];
		for (int i = 0; i < monedas.length; i++) {
			while(cantidad / monedas[i] != 0){
				resultado[i] = cantidad/monedas[i];
				cantidad = cantidad % monedas[i];
			}
		}
		return resultado;	
	}
	
	
	/* ---------------------------ACTIVIDAD: Listar desgloseMoneda		13/11/2018---------
	 * Esta actividad se realizará usando el método anterior "desgloseMoneda" para obtener una lista 
	 * del número de billetes o monedas utilizados.
	*/
	
	public void listaDesgloseMoneda(int cantidad){
		int[]monedas= {500,200,100,50,20,10,5,2,1};
		for (int i = 0; i < monedas.length; i++) {
			int[] resultado = desgloseMoneda(2850);
			if (resultado[i] != 0){
				System.out.println(monedas[i] + "€ -->" + resultado[i]);
			}
		}
	}
	
	// ACTIVIDAD DEL PROFESOR (ACTIVIDAD: Listar desgloseMoneda
/*	public int[]listaDesgloseMoneda(int cantidad) {
		int[]monedas= {500,200,100,50,20,10,5,2,1};
		int[]resultado =desgloseMoneda(cantidad);
		for (int i = 0; i < resultado.length; i++) {
			if(resultado[i]!=0) {
				System.out.println(monedas[i]+ " ->" + resultado[i]);
			}
			
		}
		return resultado;
	}

*/


/*
	// Actividad: Pasar una lista de números desordenados y mostrarlos ordenados
	public void ordenarArray(int [] numeros) {
		int numCompara = numeros[0];
		for (int i = 0; i < numeros.length-1; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[i]>numeros[j]) {
					numCompara = numeros[i];
					numeros[i]= numeros[j];
					numeros[j]= numCompara;	
				}
			}
		}
	}
*/
	
	
	//Ordenar un array de cadenas  14/11/2018
/*	public void ordenarCadena(String [] cadenas) {
		for (int i = 0; i < cadenas.length-1; i++) {
			for (int j = 0; j < cadenas.length; j++) {
				if(cadenas[i].compareTo(cadenas[j]) >0) {  // ENTENDER LINEA
					String comparador = cadenas[i];
					cadenas[i]= cadenas[j];
					cadenas[j]= comparador;	
					
				}
			} 
		}
	}*/
	
}
