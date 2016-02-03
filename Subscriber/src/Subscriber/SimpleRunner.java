package Subscriber;

import Time.Time;
public class SimpleRunner implements Runnable
{

	@Override
	public void run() 
	{
		while(true)
		{
			Time.getIstance().temp();
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}
