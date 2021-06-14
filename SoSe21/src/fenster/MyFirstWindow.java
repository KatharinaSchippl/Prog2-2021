package fenster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;


public class MyFirstWindow extends JFrame
{
	public MyFirstWindow() 
	{
		super(); //Konstruktor von JFrame
		JFrame myWindow = new JFrame(); 
		//erstellen Fenster
		this.setTitle("My first Window"); //Anstatt MyWindow.-----> könnten wir auch this. 
		// Name des Fensters
		this .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fenster schließen und das Programm wird auch geschlossen
		//myWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);Fenster schließen und nichts passiert
		//this.setBackground(Color.CYAN);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		this.getContentPane().setBackground(Color.CYAN);
		
		this.setSize(400, 300);
		this.setLocation(200, 100);
		this.setVisible(true);
		
	}
	/*
	 * FlowLayout - alles nebeneinander, solange es passt. Sonst untereinander (standardlayout JPanel)
	 * GridLayout - GitterStruktur in Zeilen und Spalten 
	 * BorderLayout - Norden, Süden, Wetsen, Osten, Center (Standardlayout eines JFrame)
	 */
	private JPanel initContent()
	{ //Container = JPanel
		JPanel mainPanel = new JPanel();
		
		mainPanel.setLayout(new BorderLayout());
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 2));
		JButton cb1 = new JButton("EAST");
		JButton cb2 = new JButton("WEST");
		JButton cb3 = new JButton("NORTH");
		JButton cb4 = new JButton("SOUTH");
		JButton cb5 = new JButton("CENTER");
		
		center.add(cb1);
		center.add(cb2);
		center.add(cb3);
		center.add(cb4);
		center.add(cb5);
		
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton("CENTER");
		
		mainPanel.add(b1, BorderLayout.EAST);
		mainPanel.add(b2, BorderLayout.WEST);
		mainPanel.add(b3, BorderLayout.NORTH);
		mainPanel.add(b4, BorderLayout.SOUTH);
		mainPanel.add(center, BorderLayout.WEST);
		/*GRIDLAYOUT
		 * JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 2));
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton("CENTER");
		
		 * mainPanel.add(b1, BorderLayout.EAST);
		mainPanel.add(b2, BorderLayout.WEST);
		mainPanel.add(b3, BorderLayout.NORTH);
		mainPanel.add(b4, BorderLayout.SOUTH);
		mainPanel.add(b5, BorderLayout.WEST);
		 */
		
		/* FLOWLAYOUT
		mainPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40)); //Hier wird die Anordnung der Buttons gespeichert... 
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton("CENTER");
		mainPanel.add(b1);
		mainPanel.add(b2);
		mainPanel.add(b3);
		mainPanel.add(b4);
		mainPanel.add(b5);
		*/
		/* BORDERLAYOUT
		mainPanel.setLayout(new BorderLayout());
		
		JButton b1 = new JButton("EAST");
		JButton b2 = new JButton("WEST");
		JButton b3 = new JButton("NORTH");
		JButton b4 = new JButton("SOUTH");
		JButton b5 = new JButton("CENTER");
		
		
		
		mainPanel.add(b1, BorderLayout.EAST);
		mainPanel.add(b2, BorderLayout.WEST);
		mainPanel.add(b3, BorderLayout.NORTH);
		mainPanel.add(b4, BorderLayout.SOUTH);
		mainPanel.add(b5, BorderLayout.CENTER);
		*/
		/*
		//hier weitere Container oder Steuerelemente hinzufügen
		//1. Steuerelement erzeugen
		JLabel label = new JLabel("Name : ");
		JTextField input = new JTextField(10); //Breite in Zeichen... einzeiliges EIngabefeld
		JButton button = new JButton("Klick mich");
		JCheckBox cb = new JCheckBox();
		JRadioButton rb = new JRadioButton(); 
		
		//Jetzt diese drei Elemente dem container hinzufügen
		
		//REIHENFOLGE SUPER WICHTIG; IST BUTTON OBEN; DANN IST ER LINKS IM FELD
		
		mainPanel.add(label); //2. hinzufügen
		mainPanel.add(input);
		mainPanel.add(button);
		mainPanel.add(rb);
		mainPanel.add(cb);
		*/
		return mainPanel;
	}
	
	public static void main(String [] args)
	{
	new MyFirstWindow();
	}



}







