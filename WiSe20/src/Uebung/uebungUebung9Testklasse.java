package Uebung;

public class uebungUebung9Testklasse 
{
	
	 public static void main(String[] args) 
	 {
		 
	
	
	System.out.printf("%n%n------------------------- Test Pizza ---------------------------%n%n");
	uebungUebung9Pizza p1 = new uebungUebung9Pizza("Salami", 6.9f);
	uebungUebung9Pizza p2 = new uebungUebung9Pizza("Margheritha", 5.9f);
	uebungUebung9Pizza p3 = new uebungUebung9Pizza("Tonno", 6.9f);
	uebungUebung9Pizza p4 = new uebungUebung9Pizza("Hawaii", 6.9f);
	uebungUebung9Pizza p5 = new uebungUebung9Pizza("Calzone", 7.9f);
	uebungUebung9Pizza p6 = new uebungUebung9Pizza("Salami", 6.9f);

    p1.print();
    p2.print();
    p3.print();
    p4.print();
    p5.print();

    System.out.println("p1 gleich p2 ? : " + p1.equals(p2));
    System.out.println("p1 gleich p1 ? : " + p1.equals(p1));
    System.out.println("p1 gleich p6 ? : " + p1.equals(p6));

    System.out.printf("%n%n--------------------- Test Pizzaverkauf ------------------------%n%n");
    uebungUebung9Pizzaverkauf pv1 = new uebungUebung9Pizzaverkauf(p1);
    pv1.print();
    pv1.verkaufen();
    pv1.print();

    System.out.printf("%n%n--------------------- Test Speisekarte -------------------------%n%n");
    uebungUebung9Speisekarte s1 = new uebungUebung9Speisekarte();
    s1.pizzaHinzufuegen(p1);
    s1.pizzaHinzufuegen(p2);
    s1.pizzaHinzufuegen(p3);
    s1.pizzaHinzufuegen(p4);
    s1.pizzaHinzufuegen(p5);
    s1.print();

    s1.pizzaLoeschen(p3);
    s1.print();

    System.out.printf("%n%n------------------------ Test Pizzaria -------------------------%n%n");
    uebungUebung9Pizzeria pz1 = new uebungUebung9Pizzeria(s1);
    pz1.tagesVerkauf(150);
    pz1.print();
    System.out.println();

    System.out.print("Meistverkaufte Pizza : ");
    pz1.meistverkauftePizza().print();
    System.out.printf("Die Gesamteinnahmen betragen %.2f Euro", pz1.gesamtEinnahmen());

 }
}
