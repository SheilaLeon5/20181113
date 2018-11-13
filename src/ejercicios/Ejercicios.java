package ejercicios;


public class Ejercicios {
	/* CORREGIR	
	public int[]desgloseMoneda(int cantidad) {
		int[]monedas= {500,200,100,50,20,10,5,2,1};
		int[]resultado = new int[monedas.length];
		for (int i = 0; i < monedas.length; i++) {
			while(cantidad / monedas[i] != 0){
				resultado[i] += 1;
				cantidad = cantidad % monedas[i];
			}
		}
		return resultado;	
	}
	

public class Ejercicios {
	public int[]desgloseMoneda(int cantidad) {
		int[]monedas= {500,200,100,50,20,10,5,2,1};
		int[]resultado = new int[monedas.length];
		int indice=0;
			while(cantidad % monedas[indice] != 0){
				resultado[indice] = cantidad / monedas[indice];
				cantidad = cantidad % monedas[indice];
				indice++;
			}

		return resultado;	
	}

	public int[]listaDesgloseMoneda(int cantidad) {
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



	
	
	
	// Actividad: Pasar una lista de números desordenados y mostrarlos ordenados
	public void ordenarArray(int [] numeros) {
		int numCompara = numeros[0];
		for (int i = 0; i < numeros.length-1; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[i]>numeros[j]) {
					numCompara = numeros[i];
					numeros[i]= numeros[j];
					numeros[j]= numeros[i];	
				}
			}
		}
	}
	
	
	
	
	//Ordenar un array de cadenas
	
}
