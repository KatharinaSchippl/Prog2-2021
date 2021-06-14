package uebungen.uebung8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.border.Border;
import javax.swing.*;
public class Uebung8 extends JFrame
{
	public Uebung8()
	{
		super();
		
		this.setTitle("GUI Übung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = initContent();
		this.getContentPane().add(content); //ÜBER VISIBLE!!!!!!!!!!!!
		this.setSize(400, 300); //this.pack würde auch gehen = Standard, bzw falls keine größe angegeben
		this.setVisible(true);
		
		
	}
	private JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		//Oben die blaue Leiste
		JPanel oben =  new JPanel();
		JLabel text1 = new JLabel("Text");
		text1.setForeground(Color.WHITE);
		oben.setBackground(Color.BLUE);
		//Blaue leiste mit roter Umrandung
		Border redLine = BorderFactory.createLineBorder(Color.RED,2);
		oben.add(text1);
		oben.setBorder(redLine);
		
		//Rechts die zwei Buttons
		JPanel rechts = new JPanel();
		rechts.setLayout(new GridLayout(2, 1, 20, 20));
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		rechts.add(b1);
		rechts.add(b2);
		
		//Mitte Textfeld und Text
		
		JPanel mitte = new JPanel();
		mitte.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		JLabel text2 = new JLabel("Weiterer Text");
		JTextField Feld = new JTextField("Feld", 10); //10 = Länge des kurzen Feldes
		mitte.add(text2);
		mitte.add(Feld);
		
		
		
		mainPanel.add(rechts, BorderLayout.EAST);
		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(mitte, BorderLayout.CENTER);
		
		return mainPanel;
	}
	public static void main(String[] args) 
	{
		new Uebung8();
	}
}
