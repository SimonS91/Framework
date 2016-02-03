package Parser;

public class Parser 
{
	public Parser()
	{
		
	}
	
	public Information parse(int id_ECU,int id_information)
	{
		switch(id_ECU)
		{
			case 0:
				switch(id_information)
				{
					case 0:
						Information inf = new Information("Engine Control Unit","Engine Temperature");
						return inf;
					case 1:
						Information inf1 = new Information("Engine Control Unit","Atmospheric Pressure");
						return inf1;
				}
				break;
		}
		return null;
	}
}
