package InheritanceExample;

public class WashingMachine extends ElectronicDevices {
		private int weigthlimit,waterTempearture,spinningtime;
		private String category;
		public WashingMachine() {
			super();
			// TODO Auto-generated constructor stub
		}
		public WashingMachine(int power, int weigthlimit, int waterTempearture, int spinningtime, String category) {
			super(power);
			this.weigthlimit = weigthlimit;
			this.waterTempearture = waterTempearture;
			this.spinningtime = spinningtime;
			this.category = category;
		}
		
		public WashingMachine(int power, String model, int price, int ratings) {
			super(power, model, price, ratings);
			// TODO Auto-generated constructor stub
		}
		public int getWeigthlimit() {
			return weigthlimit;
		}
		public void setWeigthlimit(int weigthlimit) {
			this.weigthlimit = weigthlimit;
		}
		public int getWaterTempearture() {
			return waterTempearture;
		}
		public void setWaterTempearture(int waterTempearture) {
			this.waterTempearture = waterTempearture;
		}
		public int getSpinningtime() {
			return spinningtime;
		}
		public void setSpinningtime(int spinningtime) {
			this.spinningtime = spinningtime;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public void adjustPower(int incr)
		{
			int p=super.getPower()+incr;
			System.out.println("Incremented power is : "+p);
		}
}
