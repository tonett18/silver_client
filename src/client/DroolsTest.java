package client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DroolsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket socketserver ;
		Socket socketduserveur ;
		try {
		socketserver = new ServerSocket(2015);
		System.out.println("Le serveur est à l'écoute du port "+socketserver.getLocalPort());
		socketduserveur = socketserver.accept(); 
		System.out.println("Je me suis connecté !");
		 
		socketduserveur.close();
		 socketserver.close();
		 } /** catch (Throwable t) {
		 t.printStackTrace();
		 } 
		*/catch (IOException e) {
            e.printStackTrace();
        }
	}

}
