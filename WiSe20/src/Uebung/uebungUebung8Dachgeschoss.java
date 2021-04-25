package Uebung;


public class uebungUebung8Dachgeschoss extends uebungUebung8Wohnung
{
    // alle Objektvariablen von Wohnung geerbt
    // qm, anzZimmer, etage, qmMiete
    // alle Objektmethoden von Wohnung geerbt

    public uebungUebung8Dachgeschoss(int qm, int anzZimmer, double qmMiete)
    {
        super(qm, anzZimmer, 5, qmMiete);   // Konstruktor Wohnung
    }

    @Override
    public String toString()
    {
        String s= "";
        s = String.format("%d-Zimmer Wohnung mit %d qm in der %d. Etage. Monatliche Miete: %.2f Euro", 
                this.getAnzZimmer(), this.getQm(), this.getEtage(), this.gesamtMiete() );
        return s;
    }
}