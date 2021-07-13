package practice;

public class overloading {
	public static void main(String[] args) {
		callData(12);
		callData(65537);
		callData(2345678934f);
		callData(345.67f);
		callData(5612.890);
	}
	public static void callData(int a)
	{
		System.out.println("int ");
	}
	public static void callData(byte a)
	{
		System.out.println("byte ");
	}
	public static void callData(long a)
	{
		System.out.println("long ");
	}
	public static void callData(float a)
	{
		System.out.println("float ");
	}
	public static void callData(double a)
	{
		System.out.println("double ");
	}
	
	
}
