package library;

public class CAN_m 
{
	private long id;
	private int ext;
	private int dim;
	private long buffer[];
	public CAN_m()
	{
		
	}
	public CAN_m(long id, int ext, int dim) {
		super();
		this.id = id;
		this.ext = ext;
		this.dim = dim;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getExt() {
		return ext;
	}
	public void setExt(int ext) {
		this.ext = ext;
	}
	public int getDim() {
		return dim;
	}
	public void setDim(int dim) {
		this.dim = dim;
	}
	public CAN_m[] insert_information()
	{
		CAN_m can_mex[] = new CAN_m[20];
		can_mex[0] = new CAN_m();
		can_mex[0].id = 134217984;
		can_mex[0].ext = 1;
		can_mex[0].dim =8;
		can_mex[1] = new CAN_m();
		can_mex[1].id = 134217984;
		can_mex[1].ext = 1;
		can_mex[1].dim =8;
		can_mex[2] = new CAN_m();
		can_mex[2].id = 134217984;
		can_mex[2].ext = 1;
		can_mex[2].dim =8;
		can_mex[3] = new CAN_m();
		can_mex[3].id = 134217984;
		can_mex[3].ext = 1;
		can_mex[3].dim =8;
		can_mex[4] = new CAN_m();
		can_mex[4].id = 134217984;
		can_mex[4].ext = 1;
		can_mex[4].dim =8;
		can_mex[5] = new CAN_m();
		can_mex[5].id = 134217984;
		can_mex[5].ext = 1;
		can_mex[5].dim =8;
		can_mex[6] = new CAN_m();
		can_mex[6].id = 134217984;
		can_mex[6].ext = 1;
		can_mex[6].dim =8;
		can_mex[7] = new CAN_m();
		can_mex[7].id = 134217984;
		can_mex[7].ext = 1;
		can_mex[7].dim =8;
		can_mex[8] = new CAN_m();
		can_mex[8].id = 134217984;
		can_mex[8].ext = 1;
		can_mex[8].dim =8;
		can_mex[9] = new CAN_m();
		can_mex[9].id = 134217984;
		can_mex[9].ext = 1;
		can_mex[9].dim =8;
		can_mex[10] = new CAN_m();
		can_mex[10].id = 134217984;
		can_mex[10].ext = 1;
		can_mex[10].dim =8;
		can_mex[11] = new CAN_m();
		can_mex[11].id = 134217984;
		can_mex[11].ext = 1;
		can_mex[11].dim =8;
		can_mex[12] = new CAN_m();
		can_mex[12].id = 134217984;
		can_mex[12].ext = 1;
		can_mex[12].dim =8;
		can_mex[13] = new CAN_m();
		can_mex[13].id = 134217984;
		can_mex[13].ext = 1;
		can_mex[13].dim =8;
		can_mex[14] = new CAN_m();
		can_mex[14].id = 134217984;
		can_mex[14].ext = 1;
		can_mex[14].dim =8;
		can_mex[15] = new CAN_m();
		can_mex[15].id = 134217984;
		can_mex[15].ext = 1;
		can_mex[15].dim =8;
		can_mex[16] = new CAN_m();
		can_mex[16].id = 134217984;
		can_mex[16].ext = 1;
		can_mex[16].dim =8;
		can_mex[17] = new CAN_m();
		can_mex[17].id = 134217984;
		can_mex[17].ext = 1;
		can_mex[17].dim =8;
		return can_mex;
	}
	public long[] fill_buffer(int i)
	{
		this.buffer = new long[8];
		switch(i)
		{
        case 0:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;

            break;
        case 1:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x57;
            break;
        case 2:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
        case 3:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x56;
            break;
        case 4:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x96;
            break;
        case 5:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x97;
            break;
        case 6:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
        case 7:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x56;
            break;
        case 8:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
        case 9:
            buffer[0] = 0x00;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x58;
            break;
        case 10:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
        case 11:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x60;
            break;
        case 12:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x54;
            break;
        case 13:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
        case 14:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
        case 15:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x58;
            break;
        case 16:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x59;
            break;
        case 17:
            buffer[0] = 0x02;
            buffer[1] = 0x00;
            buffer[2] = 0x00;
            buffer[3] = 0x00;
            buffer[4] = 0x01;
            buffer[5] = 0x01;
            buffer[6] = 0x01;
            buffer[7] = 0x55;
            break;
    }
    return buffer;
   }
}
