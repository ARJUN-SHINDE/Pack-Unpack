import java.lang.*;
import java.io.*;
import java.io.File;
import java.util.*;

public class Display
{

	public static void main(String args[]) throws Exception
	{
	
/*	Scanner sc = new Scanner(System.in);
	System.out.println("Enter File Name :");
	String fname = sc.next();
	System.out.println("Enter Your Name  : ");
	String name = sc.next();

	
	FileWriter fr = new FileWriter(fname);
	
	fr.write(name);	

	fr.close();

*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Folder Name :");
	String fname = sc.next();
	int count=0;

	File file = new File(fname);
	String filelist[] = file.list();

	for(String name:filelist)
	{
		count++;
		System.out.println(name);

	FileReader fr = new FileReader(fname+"/"+name);
	int i=0;
	while((i=fr.read())!=-1)
	{
	System.out.print((char)i);


	}
	fr.close();
	}

	}


}
