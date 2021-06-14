package ereignisbehandlung;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ereignisbahandlung extends JFrame implements ActionListener

{
	Integer anzKlicks = 0; //HIer für die Erhöfung pro Klick um Eins
	JLabel unten; //--> dadurch machen wir das global, damit man das für die Action benutzen kann
	
	
	public Ereignisbahandlung()
	{
		super();
		this.setTitle("Ereignisbehandlung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = initContent();
		this.getContentPane().add(content); //ÜBER VISIBLE!!!!!!!!!!!!
		
		this.setSize(100, 300); //this.pack würde auch gehen = Standard, bzw falls keine größe angegeben
		this.setLocation(200, 100);
		this.setVisible(true);
		
	}
	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		
		JButton minus = new JButton("-");
		JButton plus = new JButton("+");	//Button hinzufügen 
		
		oben.add(minus);
		oben.add(plus);
		plus.addActionListener(this);//damit wird gesorgt, dass dieser Button ein Ereignis auslöst
		minus.addActionListener(this);
		
		unten = new JLabel(this.anzKlicks.toString());//---> this.anzKlick.toString() = macht Integer zu String
		unten.setFont(new Font("Verdana", Font.BOLD, 24)); 
		//Verdana--> Schfriftart, BOLD --> große Buchstaben, 24 ---> Schriftgröße!!!
		unten.setHorizontalAlignment(JLabel.CENTER); //.setHorizontalAllignment --> wird komplett mittig gesetzt
		
		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(unten, BorderLayout.CENTER);
		
		return mainPanel;
		
	}
	
	public static void main(String[] args) 
	{
		new Ereignisbahandlung();

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	
	{	
		Object quelle = e.getSource(); //hat ActionEvent ausgelöst + OBJEKTR WIRD ZURÜCKGGEGEBN!!!
		if(quelle instanceof JButton) //ist es ein JBUTTON?
		{
			JButton button = (JButton)quelle; //überprüfung ob JButton und was für ein Button geklickt wird
			if(button.getText().equals("-"))
			{
				this.anzKlicks--;
				System.out.println("Minus - Button geklickt..." + this.anzKlicks); //Ist es ein - Button?
			}
			else if(button.getText().equals("+"))
			{
				this.anzKlicks++;
				System.out.println("Plus - Button geklickt.." + this.anzKlicks);//ist es ein + Button?
			}
			this.unten.setText(this.anzKlicks.toString());
		}
		
		//wir wollen jetzt, dass die Zahl sich pro Klick ums eins erhöht ----> 
		
		//System.out.println("Button geklickt..." + this.anzKlicks);
		//this.unten.setText(this.anzKlicks.toString());
		
	}

}
