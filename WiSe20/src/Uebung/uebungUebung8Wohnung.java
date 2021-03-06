package Uebung;

public class uebungUebung8Wohnung 
{
	private int qm;
    private int anzZimmer;
    private int etage;
    private double qmMiete;

    public uebungUebung8Wohnung(int qm, int anzZimmer, int etage, double qmMiete)
    {
        this.qm = qm;
        this.anzZimmer = anzZimmer;
        this.etage = etage;
        this.qmMiete = qmMiete;
    }

    public int getQm()
    {
        return this.qm;
    }

    public int getAnzZimmer()
    {
        return this.anzZimmer;
    }

    public int getEtage()
    {
        return this.etage;
    }

    public double getQmMiete()
    {
        return this.qmMiete;
    }

    public double gesamtMiete()
    {
        return this.qm * this.qmMiete;
    }

    public boolean billiger(uebungUebung8Wohnung w)
    {
        return this.gesamtMiete() < w.gesamtMiete();
    }

    public boolean teurer(uebungUebung8Wohnung w)
    {
        return this.gesamtMiete() > w.gesamtMiete();
    }

    public String toString()
    {
        String s = "";
        if(this.etage == 0)
        {
            s = String.format("%d-Zimmer Wohnung mit %d qm im Erdgeschoss. Monatliche Miete: %.2f Euro", 
                    this.anzZimmer, this.qm, this.gesamtMiete() );
        }
        else
        {
            s = String.format("%d-Zimmer Wohnung mit %d qm in der %d. Etage. Monatliche Miete: %.2f Euro", 
                    this.anzZimmer, this.qm, this.etage, this.gesamtMiete() );
        }
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }
}
