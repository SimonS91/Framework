package Time;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Observable;

public class Utility extends Observable
{
	private static Utility instance;
	
	public static Utility getInstance()
	{
		if(instance == null)
			instance = new Utility();
		return instance;
	}
	public void insert(long temp)
	{
		setChanged();
		notifyObservers(temp);
	}
}
