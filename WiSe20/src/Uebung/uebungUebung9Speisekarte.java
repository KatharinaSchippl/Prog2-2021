package Uebung;

public class uebungUebung9Speisekarte 
{
	private uebungUebung9Pizza[] angebot;

    public uebungUebung9Speisekarte()
    {
        this.angebot = new uebungUebung9Pizza[0];
    }

    public int getLength()
    {
        return this.angebot.length;
    }

    public void pizzaHinzufuegen(uebungUebung9Pizza pizza)
    {
    	uebungUebung9Pizza[] kopie = new uebungUebung9Pizza[this.angebot.length + 1];
        for (int index = 0; index < this.angebot.length; index++)
        {
            kopie[index] = this.angebot[index];
        }
        kopie[kopie.length - 1] = pizza;
        this.angebot = kopie;
    }

    public boolean pizzaIstImAngebot(uebungUebung9Pizza pizza)
    {
        for (int index = 0; index < this.angebot.length; index++)
        {
            if(this.angebot[index].equals(pizza))
            {
                return true;
            }
        }
        return false;
        // System.out.println("dead code");
    }

    public void pizzaLoeschen(uebungUebung9Pizza pizza)
    {
        if(this.pizzaIstImAngebot(pizza))
        {
        	uebungUebung9Pizza[] kopie = new uebungUebung9Pizza[this.angebot.length - 1];
            int indexKopie = 0;
            for (int indexAngebot = 0; indexAngebot < this.angebot.length; indexAngebot++)
            {
                if(!this.angebot[indexAngebot].equals(pizza))
                {
                    kopie[indexKopie] = this.angebot[indexAngebot];
                    indexKopie++;
                }
            }
            this.angebot = kopie;
        }
    }

    public uebungUebung9Pizza getPizzaAtIndex(int index)
    {
        if(index>=0 && index<this.angebot.length)
        {
            return this.angebot[index];
        }
        else
        {
            return null;
        }
    }

    @Override
    public String toString()
    {
        String s = String.format("====== Speisekarte ======%n");
        for (int index = 0; index < this.angebot.length; index++)
        {
            s = s + String.format("%-15s %.2f Euro %n", 
                    this.angebot[index].getName(), this.angebot[index].getPreis());
        }
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }
}
