package Uebung;

public class uebungUebungen10Testklasse 
{

	public static void main(String[] args) 
	{
		System.out.printf("%n%n------------------- Lottery in Schleife --------------%n%n");
        for (int index = 0; index < 10; index++)
        {
        	uebungUebungen10Lottery lo = new uebungUebungen10Lottery();
            lo.drawing();
            lo.print();
        }

        System.out.printf("%n%n------------------- Lottery equals --------------%n%n");     
        uebungUebungen10Lottery lo1 = new uebungUebungen10Lottery();
        lo1.drawing();
        uebungUebungen10Lottery lo2 = new uebungUebungen10Lottery();
        lo2.drawing();
        while(!lo1.equals(lo2))
        {
            lo2.drawing();
        }
        lo1.print();
        lo2.print();

        System.out.printf("%n%n------------------- LotteryYear --------------%n%n");        
        uebungUebungen10LotteryYear ly = new uebungUebungen10LotteryYear();
        ly.printFrequencyString();
        ly.printFrequencyDiagram();

        ly.print();

        if(ly.containsEquals())
        {
        	uebungUebungen10Lottery[] loa = ly.getArrayOfDoublets();
            loa[0].print();
            loa[1].print();
        }
        else
        {
            System.out.println("keine gleichen Ziehungen im Jahr");
        }
	}

}
