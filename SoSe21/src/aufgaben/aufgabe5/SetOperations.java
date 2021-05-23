package aufgaben.aufgabe5;
import java.util.*;
/*
 * Katharina Schippl
 * 
 * bearbeitet mit @ Thao Trang Le (Anny)
 */

public class SetOperations 
{ //---Erzeugen von Objektvariablen----
	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	
	
	final static int UPPER_BOUND = 100;
	
	
	public SetOperations()

	{ //---Erzeugen von TreeSet-Objekte für OV
		this.numbers1 = new TreeSet<>();
		this.numbers2 = new TreeSet<>();
		this.both = new TreeSet<>();
	}
	
	public void fill()
	{
		for(int i=0; i<UPPER_BOUND; i++) // hier von 0-99, weil UB=100
		{
			Random r = new Random();
			this.numbers1.add(Integer.valueOf(r.nextInt(UPPER_BOUND)));
			this.numbers2.add(Integer.valueOf(r.nextInt(UPPER_BOUND)));
		} //Methode gibt int zurück, deswegen Integer.valueOf 
	}
	
	public void fillBothUnion()
	{
		System.out.println("----------------------------Vereinigung-------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+'\u222a'+" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.addAll(numbers2);

	}
	
	public void fillBothIntersection()
	{
		System.out.println("----------------------------Schnitt-----------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+'\u2229'+" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.clear(); //hier erfolgt der Schnitt
		this.both.addAll(numbers1);
		this.both.retainAll(numbers2);
	}
	
	public void fillBothDifference()
	{
		System.out.println("----------------------------Differenz---------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                          A-B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.removeAll(numbers2);
	}
	
	
	public void print()
	{
		int counter1=0;
		int counter2=0;
		int counterboth=0;
		for(int curRow=0; curRow<10; curRow++) //Zeile bis 10
		{
			for(int curCol=0; curCol<10; curCol++)//Spalte bis 10
			{
				if(this.numbers1.contains(Integer.valueOf(counter1)))
				{
					System.out.print(" " + '\u25cf');
				}
				
				else
				{
					System.out.print(" " + '\u2009');
				}
				
				counter1++;
			}
			
			printSpaces(8);
			
			for(int curCol=0; curCol<10; curCol++)
			{
				if(this.numbers2.contains(Integer.valueOf(counter2)))
				{
					System.out.print(" "+ '\u25cf'); // ? übertragen --> gutes Bspl. im Tutorium 
				}
				
				else
				{
					System.out.print(" " + '\u2009');
				}
				
				counter2++;
			}
			
			printSpaces(8);
			
			for(int curCol=0; curCol<10; curCol++)
			{
				if(this.both.contains(Integer.valueOf(counterboth)))
				{
					System.out.print(" " + '\u25cf');
				}
				
				else
				{
					System.out.print(" " + '\u2009');
				} 
				
				counterboth++;
			}
			System.out.println();
		}
	}
	
	private void printSpaces(int nrOfSpaces)
	{
		for(int spaces=0; spaces<nrOfSpaces; spaces++) System.out.print(" ");
	}	

}
