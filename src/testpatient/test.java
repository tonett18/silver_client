package testpatient;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import patientsimple.PatientData;

public class test {
	
	// Create the data of the patient
	static PatientData readPatient(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the identier of the patient");
		int idpatient=sc.nextInt();
		System.out.println("Enter the weight of the patient");
		int weight=sc.nextInt();
		System.out.println("Enter the blood pressure of the patient");
		int bloodPressure=sc.nextInt();
		System.out.println("Enter the date of the measures");
		String dateMeasure=sc.next();
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
		 
		try {
	 
			// convert aPatient object to json string, and save to a file
			mapper.writeValue(new File("c:\\aPatient.json"), aPatient);
	 
			// display to console
			System.out.println(mapper.writeValueAsString( aPatient));
	 
		}  
		catch (IOException e) {
	 
			e.printStackTrace();
	 
		}
	 
	  }

		

	}


