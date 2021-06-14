package listenundmengen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
// java.util.* --> so kann man alle benötigten Klassen importieren

public class ListenUndMengen 
{ 
	private static TreeSet<Object> String;

	/*
	 * Collections: ähnlich wie Arrays, viele Elemente speichern
	 * keine feste Länge
	 * wir können nur Referenztypen speichern(also nicht int, boolean, char)
	 * Elemente verschiedenen Typs speicherbar- gar nicht gut, dehalb Typisieren
	 * Arten von Collections: List (wie Arrays), Set(keine Dopplungen), Stack, Queue,
	 *
	 * Map(2-spaltige Tabellen, links: Schlüssel(eindeutige Werte/Mengen); rechts: Werte-Paare;)
	 * Mengen: kein Index! ; Listen: haben Index!!!
	 * Menge -> dann Set(), also HashSet oder TreeSet
	 * Listen -> dann List();
	 * */

	public static void main(String[] args) 
	{
//Mengen Set: 
		System.out.println("----Mengen Set----");
		System.out.println();
		Set <String> set1 = new HashSet<>(); //Set mit nur Strings ***
		Set <String> set2 = new TreeSet<>();

		/*Menge darf nur bestimmte Elemente aufnehmen???? Wir typisieren!!
		 * dann <> vor den Namen + nach HashSet <> ()!! siehe oben!! ***
		 * 
		 */
		
//Element erstellen:
		String s1= "erster";
		String s2 = "zweiter";
		String s3 = "dritter";
		
		Integer i1=1; //Wrapperklasse
		
//Element hinzufügen: Methode gibt boolean zurück
//.add-Methode dafür anwendbar!!
		
		System.out.println(set1.add(s1));
		set1.add(s2);
		set1.add(s3);
		System.out.println(set1.add(s2));
		System.out.println(set1.add(s3));
		//System.out.println(set1.add(i1)); 
		// ->nehmen wir raus, weil diese Menge nur strings nimmt und KEINE Integer
		
		
//Wie viele Elemente sind in dieser Menge gespeichert?
//.size - Mathode dafür anwendbar!!
		
		System.out.println(set1.size()); 
		
		
//Iterator erzeugen:
		Iterator it = set1.iterator();
		
		
//wir laufen durch die Menge mit dem Iterator
//sonst wäre dies hier die normale for-Schleife mit dem Index, 
//aber da es keinen Index gibt, benutzen wir den Iterator
		while(it.hasNext()) //jedes Element wird durchlaufen
		{
			System.out.println(it.next());
		}
		System.out.println(); 
		for(String element : set1)//für jedes element vom Typ "String" in unserer ":" Menge "set1"
		{
			System.out.println(element);
		}
		//Element aus Menge löschen:
		//.remove - Methode hier einsetzbar
		System.out.println(set1.remove("erster"));
		//Beispiel für int array:
		/*int[] arr = new int[10]; 
		for(int e : arr)
		{
			System.out.println(arr);
		}
		 * 
		 */
		System.out.println("-----Listen-----");
//Listen: 						(Elemente können doppelt vorkommen)
		List <String>l1 = new ArrayList<>();
		List <String>l2 = new LinkedList<>();

		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		 for(String s : l1)
		 {
			 System.out.println(s);
		 }
		System.out.println(l1.size());
		System.out.println("gelöscht:"+ l1.remove(1));
	for(String s : l1)
	{
		System.out.println(s);
	}
	System.out.println();
	
	l2.add("neu");
	l2.add("alt");
	for(String s : l2)
	{
		System.out.println(s);
	}
	System.out.println();
	l1.addAll(l2); //komplette Collection hinzufügen von l2 zu l1
	for(String s : l1)
	{
		System.out.println(s);
	}
	System.out.println();
	l1.removeAll(l2); //ls raus aus l1
	for(String s : l1)
	{
		System.out.println(s);
	}
	System.out.println();
	}

}
