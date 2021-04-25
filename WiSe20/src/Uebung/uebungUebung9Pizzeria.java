package Uebung;

import java.util.Random;

public class uebungUebung9Pizzeria 
{
	  uebungUebung9Pizzaverkauf[] verkaeufe;

	    public uebungUebung9Pizzeria(uebungUebung9Speisekarte karte)
	    {
	        this.verkaeufe = new uebungUebung9Pizzaverkauf[karte.getLength()];
	        for (int index = 0; index < this.verkaeufe.length; index++)
	        {
	            this.verkaeufe[index] = new uebungUebung9Pizzaverkauf(karte.getPizzaAtIndex(index));
	        }
	    }

	    public int bestellen()
	    {
	        Random r = new Random();
	        int index = r.nextInt(this.verkaeufe.length);
	        return index;   
	    }

	    public void verkaufen(int index)
	    {
	        if(index>=0 && index<this.verkaeufe.length)
	        {
	            this.verkaeufe[index].verkaufen();
	        }
	    }

	    public void tagesVerkauf(int anzVerkaeufe)
	    {
	        for(int i=0; i<anzVerkaeufe; i++)
	        {
	            int index = this.bestellen();
	            this.verkaufen(index);
	        }
	    }

	    public void print()
	    {
	        for (int index = 0; index < this.verkaeufe.length; index++)
	        {
	        	uebungUebung9Pizza p = this.verkaeufe[index].getPizza();
	            int anzVerkaeufe = this.verkaeufe[index].getAnzVerkaeufe();
	            String s = String.format("%-13s : ", p.getName());
	            for(int stars = 0; stars < anzVerkaeufe; stars++)
	            {
	                s = s + "*";
	            }
	            System.out.println(s);
	        }
	    }

	    public uebungUebung9Pizza meistverkauftePizza()
	    {
	        int maxIndex = 0;
	        for (int index = 0; index < this.verkaeufe.length; index++)
	        {
	            if(this.verkaeufe[index].getAnzVerkaeufe() > this.verkaeufe[maxIndex].getAnzVerkaeufe())
	            {
	                maxIndex = index;
	            }
	        }
	        return this.verkaeufe[maxIndex].getPizza();
	    }


	    public double gesamtEinnahmen()
	    {
	        double gesamtEinnahmen = 0.0;
	        for (int index = 0; index < this.verkaeufe.length; index++)
	        {
	            gesamtEinnahmen += this.verkaeufe[index].umsatz();
	        }
	        return gesamtEinnahmen;
	    }
}
