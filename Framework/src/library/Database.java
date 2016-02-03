package library;

public class Database 
{
	public static int num_element = 2;
	private Information inf[];
	private static Database instance;
	
	public Database()
	{
		
	}
	public Information[] insert_information()
	{
		long address1 = 134217984;
		long id_information1 = 0;
		int num_byte1 = 7;
		long id_ECU1 = 0;
		long address2 = 513;
		long id_information2 = 1;
		int num_byte2 = 7;
		long id_ECU2 = 2;
		inf = new Information[num_element];
		inf[0] = new Information();
		inf[0].setAddress(address1);
		inf[0].setId_information(id_information1);
		inf[0].setByte_info(num_byte1);
		inf[0].setId_ECU(id_ECU1);
		inf[1] = new Information();
		inf[1].setAddress(address2);
		inf[1].setId_information(id_information2);
		inf[1].setId_ECU(id_ECU2);
		inf[1].setByte_info(num_byte2);
		return inf;
	}
	public static Database getIstance()
	{
		if(instance == null)
		{
			instance = new Database();
		}
		return instance;
	}
}
