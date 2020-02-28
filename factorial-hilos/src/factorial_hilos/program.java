package factorial_hilos;

import java.math.BigInteger;

public class program {
	public static boolean threads[] = new boolean[] {
			false,false,false,false
	};
	public static void main(String[] args) throws InterruptedException {
		factorial hilo1 = new factorial(1,3,0);
		factorial hilo2 = new factorial(4,5,1);
		factorial hilo3 = new factorial(6,7,2);
		factorial hilo4 = new factorial(8,9,3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		while (true) {
			if (threads[0] && threads[1] && threads[2] && threads[3]) {
				BigInteger resultado= BigInteger.valueOf(1);
				resultado = resultado.multiply(hilo1.resultado.multiply(hilo2.resultado.multiply(hilo3.resultado.multiply(hilo4.resultado))));
				System.out.println(resultado);
			}
		}
		
	}
}
