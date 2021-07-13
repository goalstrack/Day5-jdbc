package InheritanceExample;

public class TV extends ElectronicDevices{
	private	int length,width,resolution;
	private String type;
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TV(int power, int length, int width, int resolution, String type) {
		super(power);
		this.length = length;
		this.width = width;
		this.resolution = resolution;
		this.type = type;
	}
	
	public TV(int power, String model, int price, int ratings) {
		super(power, model, price, ratings);
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void adjustPower(int incr)
	{
		int p=super.getPower()+incr;
		System.out.println("Incremented power is : "+p);
	}
}
