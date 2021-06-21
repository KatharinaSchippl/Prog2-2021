package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;

import javax.swing.*;

public class Graphics extends JFrame
{
	//Fenster werden immer gezeichnet genauso wie die Steuerelemente
		//wir wollen selber zeichnen --> Methode paintComponent implementieren
		//wie kommt man an diese Methode? Vererbung.
			
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public Graphics()
			{
				super();
				this.setTitle("Wir zeichnen");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//die nächsten block comments sind bezogen auf meine Frage:
				/*JPanel oben = new JPanel();
				JTextField tf = new JTextField(10);
				oben.add(tf);
				this.getContentPane().add(oben, BorderLayout.NORTH);*/
				
				/*JPanel unten = new JPanel();
				JButton tf = new JButton("ok");
				unten.add(tf);
				this.getContentPane().add(unten, BorderLayout.NORTH);*/
				
				Canvas content = new Canvas();	//this.initContent();
				this.getContentPane().add(content, BorderLayout.CENTER);
				
				this.setSize(500, 500);
				this.setLocation(200, 100);
				this.setVisible(true);
			}
			
			/*public JPanel initContent () //normalerweise initContent, aber wir erstellen jz eine innere Klasse
			{							   //und erben JPanel und können somit die Methode paintComponent überschreiben 
				JPanel mainPanel = new JPanel();
				return mainPanel;
			}*/
			
			public class Canvas extends JPanel
			{
			 
				@Override
		        protected void paintComponent(Graphics g)
		        {
		            super.paintComponent(g);       
		            Graphics2D g2 = (Graphics2D)g;  
					
					g2.fillOval(40, 30, 200, 200); //kreis oder ellipse 
					g2.drawRect(40, 30, 200, 200); //rechteck, quadrat, viereck
					
					//g2.setColor(Color.RED);
					g2.setColor(new Color(127, 127, 0)); //eigene Farben erstellen
					g2.fillRect(20, 20, 400, 400);
					Shape arc = new Arc2D.Double(40, 30, 300, 300, 0, 90, Arc2D.OPEN); // 0 = 3h, da geht der Kreisbogen los
					//Shape arc = new Arc2D.Double(40, 30, 300, 300, 90, -180, Arc2D.PIE);
					
					g2.draw(arc);
				}
			}
			
			public static void main(String[] args) 
			{
				new Graphics();
			}
}
