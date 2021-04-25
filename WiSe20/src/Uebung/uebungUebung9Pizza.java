package Uebung;

public class uebungUebung9Pizza 
{
	 String name;
	    float preis;

	    public uebungUebung9Pizza(String name, float preis)
	    {
	        this.name = name;
	        this.preis = preis;
	    }

	    public String getName()
	    {
	        return this.name;
	    }

	    public float getPreis()
	    {
	        return this.preis;
	    }

	    @Override
	    public String toString()
	    {
	        return String.format("Die Pizza %s kostet %.2f Euro.", this.name, this.preis);
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }

	    @Override
	    public boolean equals(Object o)
	    {
	        if(o == null) return false;
	        if(this == o) return true;
	        if(this.getClass() != o.getClass()) return false;

	        uebungUebung9Pizza po = (uebungUebung9Pizza)o;
	        return (this.name.equals(po.name));
	    }
}
