package aufgaben.aufgabe6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
 * Katharina Schippl
 * bearbeitet mit @Thao Trang Le (Anny)
 */
public class PizzaMenu 
{
	public static boolean existingPizza(Map<String,Double> menu, String pizza)
	{
		if(menu.containsKey(pizza)) //wenn menu beinhaltet Pizza
		{
			return true; //, dann true
		}
		return false;	//, sonst false
	}

public static void printPrice(Map<String,Double> menu, String pizza) 
{
		
		if(existingPizza(menu, pizza)) 
		{
			System.out.println(pizza+ ": "+ menu.get(pizza));
		}
		else 
		{
			System.out.println(pizza + ": Diese Pizza gibt es nicht!");
		}
		
	}
	
	public static void printMenu(Map<String,Double> menu)
	{
		System.out.printf("%n********************%n%n");
		
		System.out.printf("Das Menü enthält "+menu.size()+" Pizzen.%n%n"); //Anzahl Pizzen in menu
		
		if(menu.isEmpty()) //keine Pizzen
		{
			System.out.println("*****************");
		}
		for(Map.Entry<String, Double> pizza : menu.entrySet()) //wenn Pizza im Menü, dann €
		{
		    System.out.printf("Pizza " + pizza.getKey() + ": " + pizza.getValue()+" Euro%n"); //Preis der Pizza
		}
		System.out.println();
	}

	
	public static void affordablePizza(Map<String,Double> menu, double maxPrice) 
{//HashSet erstellen
	Set <String> pizzenNamen = new HashSet<>(); 
	
	System.out.println("Eingegebener Betrag: " + maxPrice + " Euro");
	
	for(Map.Entry<String, Double> pizza : menu.entrySet())
	{
	   if(pizza.getValue() <= maxPrice) //wenn genug € für Pizza
	   {
		   pizzenNamen.add(pizza.getKey());   
	   } 
	}
	
	if(pizzenNamen.isEmpty())//zu wenig € für Pizza
	{
		System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
	}
	else 
	{
		System.out.println("Mögliche Pizzen: " + pizzenNamen);
	}
}


	public static void main(String[] args) 
	{ //HashMap namens "menu" erzeugen
		Map<String, Double> menu = new HashMap<>();
		//menu durch ".put" mit Pizza(String) und deren Preisen(Double) befüllen 
		menu.put("Margheritta", 7.0);
		menu.put("Veggi", 7.5);
		menu.put("Salami", 8.5);
		menu.put("Schinken",8.5);
		
		printPrice(menu, "Salami");
		printPrice(menu, "Veggi");
		printMenu(menu);
		
		menu.put("Schinken",8.2);
		System.out.printf("Schninken mit anderem Price%n");
		printMenu(menu);
		
		affordablePizza(menu, 4.0); //--> variierbar
		affordablePizza(menu, 8.0); 
		
		menu.clear();
		System.out.println();
		printMenu(menu);
		
		menu.put("Verde", 7.0);
		menu.put("Hawaii", 8.2);
		menu.put("Tradizionale",8.5);
		printMenu(menu);
		
		Map<String, Double> menu2 = new HashMap<>();
		//Kopieren aus der 1. HashMap, aber nicht die Hawaii-Pizza
		menu2.putAll(menu);
		System.out.println("Menu 2");
		printMenu(menu2);
		menu2.remove("Hawaii");//--> hier wird die Hawaii gelöscht
		System.out.println(",nachdem Hawaii Pizza gelöscht wurde");
		printMenu(menu2);


	}

}
