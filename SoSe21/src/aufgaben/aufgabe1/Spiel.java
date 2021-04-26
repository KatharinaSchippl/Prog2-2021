package aufgaben.aufgabe1;

import javax.swing.JOptionPane;

public class Spiel 
{
	 /*
	  * KATHARINA SCHIPPL
     * 
     * bearbeitet mit @ THAO TRANG LE (anny)
     */
    public static int siegPunkte; 
    private static Spieler [] spieler; 
    
    
    public Spiel () 
    {
        anzSpieler();
        siegPunkte();
        nameDesSpielers();
    }
    
    public void anzSpieler()
    {
        int anzSpieler = 0;
        boolean inputOk = false; 
        while(!inputOk)
        {
            try 
            {
                String input = JOptionPane.showInputDialog("Anzahl Spieler:");
                inputOk = true;
                anzSpieler=Integer.parseInt(input); 
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein");
                inputOk = false; 
            }
        }
        
        spieler = new Spieler [anzSpieler];
    }
    
    public void siegPunkte()
    {
        boolean inputOk = false; 
        while(!inputOk)
        {
            try 
            {
                String input = JOptionPane.showInputDialog("Siegpunkte:");
                inputOk = true;
                siegPunkte=Integer.parseInt(input); 
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein");
                inputOk = false;
            }
        }
    }
    
    public void nameDesSpielers()
    {
        String name = "";
        for (int index = 0; index < this.spieler.length; index++) 
        {
            name = JOptionPane.showInputDialog("Name des Spielers:" + (index +1) + " :");
            spieler[index] = new Spieler(name); 
        }
    }
    
    public void spielen ()
    {
        int index = 0;
        boolean gewonnen = false;
        while (!gewonnen)
        {
            gewonnen = spieler[index].wuerfeln(); 
            index=(index<spieler.length-1) ? index+1 : 0; 
        }

    }
	public static void main(String[] args) 
	{
		Spiel spiel = new Spiel ();
        spiel.spielen();


	}

}
