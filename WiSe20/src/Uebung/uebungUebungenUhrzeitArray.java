package Uebung;

import java.util.Random;

public class uebungUebungenUhrzeitArray 
{
	 private uebungUebungenUhrzeit[] uhren;

	    public uebungUebungenUhrzeitArray(int laenge)
	    {
	        this.uhren = new uebungUebungenUhrzeit[laenge];
	    }

	    public void fill()
	    {
	        Random r = new Random();
	        for(int i=0; i<this.uhren.length; i++)
	        {
	            int zufSekunden = r.nextInt(86400);
	            this.uhren[i] = new uebungUebungenUhrzeit(zufSekunden);
	        }
	    }

	    public void print()
	    {
	        String s = "(";
	        for(int i=0; i<this.uhren.length; i++)
	        {
	            if(i<this.uhren.length-1)
	            {
	                s = s + "(" + this.uhren[i].toString() + "), ";
	            }
	            else
	            {
	                s = s + "(" + this.uhren[i].toString() + ")";
	            }
	        }
	        s = s +")";
	        System.out.println(s);
	    }

	    public uebungUebungenUhrzeit frueheste()
	    {
	    	uebungUebungenUhrzeit frueheste = this.uhren[0];
	        for(int i=1; i<this.uhren.length; i++)
	        {
	            if(this.uhren[i].frueher(frueheste))
	            {
	                frueheste = this.uhren[i];
	            }
	        }
	        return frueheste;
	    }

	    public uebungUebungenUhrzeitArray zwischen(uebungUebungenUhrzeit frueh, uebungUebungenUhrzeit spaet)
	    {
	        int anzZwischen = 0;
	        for(uebungUebungenUhrzeit u : this.uhren)
	        {
	            if(frueh.frueher(u) && u.frueher(spaet))
	            {
	                anzZwischen++;
	            }
	        }
	        uebungUebungenUhrzeitArray ua = new uebungUebungenUhrzeitArray(anzZwischen);
	        int uaIndex = 0;
	        for(int i=0; i<this.uhren.length; i++)
	        {
	            if(frueh.frueher(this.uhren[i]) 
	                    && this.uhren[i].frueher(spaet))
	            {
	                ua.uhren[uaIndex] = this.uhren[i];
	                uaIndex++;
	            }
	        }
	        return ua;
	    }

	    public void sortieren()
	    {
	        for(int bubble=0; bubble<this.uhren.length-1; bubble++)
	        {
	            for(int i=0; i<this.uhren.length-1-bubble; i++)
	            {
	                if(this.uhren[i+1].frueher(this.uhren[i]))
	                {
	                	uebungUebungenUhrzeit temp = this.uhren[i];
	                    this.uhren[i] = this.uhren[i+1];
	                    this.uhren[i+1] = temp;
	                }
	            }
	        }
	    }

	    public uebungUebungenUhrzeitArray kleinsterAbstand()
	    {
	        this.sortieren();
	        uebungUebungenUhrzeit u1 = this.uhren[0];
	        uebungUebungenUhrzeit u2 = this.uhren[1];
	        int kleinsterAbstand = u1.differenzInSekunden(u2);
	        for(int i=1; i<this.uhren.length-1; i++)
	        {
	            if(this.uhren[i].differenzInSekunden(this.uhren[i+1]) 
	                    < kleinsterAbstand)
	            {
	                u1 = this.uhren[i];
	                u2 = this.uhren[i+1];
	                kleinsterAbstand = u1.differenzInSekunden(u2);
	            }
	        }
	        uebungUebungenUhrzeitArray ua = new uebungUebungenUhrzeitArray(2);
	        ua.uhren[0] = u1;
	        ua.uhren[1] = u2;
	        return ua;

	    }
}
