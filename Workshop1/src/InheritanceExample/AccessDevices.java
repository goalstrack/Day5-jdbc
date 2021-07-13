package InheritanceExample;

public class AccessDevices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDevices obj1=new AccessDevices();
		ElectronicDevices tv= new TV(200, 50, 30, 1000, "Colored");
		
	    ElectronicDevices ac=new AC(300, 100, 70, 10, "ON");
	    
	    
	   Memory m1=new Memory(2, 50);
	   Bluetooth b1=new Bluetooth("ConnectToMe", 120, 3);
	   ElectronicDevices cam=new Camera(500, 1020, "front");
	    ElectronicDevices c1=new Computer(400,m1,b1,(Camera)cam,4);
	    
	   ElectronicDevices wm=new WashingMachine(700, 121, 37, 15, "Automatic");
	    
	   Camera cm=(Camera)cam;
	   ElectronicDevices mb=new MobilePhone(cm,m1,b1,"Android",300);
	   
	    
	    
	   ElectronicDevices lp=new Laptop(800,m1,b1,cm,3,4);
	   obj1.allPower(lp, 100);
	   obj1.allPower(mb, 200);
	   obj1.allPower(cm, 89);
	   obj1.allPower(wm, 20);
	   obj1.allPower(c1, 300);
	   obj1.allPower(ac, 400);
	   obj1.allPower(tv, 250);
		
	}
	public void allPower(ElectronicDevices e1,int inc)
	{
		System.out.println("Power before change "+e1.getPower()+" is of : "+e1.getClass().getName());
		e1.adjustPower(inc);
	}
}
