import java.lang.*;
import java.io.*;
import java.util.*;
import java.awt.*;

class Pack
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		//	System.out.println("Krishna");

		System.out.println("Enter Directory Name");
		String dname = sc.next();
		
		System.out.println("Enter Target File Name");
		String tname = sc.next();
		int j=1;	
		RandomAccessFile raf = new RandomAccessFile(tname,"rw");
	
	File file = new File(dname);
	String filelist[] = file.list();
	// System.out.println("Size = "+filelist.length);

	int fsize[] = new int[filelist.length];
	int hsize[] = new int[filelist.length];

	int k=0;	
		for(String name:filelist)
		{

			System.out.println(name);
			FileReader fr = new FileReader(dname+"/"+name);

		int i=0,count=0;
	
			while((i=fr.read())!=-1)
			{
			//System.out.print((char)i);
			count++;
	
			}
				fsize[k] = count-1;
				k++;
				fr.close();
		}
	
	for(int x=0;x<k;x++)
		{
			System.out.println(fsize[x]);			
			
		}


	int q=0;
	String space = " ";
	byte[] crr = space.getBytes(); 
	for(String name:filelist)
		{
			//StringBuffer s1 = new StringBuffer(50); //name+" "+Integer.toString(fsize[q])
			//s1.append(name+" ");
			//s1.append(Integer.toString(fsize[q]));
			String s = name+" ";// s1.toString();
			
			byte[] arr = s.getBytes();
			//System.out.println("size of hedaer : "+arr.length);
			hsize[q] = arr.length+1;
			int diff = 0;
			diff = 50-hsize[q];
			raf.write(arr);
			j = j + arr.length+1;  
			raf.write(fsize[q]);			
			for(int y=0;y<diff;y++)
			{
				raf.write(crr);
				j++;
			}
			q++;		
			
				FileReader fr = new FileReader(dname+"/"+name);

		int i=0;
	
			while((i=fr.read())!=-1)
			{
			raf.write((char)i);
			j++;	
			}
			//raf.seek(j);
			
			fr.close();			
		}
	raf.close();
	}
}
