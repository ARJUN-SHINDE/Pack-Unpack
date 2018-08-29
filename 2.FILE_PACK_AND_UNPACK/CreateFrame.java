import java.lang.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.Color;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
public class CreateFrame extends JComponent
{

	JFrame fobj;
	JLabel l1;
	String xx;
	String yy;
	int i;
	JPanel p1;
	 JTextField l[] = new JTextField[2];
	int w;
	int h;
 BufferedImage bg;
	boolean vis;
	//Image img = new Image("abcd.png"); 
	boolean done = false;
	public CreateFrame(String name,int width,int height,boolean visibility) 
	{

		 fobj = new JFrame(name);
			if(name.equals("PACKING AND UNPACKING"))
			{
			fobj.add(new ClockPane());
			fobj.pack();
			}//fobj.getContentPane().setBackground(Color.red);		
			//fobj.setPreferredSize(new Dimension(400,300));			
			//fobj.pack();	
		p1 = new JPanel();
			p1.setLayout(null);
		/*try{	
		URL url = new URL("abcd.png");
		 bg = ImageIO.read(url);	
		}
		catch(Exception eee)
		{

		}*/
		//fobj.setLayout(new BorderLayout());
		//fobj.setContentPane(new JLabel(new ImageIcon("abcd.png")));
		//fobj.setLayout(new FlowLayout());		
		//fobj.setBackground(new Color(0,0,0,0));
		
		//JPanel c = new PanelWithBackgroundImage(bg);		
		i=0;
		w = width;
		h = height;
		vis = visibility;
	
	}
/*
	protected void paintComponent(Graphics g)
	{
		g.drawImage(fobj.setContentPane(new JLabel(new ImageIcon("abcd.png"))),0,0,null);
	}
*/
	public void addButton(String name,int p,int q,int r,int s)
	{
		 
		JButton b1 = new JButton(name);
		b1.setBounds(p,q,r,s);//70,350,100,40);
		p1.add(b1);
	
			//fobj.add(p1);

		//JPanel p2 = new JPanel();
	/*	JButton b2 = new JButton(name+"aa");
		


		
		//p2.setLayout(null);
		b2.setBounds(350,350,100,40);
		p1.add(b2);
		//p2.setBounds(80,80,20,10);
*/

		if((name.equals("PACK"))&&(p == 210))
		{
				//System.out.println("HelloWorld");
			
			b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			xx = l[0].getText();
			yy = l[1].getText();
			  try{
				Packing ppp = new Packing();
					ppp.getPack(xx,yy);
					
					
				}
			catch(Exception ex)
			{

}
				//System.out.println(xx);
				//System.out.println(yy);
				
			}
			});
			
		}
		if((name.equals("UNPACK"))&&(p == 210))
		{

				b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			xx = l[0].getText();
			yy = l[1].getText();
			  try{
				Unpacking uuu = new Unpacking();
					uuu.getUnpack(xx,yy);
				}
			catch(Exception ex)
			{

}
				//System.out.println(xx);
				//System.out.println(yy);
				
			}
			});
		
		}
		if(name.equals("Pack"))
		{
			ActionListener listener = new ClickListener(1,fobj);
			b1.addActionListener(listener);


		}
		if(name.equals("UnPack"))
		{

			ActionListener listener2 = new ClickListener(2,fobj);
			b1.addActionListener(listener2);
		}

		
		if(name.equals("LOGIN"))
		{
			
			b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			xx = l[0].getText();
			yy = l[1].getText();
			
				if((xx.equals("admin"))&&(yy.equals("admin")))
				{
					CreateFrame f = new CreateFrame("PACKING AND UNPACKING",500,500,true);
					f.addButton("Pack",70,350,100,40);
					f.addButton("UnPack",330,350,100,40);
					f.addLabel("  PACK   &   UNPACK  ",180,100,190,200);
					fobj.dispose();
					f.display();
		

				}			
				}
			});
			//ActionListener listener3 = new ClickListener(3,fobj,l);
			//b1.addActionListener(listener3);
		}
		
	}

	public void addTextBox(int a,int b,int c,int d)
	{

		 l[i] = new JTextField();
		//l.setSize(a,b);		
		l[i].setBounds(a,b,c,d);//		
				
		p1.add(l[i]);
			i++;
		if(i==2)
		{
			i=0;
		}
	}
	
	public void addLabel(String name,int a,int b,int c,int d)
	{
		 l1= new JLabel(name);
		l1.setBounds(a,b,c,d);		
		p1.add(l1);
	}
	
		
	void display()
	{
		i=0;
		fobj.add(p1);
		fobj.setSize(w,h);
		
		fobj.addWindowListener(new Hello());
	
		fobj.setVisible(true);	
		
		
	}
	


	
}

class Hello implements WindowListener
{
	public void windowActivated(WindowEvent e)
	{}
	public void windowClosed(WindowEvent e)
	{}
	public void windowDeactivated(WindowEvent e)
	{}
	public void windowIconified(WindowEvent e)
	{}
	public void windowDeiconified(WindowEvent e)
	{}
	public void windowOpened(WindowEvent e)
	{}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
				
	
		

}

class ClickListener implements ActionListener
{
	
	JFrame pack1;
	JFrame pack2;
	JFrame upper;
	int xyz ;
		

	public ClickListener(int abc,JFrame u)
	{
		xyz = abc;		
		upper = u;
	
	}

	public void actionPerformed(ActionEvent event)
	{
		if(xyz == 1)
		{
			System.out.println("Pack");
			CreateFrame f1 = new CreateFrame("Packing",500,500,true);
		//	f1.addButton("Pack",70,350,100,40);
		//f1.addButton("UnPack",330,350,100,40);
		f1.addLabel("  Directory  Name :  ",40,30,190,200);
		f1.addLabel("  Target File Name :  ",40,130,190,200);
		f1.addTextBox(200,115,200,30);	
		f1.addTextBox(200,215,200,30);			
		
		f1.addButton("PACK",210,350,100,40);		
		upper.dispose();		
		f1.display();
				
		}
		if(xyz == 2)
		{
		System.out.println("Unapack");
			CreateFrame f1 = new CreateFrame("UnPacking",500,500,true);
		//	f1.addButton("Pack",70,350,100,40);
		//f1.addButton("UnPack",330,350,100,40);
		f1.addLabel(" File Name  :  ",40,30,190,200);
		f1.addLabel("  Directory  Name  :  ",40,130,190,200);
		f1.addButton("UNPACK",210,350,100,40);		
		f1.addTextBox(200,115,200,30);	
		f1.addTextBox(200,215,200,30);			
		upper.dispose();				
		f1.display();
		
		}
		if(xyz == 3)
		{
			//String User = t.getText();
			//String Pass = t.getText();
			
		//System.out.println(User);

	//	System.out.println(Pass);
		}

	}	


}



class PanelWithBackgroundImage extends JPanel
{
	Image bg;
	
	PanelWithBackgroundImage(Image bg)
	{
		this.bg = bg;
		
		
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		//System.out.println("Pass");
		
		super.paintComponent(g);
		g.drawImage(bg,0,0,getWidth(),getHeight(),this);
	}
}
