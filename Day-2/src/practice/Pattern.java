package practice;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 10; // entered by user

		for (int r = 0; r < limit; r++) {
			for (int c = 0; c <= r; c++) {
				if(r == 0 || r == (limit-1))
				{
					System.out.print(" * ");
				}
				else 
				{
					if(c==0 || c==r)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				
			}

			System.out.print("\n");
		}
	}

}
