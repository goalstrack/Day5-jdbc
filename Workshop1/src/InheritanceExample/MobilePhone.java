package InheritanceExample;

public class MobilePhone extends ElectronicDevices{
	private Camera cm;
	private Memory mi;
	private Bluetooth bh;
	private String osType;
	private int screenSize;
	public MobilePhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobilePhone(Camera cm, Memory mi, Bluetooth bh, String osType, int screenSize) {
		super();
		this.cm = cm;
		this.mi = mi;
		this.bh = bh;
		this.osType = osType;
		this.screenSize = screenSize;
	}
	
	public MobilePhone(int power, String model, int price, int ratings) {
		super(power, model, price, ratings);
		// TODO Auto-generated constructor stub
	}
	public Camera getCm() {
		return cm;
	}
	public void setCm(Camera cm) {
		this.cm = cm;
	}
	public Memory getMi() {
		return mi;
	}
	public void setMi(Memory mi) {
		this.mi = mi;
	}
	public Bluetooth getBh() {
		return bh;
	}
	public void setBh(Bluetooth bh) {
		this.bh = bh;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public void adjustPower(int incr)
	{
		int p=super.getPower()+incr;
		System.out.println("Incremented power is : "+p);
	}
}
