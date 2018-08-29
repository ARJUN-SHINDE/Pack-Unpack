import java.lang.*;
import java.io.*;
import java.util.*;

public class Copy
{

	public static void main(String args[]) throws Exception
	{
	
	Scanner sc = new Scanner(System.in);
	

	System.out.println("Enter File Name 1st:");
	String fname1 = sc.next();
	System.out.println("Your File Name : "+fname1);
	
	System.out.println("Enter File Name 2nd:");
	String fname2 = sc.next();
	System.out.println("Your File Name : "+fname2);
	
//	FileWriter fw  = new FileWriter("Hello.txt");
	
	RandomAccessFile raf = new RandomAccessFile("New.txt","rw");

	FileReader fr = new FileReader(fname1);
	FileReader fr2 = new FileReader(fname2);
		
	int i=0,count=0;
	
	while((i=fr.read())!=-1)
	{
	//System.out.print((char)i);
	count++;
	raf.write((char)i);
	}
	raf.seek(count-1);

	int j=0;
	while((i=fr2.read())!=-1)
	{
	//System.out.print((char)i);
	
	raf.write((char)i);
	}
	

	raf.close();

	
	}

}
