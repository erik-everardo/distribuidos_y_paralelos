package servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Servidor {
	
	// port where server will receive request trough
	private int port;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket s;
	private ServerSocket ss;
	
	private boolean run;
	

	public Servidor(int port) {
		this.port = port;
	}
	
	public int getPort() {
		return port;
	}
	
	public void start() throws IOException{
		run = true;
		ois = null;
		oos = null;
		s = null;
		try {
			ss = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		System.out.println("Servidor iniciado");
		System.out.println("Detener manualmente");
			
		while(run) {
			try {
				s = ss.accept();
				
				// poner esto en interfaz grafica
				System.out.println("Conection from: " 
						+ s.getInetAddress());
					
				ois = new ObjectInputStream(s.getInputStream());
				oos = new ObjectOutputStream(s.getOutputStream());
					
				// recibir informacion y organizar
				ArrayList data = (ArrayList)ois.readObject();
				
				// sacar datos y organizarlos
				
			
					
			} catch(Exception ex) {
				ex.printStackTrace();
			} finally {
				if(ois != null) ois.close();
				if(s != null) s.close();
			}
		}
		System.out.println("Stopping thread");
	}
		
}
