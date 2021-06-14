package uebung1;

public class Stadt 
{

	//import

	//1. Erstellen Sie eine Klasse Stadt mit folgenden Objektvariablen:
	public class Stadt implements ???<???> 
	// Der Teil mit "implements" wird nicht von Anfang an benötigt, es kann also auch erstmal mit "public class Stadt" begonnen werden. 
	// Während es bei primitiven Datentypen meist eindeutig ist, ob ein Wert größer, kleiner oder gleich groß ist wie ein anderer Wert, ist die Ordnung bei Objekten nicht so klar.
	// Daher muss Stadt Klasse ein bestimmtes Interface implementieren, um festzulegen, was verglichen werden soll. 
	{
	    String name;
	    List<Integer> bevoelkerung;
	    float flaeche;

	    //2. Erstellen Sie für die Klasse Stadt einen parametrisierten Konstruktor 
	    //public Stadt(String name, List<Integer> bevoelkerung, float flaeche), 
	    //der die Objektvariablen initialisiert.
	    public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
	    {
	        //Da es sich um einen Konstruktor einer Kindklasse handelt, sollte zuerst explizit der Konstruktor der Elternklasse aufrufen werden
	        //kann aber wie implements erst später ergänzt werden

	        //Objektvariablen initialisieren
	        this.name = name;
	        this.bevoelkerung = bevoelkerung;
	        this.flaeche = flaeche;
	        
	    }

	    //3. Erstellen Sie für die Klasse Stadt eine print()-Methode, 
	    //so dass eine Ausgabe auf der Konsole in folgender Form erscheint (Bsp.): 
	    //Berlin     891,68 km2    3.382.169   3.460.725   3.574.830
	    void print()
	    {
	        //Namen der Stadt, ihre Fläche und "km2" ausgeben

	        //mithilfe einer Schleife oder Iterator Einträge der Bevölkerungs-Liste ausgeben
	        //Beispiel für Schleife: 
	        //https://freiheit.f4.htw-berlin.de/prog2/collections/#die-for-each-schleife
	        //Beispiel für Iterator:
	        //https://freiheit.f4.htw-berlin.de/prog2/collections/#listen

	    }

	    //Teil 2
	    //1. Implementieren Sie in der Klasse Stadt die equals(Object)- und die hashCode()-Methode.
	    //Führen Sie danach die StadtTest-Klasse erneut aus. Was hat sich an der Menge geändert?
	    //Kommentieren Sie hashCode() wieder aus und führen StadtTest erneut aus. Was ändert sich?
	    //Kommentieren Sie equals() wieder aus und führen StadtTest erneut aus. Was ändert sich?

	    @Override
	    public boolean equals(Object o)
	    {
	        //Es soll getestet werden, ob der Name des übergebenen Stadt-Objekts o gleich dem Namen des aktuellen Stadt-Objekts ist
	        //Vorher müssen erst ein paar Fälle abgeklärt werden:       
	        // wenn übergebenes Objekt o null ist, gib false zurück
	        // wenn übergebenes Objekt o gleich dem aktuellen Objekt der Klasse ist, gib true zurück
	        // wenn die Laufzeitklasse des übergebenen Objekts o nicht gleich der Laufzeitklasse des aktuellen Objekts ist,
	        // gib false zurück

	        //Wenn diese drei Fälle nicht eingetreten sind:
	        //Stadt-Objekt anlegen vom übergebenen Objekt o     
	        //testen ob der Name des übergebenen Stadt-Objekts gleich dem Namen des aktuellen Stadt-Objekts ist
	        //Ergebnis zurückgeben      

	    }

	    @Override
	    public int hashCode()
	    {
	        //Hashcode des Stadtnamens zurückgeben
	    }


	    //Festlegen, dass der Name des übergebenen Stadt-Objekts o mit dem Namen des aktuellen Stadt-Objekts verglichen werden soll
	    @Override
	    public int compareTo(Stadt o)
	    {
	        return ...
	    }}
}