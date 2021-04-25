package aufgaben.aufgabe1;
/*
 *  @Katharina Schippl
 *  @Thao Trang Le (Anny)
 *  
 *  Diese Klammer gibt auf die Konsole ein Rhombus (eine Raute) aus.
 * Der Rhombus ist entweder gefuellt oder ungefuellt.
 * 
 *  
 */

public class Aufgabe1 {
	
//hier Ihre Implementierung
	

	public static void printRhombusFilled(int upperHalf)
    {
		for (int laufvariable1 = 1; laufvariable1 <=5; laufvariable1++) //RhombusFilled upperHalf
        {
            for (int laufvariable2=1; laufvariable2<=5-laufvariable1; laufvariable2++)
            {
                System.out.print(" ");
            }
            for (int laufvariable3 =1; laufvariable3<=2*laufvariable1-1; laufvariable3 ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int laufvariable1=4; laufvariable1>=1; laufvariable1--) //RhombusFilled lowerHalf
        {
            for (int laufvariable2 = 1; laufvariable2 <=5-laufvariable1; laufvariable2++)
            {
                System.out.print(" ");
            }
            for (int laufvariable3 = 1; laufvariable3<= 2*laufvariable1-1; laufvariable3++)
            {
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        
    }
    
    public static void printRhombusUnfilled(int upperHalf)
    {
        for (int laufvariable1 = 0; laufvariable1 <=5; laufvariable1++) //RhombusUnfilled upperHalf
        {
            for (int laufvariable2=1; laufvariable2<=5-laufvariable1; laufvariable2++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int laufvariable3 = 1; laufvariable3<= 2*laufvariable1-1; laufvariable3++)
            {
                System.out.print(" ");
            }
        
            System.out.println("*");
            
            /*if (laufvariable1 == 0) 
            {
                laufvariable3 = laufvariable3-1; Ein Stern aud Zeile 1 (bzw. Laufvariable 0) entfernen)
            
            }*/ 
        
        
            
        }
        for (int laufvariable1 =4; laufvariable1>=0; laufvariable1--) //RhombusUnfilled lowerHalf
        {
            for (int laufvariable2 = 1; laufvariable2 <=5-laufvariable1; laufvariable2++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            
            for (int laufvariable3 = 1; laufvariable3<= 2*laufvariable1-1; laufvariable3++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        
    }
    public static void printRhombus(int upperHalf, boolean filled)
    {
        
        int hoehe;
         hoehe= 2 * upperHalf +1;
        if (filled ==true)
        {
            printRhombusFilled(5);                    //Methode 1 (Raute filled) aufrufen
        }
        else
        {
            printRhombusUnfilled(5);                //Methode 2 (Raute unFilled) aufrufen
        }    
        System.out.println("upperHalf ist gleich: " + upperHalf);
    }
    
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        printRhombus (5, true);
        printRhombus (5, false);
        
    }


    

    }
    
    

