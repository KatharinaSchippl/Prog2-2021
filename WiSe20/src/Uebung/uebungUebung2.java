package Uebung;

public class uebungUebung2 
{
	public static void printTimesTables(int nr1, int nr2) // das kleine einmal eins!!!!! MULTIPLIKATION
	{
		for(int zahl1 = 1; zahl1<=nr1; zahl1++)
        {
            for(int zahl2 = 1; zahl2<=nr2; zahl2++)
            {
                int ergebnis = zahl1 * zahl2;
                System.out.println(zahl1 + " * " + zahl2 + " = " + ergebnis);
            }
            System.out.println();
        }
	}
	public static void printTimesMatrix(int nr1, int nr2) 
	{
		for(int zahl1 = 1; zahl1<=nr1; zahl1++)
        {
            for(int zahl2 = 1; zahl2<=nr2; zahl2++)
            {
                int ergebnis = zahl1 * zahl2;
                System.out.print(ergebnis + " "); //Für Tabelle einfach print OHNE LN!!!!!!!
            }
            System.out.println();
        }
	}
	public static void printTriangleUp(int height) 
	{
		for(int row=0; row<height; row++)
        {
            //System.out.println("Zeile : " + row + " Sterne : " + (height-row));
            for(int stars=row; stars < height; stars++)
            {
                System.out.print("*");
            }
            /*
            System.out.print(" ");
            for(int stars=0; stars<=row; stars++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            for(int stars=0; stars<=row; stars++)
            {
                System.out.print("*");
            }
            */
            System.out.println();
        }}
		
		 public static void printXYZ()
		    {
		        int product = 36;
		        for(int z = -product; z <= product; z++)
		        {
		            for(int y = -product; y <= z; y++)
		            {
		                for(int x = -product; x <= y; x++)
		                {
		                    //if(x * y * z == product && (x <= y) && y <= z)
		                    if(x * y * z == product)
		                    {
		                        System.out.println("z=" + z + " y=" + y + " x=" + x);
		                    }
		                }
		            }
		        }
		    }

		    public static void printSeconds(int seconds)
		    {
		        int minute = 60;
		        int hour = 60 * minute;     // 3600
		        int day = 24 * hour;        // 86400

		        int days = seconds / day;
		        int restSeconds = seconds - (days * day);
		        int hours = restSeconds / hour;
		        restSeconds = restSeconds - (hours * hour);
		        int minutes = restSeconds / minute;
		        restSeconds = restSeconds - (minutes * minute);

		        /*
		        System.out.println(seconds + " Sekunden sind " + days + " Tage, " 
		        + hours + " Stunden, " + minutes + " Minuten, " + restSeconds + " Sekunden.");
		         */

		        String output = seconds + " Sekunden sind ";
		        if(days==1)
		        {
		            output = output + " 1 Tag, ";
		        }
		        else
		        {
		            if(days > 1)
		            {
		                output = output + days + " Tage, ";
		            }
		        }
		        if(hours==1)
		        {
		            output = output + " 1 Stunde, ";
		        }
		        else
		        {
		            if(hours > 1)
		            {
		                output = output + hours + " Stunden, ";
		            }
		        }
		        if(minutes==1)
		        {
		            output = output + " 1 Minute, ";
		        }
		        else
		        {
		            if(minutes > 1)
		            {
		                output = output + minutes + " Minuten, ";
		            }
		        }
		        if(restSeconds==1)
		        {
		            output = output + " 1 Sekunde.";
		        }
		        else
		        {
		            if(restSeconds > 1)
		            {
		                output = output + restSeconds + " Sekunden.";
		            }
		        }
		        System.out.println(output);
		        
		    
		    }
		    public static int crossSum(int number)
		    {
		        int sum = 0;

		        int rest = number % 10;     // letzte Ziffer
		        sum = sum + rest;
		        int result = number / 10;   // Zahl ohne letzte Ziffer
		        while(result > 0)
		        {
		            rest = result % 10;
		            sum = sum + rest;
		            result = result / 10;
		        }

		        return sum;
		    }
		    
	

	public static void main(String[] args) 
	{
		System.out.println("-----Aufgabe 1-----");
		System.out.println();
		System.out.println();
		printTimesTables(10,10);
		
		System.out.println("-----Aufgabe 2-----");
		System.out.println();
		System.out.println();
		printTimesMatrix(10, 10);
		
		System.out.println("-----Aufgabe 3-----");
		System.out.println();
		System.out.println();
		printTriangleUp(7);
		
		System.out.println("-----Aufgabe 4-----");
		System.out.println();
		System.out.println();
		printXYZ();

        System.out.println();
        System.out.println("----- Aufgabe 5 ------");
        System.out.println();
        printSeconds(3456789);
        printSeconds(2345678);
        printSeconds(123456);
        printSeconds(12345);

        System.out.println();
        System.out.println("----- Aufgabe 6 ------");
        System.out.println();
        int number = 123456789;
        int crossSum = crossSum(number);
        System.out.println("Die Quersumme von " + number + " ist " + crossSum + ".");
    }

		
		
		
		
		
		
		
		
		
	}


