import java.lang.*;
import java.io.*;
import java.util.*;
import java.awt.*;

class Unpack1
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Krishna");
		
		

		System.out.println("Enter File Name To Be Unpack");
		String tname = sc.next();

		System.out.println("Enter New Directory Name");
		String dname = sc.next();
		
		File dir = new File(dname);
		dir.mkdir();			


		//RandomAccessFile raf = new RandomAccessFile(tname,"rw");	
	
		//System.out.println(raf.readUTF());
		//raf.close();
		int g = 2;
		RandomAccessFile raf = new RandomAccessFile(tname,"rw");	
		//raf.write(g);
		int i=0,j=0,flag=2,size=0,l=1;
		String data = "";
		
	//	int t = raf.readByte();
	//	System.out.println((char)t+2);
	//		raf.close();
		while(true)
		{
			//System.out.print((char)raf.readByte());			

			if(i!=50)
			{
				j = raf.readByte();	
				data = data + (char)j;
				if(data.contains("txt"))
				{
					flag--;	
				}
				else
				{
					flag = 2;
				}
				if(flag == -1)
				{
					size = j;
				}
			i++;
			}
			else
			{
				
				i=0;

				String w[] = data.split("\\s");
				RandomAccessFile raf2 = new RandomAccessFile(dname+"/"+w[0],"rw");
				//RandomAccessFile raf1 = new RandomAccessFile(tname,"rw");
				//l=l+50;
				//raf1.seek(l);
				for(int m=0;m<(char)size+1;m++)
					{
						//System.out.println((char)raf.readByte());
						raf2.write((char)raf.readByte());
					}	

				raf2.close();
				System.out.println((char)size+2);
										//	System.out.println(data);
								data = "";
				flag = 2;
				//raf1.close();

				
				//break;
			}
			
			


	
		}	
	}
}
