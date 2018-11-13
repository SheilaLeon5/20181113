package ejercicios;

public class Ejercicios {
	public int[]desgloseMoneda(int cantidad) {
		int[]monedas= {500,200,100,50,20,10,5,2,1};
		int[]resultado = new int[monedas.length];
		for (int i = 0; i < monedas.length; i++) {
			while(cantidad / monedas[i] != 0){
				resultado[i] = monedas[i];
				cantidad = cantidad % monedas[i];
			}
		}
		return resultado;	
	}
}
