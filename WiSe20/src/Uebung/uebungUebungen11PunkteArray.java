package Uebung;

import java.util.Random;

public class uebungUebungen11PunkteArray 
{
	  private uebungUebungen11Punkt2D[] punkte;

	    public uebungUebungen11PunkteArray(int anzahl)
	    {
	        this.punkte = new uebungUebungen11Punkt2D[anzahl];
	    }

	    public boolean contains(uebungUebungen11Punkt2D p)
	    {
	        for (int index = 0; index < this.punkte.length; index++)
	        {
	            if(this.punkte[index] != null && this.punkte[index].equals(p)) 
	            {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void fillArray()
	    {
	        Random r = new Random();
	        for(int index=0; index < this.punkte.length; index++)
	        {
	            int x = r.nextInt(10);
	            int y = r.nextInt(10);
	            uebungUebungen11Punkt2D p = new uebungUebungen11Punkt2D(x,y);
	            while(this.contains(p))
	            {
	                x = r.nextInt(10);
	                y = r.nextInt(10);
	                p = new uebungUebungen11Punkt2D(x,y);
	            }
	            this.punkte[index] = p;
	        }
	    }

	    @Override
	    public String toString()
	    {
	        String s = "[ ";
	        for(int index=0; index < this.punkte.length; index++)
	        {
	            if(index<this.punkte.length-1)
	            {
	                s += this.punkte[index].toString() + ", ";
	            }
	            else
	            {
	                s += this.punkte[index].toString();
	            }
	        }
	        s += " ]";
	        return s;
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }

	    public uebungUebungen11Strecke[] createPolygon()
	    {
	    	uebungUebungen11Strecke[] polygon = new uebungUebungen11Strecke[this.punkte.length];
	        for(int index=0; index < this.punkte.length-1; index++)
	        {
	            polygon[index] = new uebungUebungen11Strecke(this.punkte[index], this.punkte[index+1]);
	        }
	        int index = this.punkte.length-1;
	        polygon[index] = new uebungUebungen11Strecke(this.punkte[index], this.punkte[0]);
	        return polygon;
	    }

	    public void printStrecken()
	    {
	    	uebungUebungen11Strecke[] polygon = this.createPolygon();
	        for(int index=0; index < polygon.length; index++)
	        {
	            polygon[index].print();
	        }
	        System.out.printf("Gesamtlaenge der Strecken : %7.4fcm %n", this.gesamtLaenge());
	        System.out.printf("am weitesten links        : %s %n", this.amWeitestenLinks().toString());
	        System.out.printf("am weitesten oben         : %s %n", this.amWeitestenOben().toString());
	        System.out.printf("laengste                  : %s %n", this.laengsteStrecke().toString());

	    }

	    public double gesamtLaenge()
	    {
	    	uebungUebungen11Strecke[] polygon = this.createPolygon();
	        double gesamtLaenge = 0.0;
	        for(int index=0; index < polygon.length; index++)
	        {
	            gesamtLaenge += polygon[index].laenge();
	        }
	        return gesamtLaenge;
	    }

	    public uebungUebungen11Punkt2D amWeitestenLinks()
	    {
	        int indexLinks = 0;
	        for(int index=0; index < this.punkte.length-1; index++)
	        {
	            if(this.punkte[index].xIsSmaller(this.punkte[indexLinks]))
	            {
	                indexLinks = index;
	            }
	        }
	        return this.punkte[indexLinks];
	    }

	    public uebungUebungen11Punkt2D amWeitestenOben()
	    {
	        int indexOben = 0;
	        for(int index=0; index < this.punkte.length-1; index++)
	        {
	            if(this.punkte[index].yIsSmaller(this.punkte[indexOben]))
	            {
	                indexOben = index;
	            }
	        }
	        return this.punkte[indexOben];
	    }

	    public uebungUebungen11Strecke laengsteStrecke()
	    {
	    	uebungUebungen11Strecke[] polygon = this.createPolygon();
	        int indexLaengste = 0;
	        for(int index=0; index < polygon.length; index++)
	        {
	            if(polygon[index].laenge() > polygon[indexLaengste].laenge())
	            {
	                indexLaengste = index;
	            }
	        }
	        return polygon[indexLaengste];
	    }
}
