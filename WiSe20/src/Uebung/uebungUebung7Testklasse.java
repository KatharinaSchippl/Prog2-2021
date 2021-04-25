package Uebung;

public class uebungUebung7Testklasse 
{

	public static void main(String[] args) 
	{
		// Objekte erzeugen
		uebungUebung7 r1 = new uebungUebung7();
		uebungUebung7 r2 = new uebungUebung7(12, 18);
		uebungUebung7 r3 = new uebungUebung7(40, 5);
		uebungUebung7 r4 = new uebungUebung7(20, 10);
		uebungUebung7 r5 = new uebungUebung7(11, 21);

        System.out.printf("%n%n--------------- print()-Methode -----------------%n%n");
        r1.print();
        r2.print();
        r3.print();
        r4.print();
        r5.print();

        System.out.printf("%n%n---------- printComparison()-Methode ------------%n%n");
        r1.printComparison(r2);
        r1.printComparison(r3);
        r1.printComparison(r4);
        r1.printComparison(r5);

        System.out.printf("%n%n--------------- scale()-Methode -----------------%n%n");
        r1.scale(2);
        r2.scale(2);
        r3.scale(2);
        r4.scale(2);
        r5.scale(2);
        r1.scale(10);
        r2.scale(10);
        r3.scale(10);
        r4.scale(10);
        r5.scale(10);

        /*
         * Zusatz aus Uebungsvideo
         */
        System.out.printf("%n%n---------- doubleSides()-Methode ------------%n%n");
        uebungUebung7 r6 = r1.doubleSides();    // Referenz auf neues Objekt wird gespeichert
        r1.print();
        r6.print();

        r2.print();
        r2.doubleSides().print();           // Referenz auf neues Objekt wird NICHT gespeichert

        r6.print();

	}

}
