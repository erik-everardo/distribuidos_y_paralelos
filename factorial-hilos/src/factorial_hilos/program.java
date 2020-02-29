package factorial_hilos;

import java.math.BigInteger;

public class program {
	public static void main(String[] args) throws InterruptedException {
		factorial hilo1 = new factorial(1,20000);
		factorial hilo2 = new factorial(20001,40000);
		factorial hilo3 = new factorial(40001,60000);
		factorial hilo4 = new factorial(60001,80000);
		
		long inicio = System.currentTimeMillis();
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		
		while (hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive()) {
		}
		long fin = System.currentTimeMillis();
		BigInteger resultado= BigInteger.valueOf(1);
		resultado = resultado.multiply(hilo1.resultado.multiply(hilo2.resultado.multiply(hilo3.resultado.multiply(hilo4.resultado))));
		//System.out.println(resultado);
		
		System.out.println("Tiempo de ejecución: " + (fin-inicio) + " ms");
		
	}
}
