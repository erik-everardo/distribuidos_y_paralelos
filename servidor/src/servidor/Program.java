package servidor;

public class Program {
	public static void main(String[] args) throws Exception {
		
	// probando clase
		Servidor server = new Servidor(4765);
		server.start();
	}
}
