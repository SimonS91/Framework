package library;

public abstract class Extraction 
{
	long id_ECU;
	long id_data;
	long data;
	
	
	public Extraction(long id_ECU, long id_data, long data) {
		this.id_ECU = id_ECU;
		this.id_data = id_data;
		this.data = data;
	}
	
	public Extraction()
	{
		
	}
	public long getId_ECU() {
		return id_ECU;
	}
	public void setId_ECU(long id_ECU) {
		this.id_ECU = id_ECU;
	}
	public long getId_data() {
		return id_data;
	}
	public void setId_data(long id_data) {
		this.id_data = id_data;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	public abstract Extraction information_data(long address,long buff[]);
	
}
