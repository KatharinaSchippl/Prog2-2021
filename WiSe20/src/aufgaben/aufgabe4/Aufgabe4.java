package aufgaben.aufgabe4;
/*
 * @author Katharina Schippl
 * @author Thao Trang Le
 */

import java.util.Random;

public class Aufgabe4 {

	public static char [] createAndFillCharArray ()
	{
	char [] alphabet = new char [25]; // ,wenn 26, dann würden alle Buchstaben des Alphabets sichtbar sein

	Random r = new Random ();
	int toInclusive = 122;
	int fromInclusive = 97;
	int counter = 0;
	while(counter<alphabet.length)
		{
			char element = (char) (r.nextInt(26)+97);
			if(!contains(alphabet, element))
			{
				alphabet[counter] =element;
				counter++; //hier wird der Wert verändert
			}
		}
	/*System.out.print("[");
	for(int index = 0; index < alphabet.length-1;index++)
		{
		int bound = ( toInclusive - fromInclusive) + 1; // +1 wegen toInclusive soll auch
	int randomNumber = r.nextInt(bound) + fromInclusive;
		char buchstabe = (char) randomNumber;
		
		System.out.print(buchstabe + ", "); //Komma einfügen
		}
		System.out.println(alphabet[alphabet.length-1]+" ]");		
*/
	return alphabet;
	}
	
	public static boolean contains(char[] alphabet, char element)
	{
	    boolean found = false;
	    for(int index=0; index<alphabet.length && !found; index++)
	    {
	        if(alphabet[index]==element)
	        {
	            found = true;
	        }
	    }
	    return found; 
	}
	
	/* Aus dem Tutorium: 
	 * public static char[] createAndFillCharArray()
	 
	{
		char[] cA = new char[25];
		Random r = new Random();
		for(int index= 0; index<cA.length; index++)
		{
			int randNr=r.nextInt(26)+97;		//alphabet hat 26 Buchstaben //97 ab da wird angefangen in der Tabelle
			char c = (char) randNr;
			while(contains(cA, c))
			{
				randNr=r.nextInt(26)+97;		
				c = (char) randNr;
			}
			cA[index] = c; 
		}
		return cA;
	}
	public static boolean contains(char[]ca, char c)
	{
		for(char element : ca)
		{
			if(element==c)
			{
				return true;
			}
		}
		return false;
	}*/
	public static void print(char[]alphabet)
	{
		System.out.print("[");
		for(int index = 0; index < alphabet.length-1;index++)
		{
			System.out.print(alphabet[index]+ ", "); //Komma einfügen
		}
		System.out.print(alphabet[alphabet.length-1]+" ]"); //Kein Komma nach dem letzten Buchstabe
		
	}
	public static char[] sort(char[]alphabet)
	{
		char [] sorted = copy(alphabet);
		boolean swapped = true;
		for(int bubble = 1; bubble<= sorted.length-1 && swapped; bubble++)
		{
			swapped = false;
			
			for(int index= 0; index<sorted.length-bubble; index++)
			{
				if(sorted[index] > sorted[index+1])
				{
					int tmp = sorted[index+1];
					sorted[index+1] = sorted[index];
					sorted[index] = (char) tmp;
					swapped = true; 
					
				}
			}
		}
		return sorted; //"Sortieren" auf Freiheits Seite ausführlich erklärt
	}
	public static char[] copy(char[] original)
	{
		char[] copy = new char[original.length];
		for(int index = 0; index<original.length; index++)
		{
			copy[index]= original[index];
		}
		return copy;
	}
	// Andere mögliche Lösungen aus dem Tutorium
	/*public static char[] creatAndFillCharArray()
	{
		char[] cA=new char[25];
		Random r = new Random();
		
		int counter = 0;
		while(counter<cA.length)
		{
			char c = (char) (r.nextInt(26)+97);
			if(!contains(cA, c))
			{
				cA[counter] =c;
				counter++; //hier wird der Wert verändert
			}
		}
		return cA;
	}*/
	
	public static void main(String[] args)
	{
		//char[] letters = createAndFillCharArray();
		//print(letters);
		System.out.printf("%n%n----------------- Erzeugen ------------------%n%n");
		char[] letters = createAndFillCharArray();
		print(letters);

		System.out.printf("%n%n----------------- Sortieren ------------------%n%n");        
		char[] alphabet = sort(letters);
		print(alphabet); 
		
		char[] test = {'a','b', 'c','d'};
		System.out.println(contains (test, 'e'));
		
		
	}
	}
