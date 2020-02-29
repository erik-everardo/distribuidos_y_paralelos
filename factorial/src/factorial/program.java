package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class program {
	public static void main (String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.print("Factorial de: ");
		System.out.println(factorial(escaner.nextLong()));
	}
	
	public static BigInteger factorial(long n) {
		BigInteger res = BigInteger.valueOf(1);
		
		long inicio = System.currentTimeMillis();
		for (long i=1; i<=n; i++) {
			res = res.multiply(BigInteger.valueOf(i));
			//System.out.println(res);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución: " + (fin-inicio) + " ms");
		return BigInteger.valueOf(0);
	}
}
