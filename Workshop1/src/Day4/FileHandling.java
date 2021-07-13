package Day4;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\Workshop1\\src\\InheritanceExample\\Computer.java";
		
		try {
		
			File f = new File(path);
			File f2 = new File("fisTest.txt");
			new FileHandling().readFile(f);
			new FileHandling().printFile(f2);
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		
	}//end main
	
	
	public void printFile(File f2)throws Exception
	{
		System.out.println(" Printing ....");
		PrintWriter pw = new PrintWriter(f2);
		pw.append("dfverg");
		pw.close();
		System.out.println("done ---");
	}
	
	public void readFile(File f)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String word;
		int cnt=0;
		String line = null;
		System.out.println("Enter word to find");
		Scanner sc=new Scanner(System.in);
		word=sc.nextLine();
		while((line = br.readLine())!=null)
		{
			
			cnt++;
			String arr[]=line.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				
				if(arr[i].equals(word))
				{
					
					System.out.println(cnt+" "+line);
				}
			}
			/*if(line.indexOf(word) != -1)
			{
				System.out.println(cnt+" "+line);
			}*/
			
		}
	}
}//end class
