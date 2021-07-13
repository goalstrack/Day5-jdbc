package InheritanceExample;

import java.util.Objects;

public class ElectronicDevices implements Comparable<ElectronicDevices> {
	private int power;
	private String model;
	private int price;
	private int ratings;
	public ElectronicDevices(int power) {
		super();
		this.power = power;
	}
	

	public ElectronicDevices(int power, String model, int price, int ratings) {
		super();
		this.power = power;
		this.model = model;
		this.price = price;
		this.ratings = ratings;
	}


	public ElectronicDevices(int power, String model, int price) {
		super();
		this.power = power;
		this.model = model;
		this.price = price;
	}


	public ElectronicDevices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void adjustPower(int incr)
	{
		this.power+=incr;
		System.out.println("Incremented power is : "+this.power);
	}

	@Override
	public int hashCode() {
		int sc=this.power+this.price;
		return sc;
	}
	public String toString()
	{
		return this.getClass().getName()+" Power: "+this.power+" Price: "+this.price+" Rating:  "+this.ratings+" Model: "+this.model;
	}
	
	 public int getRatings() {
		return ratings;
	}


	public void setRatings(int ratings) {
		this.ratings = ratings;
	}


	@Override
	public boolean equals(Object obj) {
		 ElectronicDevices e1=(ElectronicDevices)obj;
		 	
			boolean pow=(this.power == e1.power);
			boolean pri=(this.price == e1.price);
			//boolean mod=(this.model).equals(e1.model);
			return pow&&pri;
	}


	@Override
	public int compareTo(ElectronicDevices ed1) {
		// TODO Auto-generated method stub
		return this.getPower()-ed1.getPower();
	}
	
	
}
