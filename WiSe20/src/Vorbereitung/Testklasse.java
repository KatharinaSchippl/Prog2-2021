package Vorbereitung;

public class Testklasse {

	public static void main(String[] args) 
	{
		 System.out.printf("%n%n------------------ Test Land ------------------%n%n");
	        for(int i=0; i<10; i++)
	        {
	            new Land().print();
	        }
	        System.out.printf("%n%n----------------- Land equals -----------------%n%n"); 
	        Land l1 = new Land();
	        Land l2 = new Land();
	        int anz = 0;
	        while(!l1.equals(l2))
	        {
	            l2 = new Land();
	            anz++;
	        }
	        l1.print();
	        l2.print();
	        System.out.println(anz + " andere Laender erzeugt");

	}

}
