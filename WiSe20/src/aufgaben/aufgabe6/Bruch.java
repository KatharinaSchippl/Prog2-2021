package aufgaben.aufgabe6;
/*
 * Katharina Schippl
 * bearbeitet mit Thao Trang Le
 * 
 */
public class Bruch 
{
    //-----Objektvariablen-----
    private int zaehler;
    private int nenner;
    
    //-----zweiKonstruktoren-----
    public Bruch()
    {
        this.zaehler=1;
        this.nenner=1;
    }
    
    public Bruch (int zaehler, int nenner)
    {
        this.zaehler=zaehler;
        this.nenner=nenner;
    }
    
    //-----Objektmethoden-----
    
    public Bruch plus (Bruch b)
    {
        int newNenner= this.nenner*b.nenner;
        int newZaehler1=this.zaehler*b.nenner;
        int newZaehler2=b.zaehler*this.nenner;
        int newZaehler = newZaehler1+newZaehler2;
        Bruch b1 = new Bruch (newZaehler, newNenner);
        return b1.kuerzen();        
    }
    
    public Bruch minus (Bruch b)
    {
        int newNenner= this.nenner*b.nenner;
        int newZaehler1=this.zaehler*b.nenner;
        int newZaehler2=b.zaehler*this.nenner;
        int newZaehler = newZaehler1-newZaehler2;
        Bruch b1 = new Bruch (newZaehler, newNenner);
        return b1.kuerzen();
    }
    
    public Bruch mal (Bruch b)
    {
        int newZaehler= this.zaehler*b.zaehler;
        int newNenner= this.nenner*b.nenner;
        Bruch b1 = new Bruch (newZaehler, newNenner);
        return b1.kuerzen();
    }
    
    public Bruch geteilt (Bruch b)
    {
        int newZaehler= this.zaehler*b.nenner;
        int newNenner= this.nenner*b.zaehler;
        Bruch b1 = new Bruch (newZaehler, newNenner);
        return b1.kuerzen();        
    } 
    
    public Bruch kuerzen()
    {
        int ggT = this.ggT(this.zaehler, this.nenner);
        int newZaehler = this.zaehler/ggT;
        int newNenner = this.nenner/ggT;
        return new Bruch (newZaehler, newNenner);
    }
    
    
    public int ggT (int zahl1, int zahl2)
    {
        /*solange a ungleich b ist, wiederhole
        wenn a größer ist als b, dann:
        ziehe b von a ab und weise das Ergebnis a zu
        andernfalls:
        ziehe a von b ab und weise das Ergebnis b zu
        wenn a gleich b ist, dann:
        a (oder auch b) ist der gesuchte ggT*/
        
        zahl1 = this.zaehler;
        zahl2 = this.nenner;
        
    
        int rest;
        while(zahl2!=0)
        {
            rest = zahl1 % zahl2;
            zahl1 = zahl2;
            zahl2 = rest;
        }
        return zahl1;
         /*while (zahl1!=zahl2)
        {
            if (zahl1>zahl2)
            {
                zahl1 = zahl2-zahl1;    
            }
            else
            {
                zahl2 = zahl1-zahl2;    
            }    
         }
         
        return zahl1;*/
        /*if (zahl2==0) 
        {
            return zahl1;
        }
        else
        {
        return ggT(zahl2, zahl1%zahl2);    
        }*/
    }
    
    public String toString()
    {
        String Bruch = String.format ("%1d/%1d", this.zaehler,this.nenner);
        return Bruch;
        
        // return this.zaehler + "/" + this.nenner;
    }
    //ab hier Zusatzaufgabe:
    
    //-----weitere Objektmethoden-----
    //Brüche mit ungleichen Zählern und Nennern vergleichen
    
    public boolean isGreater (Bruch b)
    {
        return this.zaehler*b.nenner>this.nenner*b.zaehler;
    }
    
    public boolean isSmaller (Bruch b)
    {
        return this.zaehler*b.nenner<this.nenner*b.zaehler;
    }
    
    public boolean isEqual (Bruch b)
    {
        return this.zaehler*b.nenner==this.nenner*b.zaehler;
    }
}
 
