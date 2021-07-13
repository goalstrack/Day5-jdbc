package InheritanceExample;

public class Camera extends ElectronicDevices {
	private int resolution;
	private String type;
	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camera(int power, int resolution, String type) {
		super(power);
		this.resolution = resolution;
		this.type = type;
	}
	
	public Camera(int power, String model, int price, int ratings) {
		super(power, model, price, ratings);
		// TODO Auto-generated constructor stub
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
