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
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.Timer;
 

class ClockPane extends JPanel
{

	private JLabel clock = new JLabel();

	public ClockPane()
	{

		setLayout(new BorderLayout());
		tickTock();
		add(clock);
		
	Timer timer = new Timer(500,new ActionListener(){
	
	public void actionPerformed(ActionEvent e)
	{
		tickTock();
	}

	});

	timer.setRepeats(true);
	timer.setCoalesce(true);
	timer.setInitialDelay(0);
//clock.setBounds(100,100,20,30);
		
	timer.start();
	
	}

	public void tickTock()
	{
		clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
		
	}
}
