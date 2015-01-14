package patientsimple;

public class PatientData {
	
	//determine the identifier of patient
	private int idPatient;
	//determine the weight of patient
	private int weight;
	//determine the blood pressure of patient
	private int bloodPressure;
	//determine the date of the measures
	private String dateMeasure;
	
	public PatientData(int idPatient, int  weight,  int  bloodPressure, String dateMeasure) {
		this.idPatient = idPatient;
		this.weight = weight;
		this.bloodPressure = bloodPressure;
		this.dateMeasure = dateMeasure;
	}

	public int  getIdPatient() {
		return idPatient;
	}

	public int  getWeight() {
		return weight;
	}
	 
	public int  getBloodPressure() {
		return bloodPressure;
	}
	
	public String getDateMeasure() {
		return dateMeasure;
	}
	public void setIdPatient(int  idPatient) {
		this.idPatient =idPatient;
	}
	
	public void setWeight(int  weight) {
		this.weight = weight;
	}
	
	public void setBloodPressure(int bloodPressure){
		this.bloodPressure = bloodPressure;
	} 
	 
	public void setDateMeasure(String string) {
		this.dateMeasure= string;
	}
	
	public void postdata(){
		System.out.println("The patient's data are:");
		System.out.println("identifier:"+this.idPatient);
		System.out.println("weight:"+this.weight);
		System.out.println("bloodPressure:"+this.bloodPressure);
		System.out.println("date of measure:"+this.dateMeasure);
	}
	
}
