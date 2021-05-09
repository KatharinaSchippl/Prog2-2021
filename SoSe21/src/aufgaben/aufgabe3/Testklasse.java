package aufgaben.aufgabe3;

public class Testklasse 
{

	public static void main(String[] args) 
	{
		Solitaire s1 = new Solitaire ();
		s1.print();
		
		Solitaire game = new Solitaire();
		System.err.println("    START");
		System.out.println();
		game.print();
		System.out.println();
		int zug=1;
		while(game.moveFirstPossible())
		{
			System.err.println("Nach dem "+zug+". Zug:");
			System.out.println();
			zug++;
			game.print();
		}
		System.out.println("Kein moeglicher Zug");


	}

}
