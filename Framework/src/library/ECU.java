package library;

public class ECU 
{
	private long id_ECU;
	private int num_elementi;
	private long address[];
	private static ECU instance;
	
	public ECU(long id_ECU, int num_elementi, long[] address) 
	{
		this.id_ECU = id_ECU;
		this.num_elementi = num_elementi;
		this.address = address;
	}
	public ECU()
	{
		
	}
	public long getId_ECU() {
		return id_ECU;
	}

	public void setId_ECU(long id_ECU) {
		this.id_ECU = id_ECU;
	}

	public int getNum_elementi() {
		return num_elementi;
	}

	public void setNum_elementi(int num_elementi) {
		this.num_elementi = num_elementi;
	}

	public long[] getAddress() {
		return address;
	}

	public void setAddress(long[] address) {
		this.address = address;
	}
	public static ECU getIstance()
	{
		if(instance == null)
		{
			instance = new ECU();
		}
		return instance;
	}
}
