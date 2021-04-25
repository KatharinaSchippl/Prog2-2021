package Uebung;

public class uebungUebung9Pizzaverkauf 
{
	  uebungUebung9Pizza pizza;
	    int anzVerkaeufe;

	    public uebungUebung9Pizzaverkauf(uebungUebung9Pizza pizza)
	    {
	        this.pizza = pizza;
	        this.anzVerkaeufe = 0;
	    }

	    public void verkaufen()
	    {
	        this.anzVerkaeufe++;
	    }

	    public uebungUebung9Pizza getPizza()
	    {
	        return this.pizza;
	    }

	    public int getAnzVerkaeufe()
	    {
	        return this.anzVerkaeufe;
	    }

	    public double umsatz()
	    {
	        return this.anzVerkaeufe * this.pizza.getPreis();
	    }

	    @Override
	    public String toString()
	    {
	        return String.format("Pizza %s wurde %d mal zum Preis von %.2f Euro verkauft.", 
	                this.pizza.getName(), this.anzVerkaeufe, this.pizza.getPreis());
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }
}
