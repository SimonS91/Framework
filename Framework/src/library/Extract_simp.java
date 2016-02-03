package library;

public class Extract_simp extends Extraction
{
	

	public Extract_simp(long id_ECU, long id_data, long data) {
		super(id_ECU,id_data,data);
	}
	public Extract_simp()
	{
		
	}
	public Extract_simp information_data(long address,long buffer[])
	{
		Information inf[];
		Extract_simp ex = null;
		inf = Database.getIstance().insert_information();
		long id =address;
		id = id & 255;
		long id_d = ECU.getIstance().getId_ECU();
		if(id == id_d)
		{
			for(int i=0;i<Database.getIstance().num_element;i++)
			{
				long id_sou = address;
				long id_db = inf[i].getAddress();
				if(id_db == id_sou)
				{
					
					int var = inf[i].getByte_info();
				    long data = buffer[var];
					ex = new Extract_simp(buffer[0],inf[i].getId_information(),data);
					break;
				}
			}
		}
		return ex;
	}
	
}
