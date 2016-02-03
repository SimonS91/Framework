package Parser;

public class Information 
{
	String id_ECU;
	String id_information;
	
	public Information(String id_ECU, String id_information) {
		this.id_ECU = id_ECU;
		this.id_information = id_information;
	}

	public String getId_ECU() {
		return id_ECU;
	}

	public void setId_ECU(String id_ECU) {
		this.id_ECU = id_ECU;
	}

	public String getId_information() {
		return id_information;
	}

	public void setId_information(String id_information) {
		this.id_information = id_information;
	}
}
