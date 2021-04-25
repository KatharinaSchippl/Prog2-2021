package Vorbereitung;

public class Wohnung 
{
int qm;

int anzZimmer;
int etage;
double qmMiete;

public Wohnung (int qm, int anzZimmer, int etage, double qmMiete)
{
	this.qm=qm;
	this.anzZimmer=anzZimmer;
	this.etage= etage;
	this.qmMiete= qmMiete;
}
public int getQm() 
{
	return qm;
}

public int getAnzZimmer() 
{
	return anzZimmer;
}

public int getEtage() 
{
	return etage;
}

public double getQmMiete() 
{
	return qmMiete;
}
public double gesamtMiete()
{
	double gesamtMiete= qm * qmMiete;
	return gesamtMiete;
}
public boolean billiger(Wohnung w)
{
	return this.gesamtMiete() < w.gesamtMiete();
 }
public boolean teurer(Wohnung w)
{
	return this.gesamtMiete() > w.gesamtMiete();
}
public String toString()
{
	String s= "";
	if(this.etage==0)
	{
		s= String.format("%d-Zimmer Wohnung mit %d qm im Erdgeschoss. Monatliche Miete: %.2f Euro", this.anzZimmer, this.qm, this.gesamtMiete());
	}
	else
	{
		s= String.format("%d-Zimmer Wohnung mit %d qm in der %d. Etage. Monatliche Miete: %.2f Euro", this.anzZimmer, this.qm,this.etage, this.gesamtMiete());
	}
	return s;
}
public void print()
{
	System.out.println(this.toString());
}
}



