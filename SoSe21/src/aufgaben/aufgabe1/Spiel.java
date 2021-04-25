package aufgaben.aufgabe1;

import javax.swing.JOptionPane;

public class Spiel 
{
	 /*
     * THAO TRANG LE (anny)
     * bearbeitet mit KATHARINA SCHIPPL
     */
    public static int siegPunkte; //static, weil man das nicht ändert
    private static Spieler [] spieler; //auch ohne static möglich
    
    
    public Spiel () //ohne public?
    {
        anzSpieler();
        siegPunkte();
        nameDesSpielers();
    }
    
    public void anzSpieler()
    {
        int anzSpieler = 0;
        boolean inputOk = false; //wir gehen davon aus, dass die eingabe nicht ok ist
        while(!inputOk)
        {
            try 
            {
                String input = JOptionPane.showInputDialog("Anzahl Spieler:");
                inputOk = true;
                anzSpieler=Integer.parseInt(input); //falls das nicht klappt, dann exceptionbehandlung
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
        boolean inputOk = false; //wir gehen davon aus, dass die eingabe nicht ok ist
        while(!inputOk)
        {
            try 
            {
                String input = JOptionPane.showInputDialog("Siegpunkte:");
                inputOk = true;
                siegPunkte=Integer.parseInt(input); //falls das nicht klappt, dann exceptionbehandlung
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
            index=(index<spieler.length-1) ? index+1 : 0; //wenn ja index +1 und wenn nein 0
            /*if (index<spieler.length-1) 
             * {
             * index = index+1;
             * }
             * else
             * {
             * index = 0;
             * }
             */
        }


	public static void main(String[] args) 
	{
		Spiel spiel = new Spiel ();
        spiel.spielen();


	}

}
