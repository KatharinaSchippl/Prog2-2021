package Klausur;

public class Testklasse 
{

	public static void main(String[] args) 
	{
		System.out.printf("%n%n Test MyString 1 %n%n");
		MyString s1 = new MyString (); // ich weiß nicht wie man einen Konstruktor in der Testklasse aufruft
		MyString s2 = new MyString ('a');
		MyString s3 = new MyString ('h', 'a', 'l', 'l', 'o');
		
		s1.print();
		s2.print();
		s3.print();
		
		s3.getCharAt(1);
		
		//wofür steht das erste a?
		System.out.println("a in hallo ? " + s3.contains('a'));
		System.out.println("b in hallo ? + " + s3.contains('b'));

		MyString s4 = new MyString ('h', 'a', 'l', 'l', 'o');
		MyString s5 = new MyString ('h', 'a', 'l', 'L', 'o');
		
		System.out.println("s3 gleich s4 ? " + s3.equals(s4));
		System.out.println("s3 gleich s4" + s3.equals(s4));
		
		System.out.printf("%n%n Test MyString 2 %n%n");
		
		System.out.println("Ascii-Code Zeichen aus s3 mit Index 1 = " + s3.getAsciiCodeOfChar(1));
		System.out.println(s3.append('c'));
		
		MyString s6 = new MyString ('b', 'a', 'l', 'l', 'o');
		System.out.println(s3.append(s6);
		
		System.out.println("erstes l in s3 am Index " + s3.firstIndexOf('l'));
		System.out.println("letztes l in s3 am Index " + s3.lastIndexOf('l'));

		//Test subString
		
		System.out.printf("%n%n Test MyString 3 %n%n");
		System.out.println("s3                 : " + );
		System.out.println("s3 substring (3,7) : " + s3.substring(3,7));
		System.out.println("s3 toUpperCase ()  : " + s3.toUpperCase());
		System.out.println("s3 reverse()       : " +);
		System.out.println("s4                 : " + );
		System.out.println("s4 in s3 ?         : " + s3.conatins(s4)));

	}

}
