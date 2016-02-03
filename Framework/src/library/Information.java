package library;

public class Information 
{
	long address;
	long id_information;
	int byte_info;
	long id_ECU;
	public Information(long address, long id_information, int byte_info, long id_ECU) {
		
		this.address = address;
		this.id_information = id_information;
		this.byte_info = byte_info;
		this.id_ECU = id_ECU;
	}
	public Information()
	{
		
	}
	public long getAddress() {
		return address;
	}
	public void setAddress(long address) {
		this.address = address;
	}
	public long getId_information() {
		return id_information;
	}
	public void setId_information(long id_information) {
		this.id_information = id_information;
	}
	public int getByte_info() {
		return byte_info;
	}
	public void setByte_info(int byte_info) {
		this.byte_info = byte_info;
	}
	public long getId_ECU() {
		return id_ECU;
	}
	public void setId_ECU(long id_ECU) {
		this.id_ECU = id_ECU;
	}
	
}
