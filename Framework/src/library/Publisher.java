package library;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;

public class Publisher 
{
	MqttClient client;
	Receive receive;
	Payload pay;
	public Publisher() {
		 
	 }
	public void publish()
	{
		try
		{
			receive = new Receive();
			for(int i=0;i<18;i++)
			{
				pay = receive.send_data(i);
				client = new MqttClient("tcp://test.mosquitto.org:1883", "pahomqttpublish1",new MemoryPersistence());
				final MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
				MqttMessage message = new MqttMessage();
				String payload = "Id ECU:"+pay.getId_ECU()+":"+"Information:"+pay.getId_ECU()+":"+"Dato:"+pay.getData();
				message.setPayload(payload.getBytes());	
				mqttConnectOptions.setWill("pahomqttpublish1",payload.getBytes(),0,true);
				client.connect(mqttConnectOptions);
				if(client.isConnected())
				{
					System.out.println("messaggio inviato");
					client.publish("pahodemo/test", payload.getBytes(), 0, true);
				}
				if(i == 17)
				{
					i = -1;
				}
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}catch(MqttException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		new Publisher().publish();
	}
}
