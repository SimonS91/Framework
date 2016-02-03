package library;

public class Payload 
{
	private long id_frame;
	private long information;
	private long id_ECU;
	private long data;
	public Payload(long id_frame, long information, long id_ECU, long data) 
	{
		this.id_frame = id_frame;
		this.information = information;
		this.id_ECU = id_ECU;
		this.data = data;
	}
	public long getId_frame() {
		return id_frame;
	}
	public void setId_frame(long id_frame) {
		this.id_frame = id_frame;
	}
	public long getInformation() {
		return information;
	}
	public void setInformation(long information) {
		this.information = information;
	}
	public long getId_ECU() {
		return id_ECU;
	}
	public void setId_ECU(long id_ECU) {
		this.id_ECU = id_ECU;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	
	
}
