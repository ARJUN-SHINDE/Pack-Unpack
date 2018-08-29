import java.lang.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JLabel;

class PackUnpack
{
	public static void main(String args[])
	{
		//System.out.println("Krishna");
		/*JPanel jp = new JPanel();
		//jp.setLayout(null);
		//JLabel jl = new JLabel("kkkkkkkkk");
		//jp.add(jl);
		jp.setSize(500,500);
		jp.setVisible(true);		
		*/
		CreateFrame L = new CreateFrame(" LOGIN WINDOW ",500,500,true);
		L.addButton("LOGIN",70,350,100,40);
		L.addButton("REGISTER",330,350,100,40);
		L.addLabel(" Username  :  ",40,30,190,200);
		L.addLabel("  Password  :  ",40,130,190,200);
		L.addTextBox(200,115,200,30);	
		L.addTextBox(200,215,200,30);			
		L.display();		


	/*	CreateFrame f = new CreateFrame("PACKING AND UNPACKING",500,500,true);
		f.addButton("Pack",70,350,100,40);
		f.addButton("UnPack",330,350,100,40);
		f.addLabel("  PACK   &   UNPACK  ",180,100,190,200);
		
		f.display();
		*/	
	}
}
