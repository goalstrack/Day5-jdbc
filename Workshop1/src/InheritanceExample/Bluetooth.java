package InheritanceExample;

public class Bluetooth {
	private String name;
	private int speed,devicesconnected;
	public Bluetooth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bluetooth(String name, int speed, int devicesconnected) {
		super();
		this.name = name;
		this.speed = speed;
		this.devicesconnected = devicesconnected;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDevicesconnected() {
		return devicesconnected;
	}
	public void setDevicesconnected(int devicesconnected) {
		this.devicesconnected = devicesconnected;
	}
	
}
