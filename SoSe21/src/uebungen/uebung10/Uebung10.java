package uebungen.uebung10;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.*;

public class Uebung10 extends JFrame
{

	public Uebung10()
	{
		super();
		this.setTitle("Übung10");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(new Canvas());
		this.setSize(400,300);
		this.setLocation(300,200);
		this.setVisible(true);
		
		
	}
	private class Canvas extends JPanel
	{
		@Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);       
            Graphics2D g2 = (Graphics2D)g;  
            
            //g2.drawRect(20, 130, 200, 100); 
               int abstand = this.getHeight()/20;
               
               int hoehe = this.getHeight() - 2* abstand;
               int breite = this.getWidth() - 2* abstand;
            //Random Farben erzeugen:
             Random r = new Random();
            int rot = r.nextInt(256);
            int gruen = r.nextInt(256);
            int blau = r.nextInt(256);
            Color c = new Color(rot, gruen, blau);
            g2.setColor(c); //rot-Grün-Blau 0 bis 255

          // Quadrat zeichnen
          if(hoehe < breite)  
          {
        	  int abstandLinks = (this.getWidth()- hoehe)/2;
        	   g2.fillRect(abstandLinks, abstand, hoehe, hoehe);
          }
          else
          { 
        	  int abstandOben = (this.getHeight()- breite)/2;
        	  g2.setStroke(new BasicStroke(5.0f)); //dicke Linien
        	  g2.drawRect(abstand, abstandOben, breite, breite);
        	 
          }
            
        }
		
	}
	public static void main(String[] args) 
	{
		new Uebung10();
	}
}
