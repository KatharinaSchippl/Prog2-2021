package uebung1;

import java.util.List;

public class StadtTestklasse 
{//import 

	//4. Erstellen Sie eine Klasse StadtTest mit main()-Methode. 
	//Kopieren Sie in die Klasse die Methode public static Stadt[] staedte() hinein: 

	public static void main(String[] args)
	{
		 Stadt[] staedte = new Stadt[6];
	        List<Integer> berlinBevoelkerung = new ArrayList<>();
	        berlinBevoelkerung.add(3382169);    
	        berlinBevoelkerung.add(3460725);    
	        berlinBevoelkerung.add(3574830);
	        staedte[0] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

	        List<Integer> hamburgBevoelkerung = new ArrayList<>();
	        hamburgBevoelkerung.add(1715392);   
	        hamburgBevoelkerung.add(1786448);   
	        hamburgBevoelkerung.add(1810438);   
	        staedte[1] = new Stadt("Hamburg", hamburgBevoelkerung, 755.22f);

	        List<Integer> muenchenBevoelkerung = new ArrayList<>();
	        muenchenBevoelkerung.add(1210223);  
	        muenchenBevoelkerung.add(1353186);  
	        muenchenBevoelkerung.add(1464301);
	        staedte[2] = new Stadt("Muenchen", muenchenBevoelkerung, 310.70f);

	        List<Integer> koelnBevoelkerung = new ArrayList<>();
	        koelnBevoelkerung.add(962884);  
	        koelnBevoelkerung.add(1007119); 
	        koelnBevoelkerung.add(1075935); 
	        staedte[3] = new Stadt("Koeln", koelnBevoelkerung, 405.02f);

	        List<Integer> frankfurtBevoelkerung = new ArrayList<>();
	        frankfurtBevoelkerung.add(648550);  
	        frankfurtBevoelkerung.add(679664);  
	        frankfurtBevoelkerung.add(736414);
	        staedte[4] = new Stadt("Frankfurt/Main", frankfurtBevoelkerung, 248.31f);

	        berlinBevoelkerung = new ArrayList<>();
	        berlinBevoelkerung.add(3382169);    
	        berlinBevoelkerung.add(3460725);    
	        berlinBevoelkerung.add(3574830);
	        staedte[5] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

	        return staedte;
	    }

	    public static void main(String[] args)
	    {   
	        System.out.printf("%n------------ Liste --------------%n");

	        //1. Erstellen Sie in der main()-Methode eine List<Stadt> staedteListe = new ArrayList<>();. 
	        //F�gen Sie der staedteListe alle St�dte aus dem durch Aufruf der staedte()-Methode erzeugtem Array zu.
	        List<Stadt> staedteListe = new ArrayList<>();

	        //durch staedte iterieren und die St�dte zur staedteListe hinzuf�gen

	        //2. Geben Sie alle Informationen �ber alle St�dte aus der Liste unter Verwendung 
	        //der print()-Methode aus der Klasse Stadt aus.

	        //durch staedteListe iterieren und f�r jeden Eintrag die print()-Methode aufrufen

	        System.out.printf("%n------------ Menge --------------%n");

	        //1. Erstellen Sie in der main()-Methode eine Set<Stadt> staedteMenge = new HashSet<>();. 
	        Set<Stadt> staedteMenge1 = new HashSet<>();

	        //F�gen Sie der staedteMenge alle St�dte aus dem durch Aufruf der staedte()-Methode erzeugtem Array zu.

	        //analog zur gleichen Aufgabe mit der Liste oben

	            //Geben Sie alle Informationen �ber alle St�dte aus der Liste unter Verwendung der 
	            //print()-Methode aus der Klasse Stadt aus.
	            //analog zur gleichen Aufgabe mit der Liste oben

	        //Berlin erscheint doppelt, obwohl eine Menge keine doppelten Elemente enthalten darf. Warum?
	        //Notieren Sie sich die Reihenfolge, in der St�dte ausgegeben werden.
	        //�ndern Sie den Konstruktor von HashSet<>() in TreeSet<>(). Was passiert und warum?        
	        Set<Stadt> staedteMenge2 = new TreeSet<>();
	        //analog zu oben


	        System.out.printf("%n------------ Maps --------------%n");

	        //1. Erstellen Sie in der main()-Methode eine Map<Integer, Stadt> staedteMap = new HashMap<>();. 
	        Map<Integer, Stadt> staedteMap = new HashMap<>();

	        //F�gen Sie der staedteMap einen fortlaufenden, eindeutigen Integer-Wert beginnend mit 1 als Key 
	        //sowie alle alle St�dte aus dem durch Aufruf der staedte()-Methode erzeugtem Array als Value hinzu.

	            //Geben Sie alle Informationen �ber alle St�dte aus der Liste unter Verwendung der print()-Methode aus der Klasse Stadt aus. 
	            //Beginnen Sie die Zeile jeweils mit der Ausgabe des Keys.

	        //Beispiel, wie man eine Map durchgeht: https://freiheit.f4.htw-berlin.de/prog2/maps/#durch-eine-map-laufen
	        //erst den key ausgeben
	        //dann die Werte


	    }


	}

}