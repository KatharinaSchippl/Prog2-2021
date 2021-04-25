package Vorbereitung;

public class Welt 
{
private Kontinent [] kontinente;

public Welt(Kontinent[] kontinente)
{
	this.kontinente = kontinente;
}
public int anzahlLaender()
{
for(int anzahlLaender()
{
    int anzahl = 0;
    for (int index = 0; index < this.kontinente.length; index++)
    {
        anzahl += this.kontinente[index].getAnzLaender();
    }
    return anzahl;}
}
public Land [] getAlleLaender() 
{
	Land[] alleLaender = new Land[this.anzahlLaender()];
    int indexAlle = 0;

    for (int kontinent = 0; kontinent < this.kontinente.length; kontinent++)
    {
        for(int index = 0; index < this.kontinente[kontinent].getAnzLaender(); index++)
        {
            alleLaender[indexAlle++] = this.kontinente[kontinent].getLandAtIndex(index);
        }
    }
    return alleLaender;
}
public void printAlleLaender(Land[] alleLaender)
{
	
}












}
