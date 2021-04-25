package Uebung;

public class uebungUebung1 
{
	
	public static void printIntDivision(int nr1, int nr2) 
	{
		int ergebnis = nr1/nr2;
		int rest = nr1%nr2;
		if(rest==0) {
			System.out.println(nr1 + " geteilt durch " + nr2+ " ergibt " + ergebnis +". Es bleibt kein Rest.");
		}
		else {
			System.out.println(nr1 + " geteilt durch " + nr2+ " ergibt " + ergebnis +". Es bleibt ein Rest von" + rest +".");
		}
	}
	
	public static int getQuotient(int nr1, int nr2) 
	{
		int quotient = nr1 / nr2;
		System.out.println(nr1 + " / " + nr2 + " = " + quotient);
		return quotient;
	}  
	public static int getRemainder(int nr1, int nr2) 
	{
		int remainder = nr1% nr2;
		System.out.println(nr1 + " mod " + nr2 + " = " + remainder);
		return remainder;
	}

	public static void main(String[] args)
	{
		
		int i = 123;
		
		
		long lo = 456789;
		
		char c = 'a';
		
		byte b = 127;
		short s = 32767;
		float f = 4.23f;
		double d = 6.98;
		boolean boo = true;
		String str = "Hallo";
		
		System.out.println("----Aufgabe 1-----");
		System.out.println();
		System.out.println("Wert von int         : " +i);
		
		
		System.out.println("Wert von long        : " +lo);
		
		System.out.println("Wert von char        : " +c);
		System.out.println("Wert von byte        : " +b);
		System.out.println("Wert von short       : " +s);
		System.out.println("Wert von float       : " +f);
		System.out.println("Wert von double      : " +d);
		System.out.println("Wert von boolean     : " +boo);
		System.out.println("Wert von String      : " +str);
		
		System.out.println("----Aufgabe 2-----");
		System.out.println();
		
		int ii = 2147483647;
		System.out.println("Wert von int         : " +ii);
		int iii = ii + 1; //++
		System.out.println("Wert von int         : " +iii);
		
		System.out.println("----Aufgabe 3-----");
		System.out.println();
		
		long loo = 2147483647;
		System.out.println("Wert von long         : " +loo);
		long looo = loo + 1; //++
		System.out.println("Wert von long         : " +looo);
		
		System.out.println("----Aufgabe 4-----");
		System.out.println();
		c = 65;
		System.out.println("Wert von char         : " +c);
		
		System.out.println("----Aufgabe 5-----");
		System.out.println();
		printIntDivision(7,4);
		printIntDivision(17,4);
		printIntDivision(16,4);
		
		System.out.println("----Aufgabe 6-----");
		System.out.println();
		int number1 = 17;
		int number2 = 4;
		int result= getQuotient(number1, number2);
		System.out.println(number1 + " / " + number2 + " = " + result);
		
		int number3 = 17;
		int number4 = 4;
		int result1= getRemainder(number3, number4);
		System.out.println(number1 + " mod " + number2 + " = " + result1);
		
		
		
		
		
	}

	

}
