package subscriber;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;


public class Subscriber implements MqttCallback
{
	MqttClient myClient;
	MqttConnectOptions connOpt;
	static final String broker = "tcp://localhost:1883";
	
	@Override
	public void connectionLost (Throwable t)
	{
		System.out.println("Connection Lost");
	}
	
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		String payload;
		String parts[];
		System.out.println("----------------------");
		System.out.println("|Topic: "+topic);
		payload = new String(message.getPayload());
		parts = payload.split(":");
		String id_ECU = parts[1];
		String id_information = parts[3];
		String data = parts[5];
		System.out.println("|identify ECU: "+id_ECU);
		System.out.println("|identify Information: "+id_information);
		System.out.println("|data: "+data);
		System.out.println("-----------------------");
	}
	
	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		// TODO Auto-generated method stub
	}
	public static void main(String args[])
	{
		Subscriber smc = new Subscriber();
		smc.runClient();
	}
	
	public void runClient()
	{
		String clientId = "MqttCommunication";
		connOpt = new MqttConnectOptions();
		connOpt.setCleanSession(true);
		connOpt.setKeepAliveInterval(30);
		try
		{
			myClient = new MqttClient(broker,clientId);
			myClient.setCallback(this);
			myClient.connect(connOpt);
		}catch(MqttException e)
		{
			e.printStackTrace();
		}
		System.out.println("Connected to " + broker);
		String myTopic = "pahodemo/test";
		MqttTopic topic = myClient.getTopic(myTopic);
		
		try
		{
			int subQos = 0;
			myClient.subscribe(myTopic,subQos);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			Thread.sleep(50000);
			myClient.disconnect();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
