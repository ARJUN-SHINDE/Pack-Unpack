import java.lang.*;
import java.io.*;
import java.util.*;

public class Display
{

	public static void main(String args[]) throws Exception
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter File Name :");
	String fname = sc.next();
	System.out.println("Enter Your Name  : ");
	String name = sc.next();

	
	FileWriter fr = new FileWriter(fname);
	
	fr.write(name);	

	fr.close();
	}

}
