package Uebung;

public class uebungUebungenComputerTestklasse 
{

	public static void main(String[] args) 
	{
		System.out.printf("%n%n--------------------- Test Computer --------------------%n%n");
		uebungUebungenComputer c1 = new uebungUebungenComputer("lenovo", 8, 256);
		uebungUebungenComputer c2 = new uebungUebungenComputer("lenovo", 16, 512);
		uebungUebungenComputer c3 = new uebungUebungenComputer("apple", 4, 256);
		uebungUebungenComputer c4 = new uebungUebungenComputer("apple", 8, 512);
		uebungUebungenComputer c5 = new uebungUebungenComputer("dell", 8, 256);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();

        System.out.println("c1 und c2 gleicher Hersteller ? : " + c1.gleicherHersteller(c2));
        System.out.println("c1 und c3 gleicher Hersteller ? : " + c1.gleicherHersteller(c3));

        System.out.printf("%n%n--------------------- Test Notebook --------------------%n%n");
        uebungUebungenNotebook n1 = new uebungUebungenNotebook("lenovo", 8, 256, 13);
        uebungUebungenNotebook n2 = new uebungUebungenNotebook("lenovo", 16, 512, 15);

        n1.print();
        n2.print();

        System.out.printf("%n%n------------------ Test NotebookArray ------------------%n%n");      
        uebungUebungenNotebookArray na = new uebungUebungenNotebookArray(10);
        na.konfigurieren();
        na.print();
        na.sortRamPlatte();
        na.print();
        uebungUebungenNotebookArray lenovo = na.getHersteller("lenovo");
        lenovo.print();
        uebungUebungenNotebookArray apple = na.getHersteller("apple");
        apple.print();
        uebungUebungenNotebookArray dell = na.getHersteller("dell");
        dell.print();


	}

}
