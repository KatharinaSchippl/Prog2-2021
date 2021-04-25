package Uebung;

import java.util.Random;

public class uebungUebung8Haus 
{
	private uebungUebung8Wohnung[] wohnungen;

    public uebungUebung8Wohnung neueWohnung()
    {
        Random r = new Random();
        int qm = r.nextInt(5) * 20 + 20;
        int anzZimmer = r.nextInt(5) + 1;
        int etage = r.nextInt(6);
        double qmMiete = r.nextInt(10) * 0.5 + 8.0;

        return new uebungUebung8Wohnung(qm, anzZimmer, etage, qmMiete);
    }

    public uebungUebung8Haus(int anzWohnungen)
    {
        this.wohnungen = new uebungUebung8Wohnung[anzWohnungen];
        for (int index = 0; index < this.wohnungen.length; index++)
        {
            this.wohnungen[index] = this.neueWohnung();
        }
    }

    public void print()
    {
        System.out.println("Das Haus besteht aus :");
        for (int index = 0; index < this.wohnungen.length; index++)
        {
            this.wohnungen[index].print();  // print()-Methode von Wohnung
        }
    }

    public uebungUebung8Wohnung[] wohnungenInEtage(int etage)
    {
        int anzWohnungenInEtage = 0;
        for (int index = 0; index < this.wohnungen.length; index++)
        {
            if(this.wohnungen[index].getEtage()==etage)
            {
                anzWohnungenInEtage++;
            }
        }

        uebungUebung8Wohnung[] wohnungenInEtage = new uebungUebung8Wohnung[anzWohnungenInEtage];
        int indexWIE = 0;
        for (int index = 0; index < this.wohnungen.length; index++)
        {
            if(this.wohnungen[index].getEtage()==etage)
            {
                wohnungenInEtage[indexWIE] = this.wohnungen[index];
                indexWIE++;
            }
        }
        return wohnungenInEtage;
    }

    public void print(uebungUebung8Wohnung[] warr)
    {
        for (int index = 0; index < warr.length; index++)
        {
            warr[index].print();    // print()-Methode von Wohnung
        }
    }

    public uebungUebung8Wohnung teuersteWohnung()
    {
        int indexMax = 0;

        for (int index = 0; index < this.wohnungen.length; index++)
        {
            if(this.wohnungen[index].teurer(this.wohnungen[indexMax]))
            {
                indexMax = index;
            }
        }

        return this.wohnungen[indexMax];
    }

    public double gesamtMieteHaus()
    {
        double gesamtMieteHaus = 0.0;
        for (int index = 0; index < this.wohnungen.length; index++)
        {
            gesamtMieteHaus = gesamtMieteHaus + this.wohnungen[index].gesamtMiete();
        }
        return gesamtMieteHaus;
    }

    public void sortieren()
    {
        for(int bubble = 1; bubble < this.wohnungen.length; bubble++)
        {
            for(int index = 0; index < this.wohnungen.length - bubble; index++)
            {
                if(this.wohnungen[index].teurer(this.wohnungen[index + 1]))
                {
                	uebungUebung8Wohnung tmp = this.wohnungen[index];
                    this.wohnungen[index] = this.wohnungen[index + 1];
                    this.wohnungen[index + 1] = tmp;
                }
            }
        }
    }
}
