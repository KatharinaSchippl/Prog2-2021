package Uebung;

public class uebungUebungenUhrzeit 
{
	 private int stunden;
	    private int minuten;
	    private int sekunden;

	    public uebungUebungenUhrzeit(int sekunden)
	    {
	        final int STUNDE = 3600;
	        final int MINUTE = 60;

	        this.stunden = (sekunden/STUNDE)%24;
	        int rest = sekunden%STUNDE; 
	        this.minuten = rest/MINUTE;
	        rest = rest%MINUTE;
	        this.sekunden = rest;
	    }

	    public int uhrZeitInSekunden()
	    {
	        final int STUNDE = 3600;
	        final int MINUTE = 60;

	        int sekunden = this.stunden*STUNDE 
	                + this.minuten*MINUTE 
	                + this.sekunden;
	        return sekunden;
	    }

	    public boolean frueher(uebungUebungenUhrzeit u)
	    {
	        return this.uhrZeitInSekunden() < u.uhrZeitInSekunden();
	    }

	    public boolean spaeter(uebungUebungenUhrzeit u)
	    {
	        return this.uhrZeitInSekunden() > u.uhrZeitInSekunden();
	    }

	    public uebungUebungenUhrzeit jetztPlusXSekunden(int sekunden)
	    {
	        int jetzt = this.uhrZeitInSekunden();
	        int neu = jetzt + sekunden;

	        return new uebungUebungenUhrzeit(neu);
	    }

	    public int differenzInSekunden(uebungUebungenUhrzeit u)
	    {
	        int uhrzeit1 = this.uhrZeitInSekunden();
	        int uhrzeit2 = u.uhrZeitInSekunden();
	        int diff    = Math.abs(uhrzeit1-uhrzeit2);
	        return diff;
	    }

	    @Override
	    public String toString()
	    {
	        String s = "";
	        if(this.stunden<10)
	        {
	            s = s + "0";
	        }
	        s = s + this.stunden +":";
	        if(this.minuten<10)
	        {
	            s = s + "0";
	        }
	        s = s + this.minuten +":";
	        if(this.sekunden<10)
	        {
	            s = s + "0";
	        }
	        s = s + this.sekunden;

	        return s;
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }
}
