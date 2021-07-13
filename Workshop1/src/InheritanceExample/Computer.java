package InheritanceExample;

public class Computer extends ElectronicDevices {
		private Memory mi;
		private Bluetooth bh;
		private Camera cm;
		private int ports;
		public Computer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Computer(int power, Memory mi, Bluetooth bh, Camera cm, int ports) {
			super(power);
			this.mi = mi;
			this.bh = bh;
			this.cm = cm;
			this.ports = ports;
		}
		
		public Computer(int power, String model, int price, int ratings) {
			super(power, model, price, ratings);
			// TODO Auto-generated constructor stub
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
		public Camera getCm() {
			return cm;
		}
		public void setCm(Camera cm) {
			this.cm = cm;
		}
		public int getPorts() {
			return ports;
		}
		public void setPorts(int ports) {
			this.ports = ports;
		}
		
		public void adjustPower(int incr)
		{
			int p=super.getPower()+incr;
			System.out.println("Incremented power is : "+p);
		}
}
