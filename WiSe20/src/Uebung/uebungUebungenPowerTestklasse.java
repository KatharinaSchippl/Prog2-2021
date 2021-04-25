package Uebung;

import java.util.Arrays;

public class uebungUebungenPowerTestklasse 
{

	public static void main(String[] args) 
	{
		// Objekte erzeugen
		uebungUebungenPower p1 = new uebungUebungenPower(3,4);
		uebungUebungenPower p2 = new uebungUebungenPower(-3,4);
		uebungUebungenPower p3 = new uebungUebungenPower(3,0);
		uebungUebungenPower p4 = new uebungUebungenPower(3,-4);
		uebungUebungenPower p5 = new uebungUebungenPower(-3,-4);

        System.out.printf("%n%n---------------------- Ausgaben fuer Power ---------------------------%n%n");
        p1.print();
        System.out.println(p1.toString() + " = " + p1.getValue());
        p2.print();
        System.out.println(p2.toString() + " = " + p2.getValue());
        p3.print();
        System.out.println(p3.toString() + " = " + p3.getValue());
        p4.print();
        System.out.println(p4.toString() + " = " + p4.getValue());
        p5.print();
        System.out.println(p5.toString() + " = " + p5.getValue());

        System.out.printf("%n%n-------------------- Ausgaben fuer PowerOfTwo -------------------------%n%n");
        uebungUebungenPowerOfTwo p21 = new uebungUebungenPowerOfTwo(4);
        p21.print();
        p21.printBinary();
        uebungUebungenPowerOfTwo p22 = new uebungUebungenPowerOfTwo(-4);
        p22.print();
        p22.printBinary();
        uebungUebungenPowerOfTwo p23 = new uebungUebungenPowerOfTwo(0);
        p23.print();
        p23.printBinary();

        System.out.printf("%n%n-------------------- Ausgaben fuer PowerArray -------------------------%n%n");
        uebungUebungenPowerArray pa = new uebungUebungenPowerArray(10);
        pa.fillArray();
        pa.print();
        pa.sort();
        pa.print();

        System.out.println("Index : " +pa.getIndexExponent(4));
        System.out.println("Index : " +pa.getIndexExponent(0));

        double[] values = pa.createArrayOfValues();
        System.out.println(Arrays.toString(values));
	}

}
