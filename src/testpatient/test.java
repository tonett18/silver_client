package testpatient;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import patientsimple.PatientData;

public class test {
	
	// Create the data of the patient
	public static PatientData readPatient(){
		Scanner sc = new Scanner(System.in);
		
		char reponse = 'O'; int idpatient = 0, weight = 0, bloodPressure = 0; String dateMeasure = "01-01-2010";
		while (reponse == 'O') {
			System.out.println("Enter the identier of the patient");
			idpatient=sc.nextInt();
			System.out.println("Enter the weight of the patient");
			weight=sc.nextInt();
			System.out.println("Enter the blood pressure of the patient");
			bloodPressure=sc.nextInt();
			System.out.println("Enter the date of the measures");
			dateMeasure=sc.next();
			System.out.println("Voulez-vous réessayer ? (O/N)");
			reponse = sc.next().charAt(0); 
		
		}
		
		PatientData newpatient=new PatientData(idpatient,weight,bloodPressure,dateMeasure);
		return newpatient;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a patient with these data patients
		PatientData aPatient=readPatient();
		//Display the data of the Patient
		aPatient.postdata();
		//Create a JSON format for the patient data
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("\n");
		 
		try {
	 
			// convert aPatient object to json string, and save to a file
			mapper.writeValue(new File("c:\\file.json"), aPatient);
			System.out.println("\n");
			 
	
			 
	 
			// display to console
			System.out.println(mapper.writeValueAsString( aPatient));
			System.out.println("\n");
	 
		}  
		catch (IOException e) {
			e.printStackTrace();
		}
	  }		
	}


