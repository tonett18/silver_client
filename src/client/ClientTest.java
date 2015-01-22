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
			
		     socket = new Socket(InetAddress.getLocalHost(),10001);	
		     readerFile = new BufferedReader (new FileReader ("c:\\file.json"));
		     entry = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             output = new PrintStream(socket.getOutputStream());
	         while ((line = readerFile.readLine()) != null) output.println(line);
	         output.println("+");
	         System.out.println(entry.readLine()); 
	         output.close();
	         entry.close();
	         socket.close();
		}catch (FileNotFoundException e){
			
			System.out.println("Fichier introuvable");
		}
		catch (UnknownHostException e) {
			
			e.printStackTrace();
			System.out.println("Destinataire introuvable");
		}
		catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("entree-sotie introuvable");
		}
	
	}

}
