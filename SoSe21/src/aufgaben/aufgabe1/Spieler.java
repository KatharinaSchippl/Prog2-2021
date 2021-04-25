package aufgaben.aufgabe1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spieler 
{
	//-----------------Objektvariablen-------------------
    private String name;
    private int aktStand; //Speicherort für die erreichten Punkte des Spielers
    
    //----------------Konstruktor-------------------------
    public Spieler(String name) 
    {
        this.name = name;
        aktStand = 0;
    }
    
    public boolean wuerfeln ()
    {
        System.out.printf("%n%nSpieler %s ist an der Reihe (bisher %d Punkte) %n------------%n", this.name, this.aktStand);
        int punkteInDerReihe= 0;
        int wurf = 0;
        Random r = new Random ();
        boolean ende = false;
        while(!ende)
        {
            wurf = r.nextInt(6)+1; //von 1 bis 6
            System.out.printf("%s hat eine %d gewuerfelt%n", this.name, wurf);
            if (wurf == 6) //Fall für eine 6
            {
                aktStand =0; //alles wird auf 0 gesetzt
                System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : %d Punkte %n Der naechste Spieler ist dran%n", this.name, this.aktStand);
                ende = true; //Fall beendet
            }
            else if(aktStand+punkteInDerReihe+wurf >= Spiel.siegPunkte) //größer als Siegpunkte
            {
                System.out.printf("%s hat insgesamt %d Punkte und somit gewonnen!!", this.name, (aktStand+punkteInDerReihe+wurf));
                return true; // gewonnen?
            }
            else
            {
                punkteInDerReihe += wurf; //Will man weiter würfeln?
                System.out.printf(" In diesem Versuch bisher %d Punkte -- insgesamt %d Punkte %n", punkteInDerReihe, (aktStand+punkteInDerReihe));
                int dialogResult = JOptionPane.showConfirmDialog(null, this.name + ", wollen Sie weiter würfeln?", "weiter?,", JOptionPane.YES_NO_OPTION);
                ende=(dialogResult == JOptionPane.NO_OPTION); 
                if(ende)
                {
                    aktStand =+punkteInDerReihe;
                }
            }
        }
        return false; //verloren??

}
