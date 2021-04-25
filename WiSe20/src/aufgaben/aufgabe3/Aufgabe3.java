package aufgaben.aufgabe3;

import java.util.Random;
/*
 * @author Katharina Schippl
 * @author Thao Trang Le (Anny)
 * 
 */
public class Aufgabe3 
{
	public static int[] createAndFillArray(int length, int fromInclusive, int toInclusive)
    {
        int [] arr1 = new int [length];
        Random r = new Random ();
        int bound = toInclusive;
        
        for (int i = fromInclusive; i < arr1.length; i++) 
        {
            arr1 [i]= r.nextInt (bound);
        }
        // Zufallszahlen im Intervall ausgeben s. Mitschriften
        
        
        return arr1;
    } 
    public static void printArray(int[] a)
    {
          
        
        int[] numbers = {27, 30, 25, 26, 23, 20, 30, 30, 22, 21, 29, 29, 21, 20 };
         System.out.print("[ ");
            for(int index=0; index<numbers.length-1; index++)
            {
                System.out.print(numbers[index] + ", ");
            }
            if(numbers.length>0)
            {
                System.out.print(numbers[numbers.length-1]);
            }
            System.out.println(" ]");
    }
    public static void printTable(int[] a)
    {
         
           
            System.out.println("  Index   |   0   |   1   |   2   |   3   |   4   |   5   |   6   |   8   |   9   |   10   |   11   |   12  |   13   |   14    ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");  
           
           
            int[] numbers = {27, 30, 25, 26, 23, 20, 30, 30, 22, 21, 29, 29, 21, 20 };
                System.out.printf("  Wert:   |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |  %3d  |   %3d  |   %3d  |  %3d  |  %3d   |  %3d  %n",
                    numbers [0], numbers[1], numbers[2],  numbers[3],  numbers[4],  numbers[5],  numbers[6],  numbers[7],  numbers[8],  numbers[9],  numbers[10],  numbers[11],  numbers[12], numbers [13]);
            }
        
    public static void printHorizontal(int[] a)
    {
       int [] numbers = {27, 30, 25, 26, 23, 20, 30, 30, 22, 21, 29, 29, 21, 20 };
       
       int rows = numbers.length;
       for( int row = 0; row < rows; row++ ) {
           System.out.println(     "   |");
          if (row<10)
          {
           System.out.print(row+   "  |" );
          }
          else
          {
              System.out.println(     "   |");
                       System.out.print(row+   " |");
                      
          }
           for( int column = 0; column < numbers[ row ]; column++ ) {
              
         
               
               System.out.print( "*" );
            
           }
           System.out.println(); //bei row 13 fehlt ein Strich --> |

        
    }} 
    public static void main(String[] args) 
    {
        System.out.println("Aufgabe 3 - Thema: Arrays");
        System.out.println();
        
        Random r= new Random ();
        int length = r.nextInt(10)+10;
        int[] arr1 = createAndFillArray(length, 20, 30);
        System.out.printf("%n%n%n----------- printArray -----------------%n%n%n");
        printArray(arr1);
        
        System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
        printTable(arr1);
        
        System.out.printf("%n%n%n----------- printHorizontal ------------%n%n%n");
        printHorizontal(arr1);
    }

		
}
