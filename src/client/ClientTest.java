package client;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket;
		BufferedReader readerFile;
		BufferedReader entry;
		PrintStream output;
		String line;
		

		try {
			
		     socket = new Socket(InetAddress.getLocalHost(),2001);	
		     System.out.println("Demande de connexion");
		     readerFile = new BufferedReader (new FileReader ("c:\\file.json"));
		     entry = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             output = new PrintStream(socket.getOutputStream());
             System.out.println("Je ne suis pas encore dans la boucle");
	         while ((line = readerFile.readLine()) != null) output.print(line);
	         output.println("+");
	         System.out.println("Je suis dans la boucle");
	         System.out.println(entry.readLine()); 
	         System.out.println("Erreur");
	         output.close();
	         System.out.println("Erreur bis");
	         entry.close();
	         socket.close();
	         //System.out.println("Erreur ter");
		}catch (FileNotFoundException e){
			
			System.out.println("Fichier introuvable");
		}
		catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

}
