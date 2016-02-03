package Time;

public class Time
{
	private static Time istance;
	private int time;
	
	public static Time getIstance()
	{
		if(istance == null)
		{
			istance = new Time();
		}
		return istance;
	}
	public void temp()
	{
		time++;
	}
	public int getTempActual()
	{
		return time;
	}
}
