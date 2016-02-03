package library;

public class Receive 
{
	Extract ex;
	Extract_simp exs;
	CAN_m can;
	Payload pay;
	
	public Receive()
	{
		
	}
	public Payload send_data(int i)
	{
		ex = new Extract();
		exs = new Extract_simp();
		can = new CAN_m();
		long id;
		long buffer[] = new long [8];
		CAN_m can_mex[] = new CAN_m[20];
		can_mex = can.insert_information();
		ECU.getIstance().setId_ECU(1);
		id = can_mex[i].getId();
		buffer = can.fill_buffer(i);
		if(can_mex[i].getExt() == 1)
		{
			Extract temp = ex.information_data(id, buffer);
			long id_ECU = temp.getId_ECU();
			long data = temp.getData();
			long id_data = temp.getId_data();
			pay = new Payload(id,id_data,id_ECU,data);
		}
		else
		{
			Extract_simp temp = exs.information_data(id, buffer);
			long id_ECU = temp.getId_ECU();
			long data = temp.getData();
			long id_data = temp.getId_data();
			pay = new Payload(id,id_data,id_ECU,data);
		}
		return pay;
	}
}