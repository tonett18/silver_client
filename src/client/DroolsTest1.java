package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
	
	class Service extends Thread {
		Socket socket;
		BufferedReader entry;
		PrintStream output;

		Service(Socket socket) {
			this.socket = socket;
			try {
				entry = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				output = new PrintStream(socket.getOutputStream());
				this.start();
				
			}
			catch(IOException exc) {
				try {
					socket.close();
				}
				catch(IOException e) { 
					e.printStackTrace();
				}
			}
		}

		public void run() {
			String texte;


			try {
				texte = entry.readLine();
				while(!(texte = entry.readLine()).equals("+")) 
	                               
				System.out.println("ECHO = " + texte);
				output.close();
				entry.close();
				socket.close();
			}
			catch(IOException e) { 
				e.printStackTrace();
			}
		}
	}
class DroolsTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket socketserver ;
		Socket socketduserveur ;
		try {
			socketserver = new ServerSocket(2001);
			System.out.println("Le serveur est à l'écoute du port "+socketserver.getLocalPort());
			while (true){
				socketduserveur = socketserver.accept();
				new Service(socketduserveur);

			
			} 
		}
		/** catch (Throwable t) {
		 t.printStackTrace();
		 } 
		*/catch (IOException e) {
            e.printStackTrace();
        }
	}

}
