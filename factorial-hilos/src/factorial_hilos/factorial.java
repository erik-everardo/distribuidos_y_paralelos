package factorial_hilos;

import java.math.BigInteger;

public class factorial extends Thread{
	private long desde, hasta;
	private int threadNum;
	public BigInteger resultado;
	public factorial(long desde,long hasta,int threadNum) {
		this.desde = desde;
		this.hasta = hasta;
		this.threadNum = threadNum;
	}
	public void run() {
		resultado = BigInteger.valueOf(1);
		for (long i=desde; i<=hasta; i++) {
			resultado = resultado.multiply(BigInteger.valueOf(i));
		}
		program.threads[threadNum] = true;
	}

}
