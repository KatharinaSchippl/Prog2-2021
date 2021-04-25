package aufgaben.aufgabe6;

public class TestklasseBruch
{

	public static void main(String[] args)
	{
		
	Bruch b1 = new Bruch(3,7);
    Bruch b2 = new Bruch(4,8);
    Bruch b3 = new Bruch(2,5);
    Bruch b4 = new Bruch(5,11);
    Bruch b5 = new Bruch();
    System.out.printf("%n%n------------------------- Rechnen -----------------------------------%n%n");
    System.out.printf("%5s + %5s = %5s %n", b1.toString(), b2.toString(), b1.plus(b2).toString());
    System.out.printf("%5s - %5s = %5s %n", b3.toString(), b4.toString(), b3.minus(b4).toString());
    System.out.printf("%5s * %5s = %5s %n", b1.toString(), b3.toString(), b1.mal(b3).toString());
    System.out.printf("%5s / %5s = %5s %n", b2.toString(), b1.toString(), b2.geteilt(b1).toString());
    System.out.printf("%5s + %5s = %5s %n", b5.toString(), b4.toString(), b5.plus(b4).toString());  
    System.out.printf("%5s - %5s = %5s %n", b1.toString(), b1.toString(), b1.minus(b1).toString());     // nenner sollte ungleich 0 bleiben!   
    
    //ab hier Zusatzaufgabe:
    System.out.printf("%n%n------------------------- Vergleichen -----------------------------------%n%n");
    System.out.printf("%5s  > %5s ? %b %n", b1.toString(), b2.toString(), b1.isGreater(b2));
    System.out.printf("%5s  < %5s ? %b %n", b1.toString(), b2.toString(), b1.isSmaller(b2));
    System.out.printf("%5s == %5s ? %b %n", b1.toString(), b2.toString(), b1.isEqual(b2));
    System.out.printf("%5s  > %5s ? %b %n", b3.toString(), b4.toString(), b3.isGreater(b4));
    System.out.printf("%5s  < %5s ? %b %n", b3.toString(), b4.toString(), b3.isSmaller(b4));
    System.out.printf("%5s == %5s ? %b %n", b3.toString(), b4.toString(), b3.isEqual(b4));
    System.out.printf("%5s  > %5s ? %b %n", b5.toString(), b5.toString(), b5.isGreater(b5));
    System.out.printf("%5s  < %5s ? %b %n", b5.toString(), b5.toString(), b5.isSmaller(b5));
    System.out.printf("%5s == %5s ? %b %n", b5.toString(), b5.toString(), b5.isEqual(b5));
    //In der main Methode werden die Objektmethoden aus der Klasse Bruch aufgerufen mithilfe der Punktnotation
}

}
