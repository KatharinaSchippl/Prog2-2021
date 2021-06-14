package shapes;

public class ShapeTestklasse 

{ 
	
	public static void printPerimeter(Shape s)
	{
	System.out.printf("perimeter : %.2f cm%n", s.perimeter());
	}
	public static void printArea(Shape s)
	{
		System.out.printf("Area : %.2f cm%n", s.area());
	}
	public static void sortieren(Comparable[] unsorted) //BUBBLESORT
	{
		for(int bubble=1; bubble<unsorted.length; bubble++)
		{
			for(int index=0; index<unsorted.length-bubble; index++)
			{
				if(unsorted[index].compareTo(unsorted[index-1]))
			}
		}
	}
	public static void main(String[] args) 
	{
		Shape s1= new Rectangle(10,20); //jedes Rectangle ist ein Shape!!!!
		System.out.println(s1.perimeter());
		System.out.println(s1.area());
		
		Shape s2= new Circle (1.0); //Jeder Circle ist ein Shape!!!
		System.out.println(s2.perimeter());
		System.out.println(s2.area());
		
		printPerimeter(new Rectangle(5,15));
		printPerimeter(new Circle(5.0));
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
		System.out.println("A".compareTo("A"));
		
		 Rectangle = new Rectangle(6);
		
		
	}

}
