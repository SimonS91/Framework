package Subscriber;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;

import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import Parser.*;
import Time.Utility;
import Graphic.Graphic;

public class Subscriber implements MqttCallback
{
	MqttClient myClient;
	MqttConnectOptions connOpt;
	static Parser par;
	static Graphic graphic;
	static Utility utility;
	static final String broker = "tcp://test.mosquitto.org:1883";
	
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
		int id_ECU = Integer.parseInt(parts[1],10);
		int id_information = Integer.parseInt(parts[3],10);
		long data = Long.parseLong(parts[5],10);
		System.out.println("|identify ECU: "+id_ECU);
		System.out.println("|identify Information: "+id_information);
		System.out.println("|data: "+data);
		System.out.println("-----------------------");
		createGraphic(id_ECU,id_information,data);
	}
	
	public void createGraphic(int id_ECU,int id_information,long data)
	{
		Information inf = par.parse(id_ECU, id_information);
		if(graphic ==null)
		{
			graphic = new Graphic(inf.getId_information());
			graphic.setVisible(true);
			utility.addObserver(graphic);
		}
		//Time.Time.getIstance().temp();
		utility.insert(data);
	}
	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		// TODO Auto-generated method stub
	}
	public static void main(String args[])
	{
		par = new Parser();
		new Utility();
		utility = Utility.getInstance();
		Subscriber smc = new Subscriber();
		SimpleRunner r = new SimpleRunner();
		Thread t = new Thread(r);
		t.start();
		while(true)
		{
			smc.runClient();
			graphic.removeAll();
		}
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
			Thread.sleep(10000000);
			myClient.disconnect();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
