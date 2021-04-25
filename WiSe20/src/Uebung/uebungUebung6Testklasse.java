package Uebung;

public class uebungUebung6Testklasse 
{

	public static void main(String[] args) 
	{
		uebungUebung6 k1 = new uebungUebung6(1234);

        k1.einzahlen(100.0);
        k1.einzahlen(50.0);
        k1.einzahlen(150.0);

        k1.kontoauszug(1235);       // Falsche PIN!
        k1.kontoauszug(1234);       

        k1.auszahlen(1235, 100.0);  // Falsche PIN!
        k1.auszahlen(1234, 100.0);  
        k1.kontoauszug(1234);       
        k1.auszahlen(1234, 300.0);  
        k1.auszahlen(1234, 200.0);  
        k1.kontoauszug(1234); 

        k1.einzahlen(150.0);
        k1.kontoauszug(1234);       
        k1.zinsenZahlen();
        k1.kontoauszug(1234);       
        k1.einzahlen(1000.0);
        k1.kontoauszug(1234);       
        k1.zinsenZahlen();
        k1.kontoauszug(1234); 
	}

}
