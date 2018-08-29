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
	System.out.println("Your File Name : "+fname);
	
	FileReader fr = new FileReader(fname);
	int i=0;
	while((i=fr.read())!=-1)
	{
	System.out.print((char)i);


	}
	fr.close();

	}

}
