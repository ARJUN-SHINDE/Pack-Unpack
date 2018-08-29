import java.lang.*;
import java.io.*;
import java.util.*;

public class Copy
{

	public static void main(String args[]) throws Exception
	{
	/*	
	Scanner sc = new Scanner(System.in);
	

	System.out.println("Enter File Name 1st:");
	String fname1 = sc.next();
	System.out.println("Your File Name : "+fname1);
	
	System.out.println("Enter File Name 2nd:");
	String fname2 = sc.next();
	System.out.println("Your File Name : "+fname2);

//	FileWriter fw  = new FileWriter("Hello.txt");
	*/

	Scanner sc = new Scanner(System.in);
	

	System.out.println("Enter Name 1st:");
	String  fname1 = sc.next();
	System.out.println("Enter age:");
	int age = sc.nextInt();
	
	byte[] arr = fname1.getBytes();
	//byte[] brr = age.getBytes();
	
	RandomAccessFile raf = new RandomAccessFile("New.txt","rw");
	raf.write(arr);
	raf.write(age);
	FileReader fr = new FileReader("New.txt");
	//FileReader fr2 = new FileReader(fname2);
	raf.close();
	
int i=0,count=0;
	
			while((i=fr.read())!=-1)
			{
			System.out.print((char)i);
			count++;
	
			}
			

	//int i=0,count=0;
	/*
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
	
*/
	
	
	}

}
