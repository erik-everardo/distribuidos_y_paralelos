package factorial_hilos;

import java.math.BigInteger;

public class factorial extends Thread{
	private long desde, hasta;
	public BigInteger resultado;
	public factorial(long desde,long hasta) {
		this.desde = desde;
		this.hasta = hasta;
	}
	public void run() {
		resultado = BigInteger.valueOf(1);
		for (long i=desde; i<=hasta; i++) {
			resultado = resultado.multiply(BigInteger.valueOf(i));
		}
	}

}
