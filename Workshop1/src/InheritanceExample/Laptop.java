package InheritanceExample;

public class Laptop extends ElectronicDevices {
	private Memory my;
	private Bluetooth bt;
	private Camera cm;
	private int port,cores;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int power, String model, int price, int ratings) {
		super(power, model, price, ratings);
		// TODO Auto-generated constructor stub
	}

	public Laptop(int power, Memory my, Bluetooth bt, Camera cm, int port, int cores) {
		super(power);
		this.my = my;
		this.bt = bt;
		this.cm = cm;
		this.port = port;
		this.cores = cores;
	}
	public Memory getMy() {
		return my;
	}
	public void setMy(Memory my) {
		this.my = my;
	}
	public Bluetooth getBt() {
		return bt;
	}
	public void setBt(Bluetooth bt) {
		this.bt = bt;
	}
	public Camera getCm() {
		return cm;
	}
	public void setCm(Camera cm) {
		this.cm = cm;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public void adjustPower(int incr)
	{
		int p=super.getPower()+incr;
		System.out.println("Incremented power is : "+p);
	}

}
