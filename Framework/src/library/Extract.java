package library;

public class Extract extends Extraction
{
	
	public Extract()
	{
		
	}
	public Extract(long id_ECU, long id_data, long data) 
	{
		super(id_ECU,id_data,data);
	}
	
	public Extract information_data(long address,long buff[])
	{
		Information inf[];
		Extract ex = null;
		inf = Database.getIstance().insert_information();
		long id = address >> 8;
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
					long id_ec = address & 255;
					int num_byte = inf[i].getByte_info();
					long data = buff[num_byte];
					ex = new Extract(id_ec,inf[i].getId_information(),data);
					break;
				}
			}
		}
		return ex;
	}
	
}
