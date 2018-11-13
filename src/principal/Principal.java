package principal;
import java.util.Arrays;

import ejercicios.Ejercicios;

public class Principal {
	public static void main(String[]args) {
		Ejercicios ejercicios= new Ejercicios();
		int monedas[] =ejercicios.desgloseMoneda(78);
		System.out.println(Arrays.toString(monedas));

	}
}
