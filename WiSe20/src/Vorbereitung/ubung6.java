package Vorbereitung;

public class ubung6 
{
private double guthaben;
private int pin;
private double dispoGrenze;

public ubung6(int pPin)
{
	this.pin=pPin;
	this.guthaben=0;
	this.dispoGrenze= -1000;
}
public void einzahlen(double betrag)
{
	guthaben= guthaben + betrag;
	System.out.printf("Es wurden %.2f Euro eingezahlt.%n", betrag);
}
public void kontoauszug(int pPin)
{
	if(pPin==pin)
	{
		System.out.printf("Ihr aktuelles Guthaben beträgt %.2f Euro.", guthaben);
	}
	else
	{
		System.out.println("Falsche Pin!");
	}
}
public void auszahlen(int pPin, double betrag)
{
	if(pPin==pin)
	{
		if(guthaben - dispoGrenze >= guthaben)
		{
			betrag= guthaben - betrag;
			System.out.printf("Es wurden %.2f Euro ausgezahlt.",betrag );
		}
		else
		{
			System.out.printf("Ihr Guthaben reicht  nicht um %.2f Euro auszuzahlen.", betrag);
		}
	}
	else
	{
		System.out.println("Falsche Pin!");
	}
}
public void zinsenZahlen()
{
	final double dispoZinsen = 12;
	final double guthabenZinsen= 0.5;
	
	if(guthaben > 0)
	{
		double zinsen= guthaben * guthabenZinsen / 100;
	guthaben = guthaben + zinsen;
		System.out.printf("Es wurden %.2f Euro Zinsen auf Ihr Konto gutgeschrieben", zinsen);
	}
	else
	{
		double zinsen = guthaben * dispoZinsen / 100;
		guthaben= guthaben + zinsen;
		System.out.printf("Es wurden %.2f Zinsen von Ihrem Konto abgebucht", -zinsen);
	}
}
}
