package themen.variablen;

public class Variablen {

	public static void main(String[] args) {
	System.out.println("Thema Heute: Variablen");
	System.out.println("Script unter http://freiheit.f4.htw-berlin.de/prog1/");
	System.out.println();
		/*
		 * Erzeugen einer Variablen: "Deklarieren der Variablen"
		 * Um eine Variable zu erzeugen, braucht man einen Datentyp.
		 * Dann kann man dem Datentyp eine Zahl zuweisen
		 * daten variablenName; 
		 * 
		 * ganzzahlige Datentypen: "int", "long", "short", "byte"
		 * das Operatorzeichen ist "="
		 * Werte: "	Literale"
		 */
		int nochEineGanzeZahl = 0; //Deklaration und Wertzuweisung in einem Schritt, auch Initalisierung genannt
		
		int ganzeZahl = 7; //Variable erzeugt (1x!!)				32 Bit
		long grosseganzeZahl = 1234567; //						64 Bit
	
		short kleineganzeZahl = 123;			//				16 Bit
		byte  ganzkleinganzeZahl = 127;			// 				8 Bit
		
		/*
		 * Datentyp, um Gleitkommazahl zu speicher
		 * double, float
		 */
		double number1 = 5.789;					//				32 Bit
		float number2 = 3.758f;					//				6e4 Bit
		
	
		/*
		 * Datentyp um ein Zeichen (charackter) zu speichern
		 * char
		 */
		char zeichen = 'a';
		char zeichen1 = 65;
		char zeichen2 ='\u00a9';
		
				
				
		/*
		 * Datentyp, um Wahrheitswerte zu speichern
		 * boolean
		 */
		boolean condition = true;
		boolean condition1 = false;
		
		/*
		 * Wertzuweisung
		 * Wertzuweisungsoperator =
		 * variablenNamen = wert
		 */
		System.out.println(ganzeZahl);
		System.out.println(grosseganzeZahl);
		System.out.println(kleineganzeZahl);
		System.out.println(ganzkleinganzeZahl);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(zeichen);
		System.out.println(zeichen1);		
		System.out.println(zeichen2);		
		System.out.println(condition);
		System.out.println(condition1);		
		
		/*
		 * Datentyp um Zeichenkette zu speichern
		 * string 
		 * (Referenztyp)
		 */
		String Zeichenkette = "Hallo";
		System.out.println(Zeichenkette);
				
				
	

		
		
		
	}

}
