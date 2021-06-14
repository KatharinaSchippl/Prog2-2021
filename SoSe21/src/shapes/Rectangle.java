package shapes;

public class Rectangle extends Shape implements Comparable<Rectangle>
{//wir implementieren die Shape Klasse hierrein, da Rectangle von Shape erbt
	
	
	

	private int width;
	private int height; 
	public Rectangle(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	@Override //geerbt von Shape()
	public double perimeter() 
	{
		return (2.0 * (this.width + this.height));
	}

	@Override//geerbt von Shape()
	public double area() 
	{
		return this.width * this.height;
	}
	
	@Override
	public int compareTo(Rectangle o) {
		// wenn this. größer ist als o , dann positiver int wert
		// wenn this. kleiner ist als o , dann negativer int wert
		return((this.width + this.height) - (o.width + o.height));
	}
	
}
