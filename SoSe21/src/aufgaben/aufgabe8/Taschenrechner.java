package aufgaben.aufgabe8;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Taschenrechner extends JFrame  {
	public Taschenrechner()
	{
		super();
		this.setTitle("Taschenrechner"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setSize(300, 400);
		this.setLocation(200, 100);
		this.setVisible(true);
	}
	
	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel panelNorth = new JPanel();
		panelNorth.setLayout(new FlowLayout()); //not necessary cause there is only one textfield
		JTextField input = new JTextField(20);
		panelNorth.add(input);
		//panelNorth.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setLayout(new GridLayout(6, 3, 5, 5));
		JButton number1 = new JButton ("1");
		JButton number2 = new JButton ("2");
		JButton number3 = new JButton ("3");
		JButton number4 = new JButton ("4");
		JButton number5 = new JButton ("5");
		JButton number6 = new JButton ("6");
		JButton number7 = new JButton ("7");
		JButton number8 = new JButton ("8");
		JButton number9 = new JButton ("9");
		JButton char1 = new JButton ("(");
		JButton char2 = new JButton ("0");
		JButton char3 = new JButton (")");
		JButton char4 = new JButton ("*");
		JButton char5 = new JButton ("/");
		JButton char6 = new JButton ("+");
		JButton char7 = new JButton ("-");
		JButton char8 = new JButton (".");
		JButton char9 = new JButton ("=");
		panelSouth.add(number1);
		panelSouth.add(number2);
		panelSouth.add(number3);
		panelSouth.add(number4);
		panelSouth.add(number5);
		panelSouth.add(number6);
		panelSouth.add(number7);
		panelSouth.add(number8);
		panelSouth.add(number9);
		panelSouth.add(char1);
		panelSouth.add(char2);
		panelSouth.add(char3);
		panelSouth.add(char4);
		panelSouth.add(char5);
		panelSouth.add(char5);
		panelSouth.add(char6);
		panelSouth.add(char7);
		panelSouth.add(char8);
		panelSouth.add(char9);
		
		mainPanel.add(panelNorth, BorderLayout.NORTH);
		mainPanel.add(panelSouth);
		
		
		return mainPanel;
	}
	
	public static void main(String[] args) 
	{
		new Taschenrechner();
	}
	
	

}
