package aufgaben.aufgabe7;
/*
 * @author Katharina Schippl
 * bearbeitet mit Thao Trang Le (Anny)
 */

public class SortedArray 
{
	//-----Objektvariable-----
    private int [] s;
    
    //-----mehrereKonstruktoren-----
    public SortedArray () //parameterlos
    {
        this.s= new int [0]; //leeren Array erstellen
    }
    
    public SortedArray (int element) //parametisiert
    {
        this.s = new int [1];
        s[0]=element;
    }
    
    //-----Objektmethoden-----
    
    public boolean insert (int element)
    {
        if (contains(element))
        {
            return false;
        }
        
        int [] copy = new int [this.s.length+1];
        int sIndex = 0;
        int copyIndex = 0; //2 index weil man in for nicht 2 indexe? betrachten kann
        while (sIndex < this.s.length && this.s[sIndex] < element)
        {
            copy[copyIndex]=this.s[sIndex];
            copyIndex++;
            sIndex++;
        }
        copy[copyIndex] = element;
        copyIndex++;
        
        while (sIndex < this.s.length )
        {
            copy[copyIndex]=this.s[sIndex];
            copyIndex++;
            sIndex++;
        }
    this.s = copy;        
    return true;
    }
    
    /*public boolean insert (int element) falsche Lösung
    {
         if (!this.contains(element))
         {
             return false;
         }
         
         int[] newCopy = new int[this.s.length-1];
         newCopy[index]=this.s[index];
                newCopy[newCopy.length-1] = element;
         return true;
    }*/
    public boolean delete (int element)
    {
        if (!contains(element))
        {
            return false;
        }
        
        int [] copy = new int [this.s.length-1];
        int sIndex = 0;
        int copyIndex = 0;
        
        while (sIndex < this.s.length && !(this.s[sIndex] == element))
        {
            copy[copyIndex]=this.s[sIndex];
            copyIndex++;
            sIndex++;
        }
        sIndex++;
        while (copyIndex < copy.length)//this.s.length ) //(sIndex auch möglich))
        {
            copy[copyIndex]=this.s[sIndex];
            copyIndex++;
            sIndex++;
        }
        this.s = copy;
        return true;
    }
            
    /*public boolean delete (int element)
    {
     if (!this.contains(element))
     {
         return false;
     }
     
     int[] newCopy = new int[this.s.length-1];
     newCopy.remove(element);
     return true;
    }*/
    
    public void print ()
    {
        System.out.print(" [ ");
        if (this.s.length>0)
        {
            for (int index = 0; index < this.s.length-1; index++) 
            {
                System.out.print(this.s [index]+ ", ");
            }
            System.out.println(this.s[this.s.length-1]+" ]");
        }
        else
        {
        System.out.println(" ] ");
        }
    }
    
    private boolean contains (int element)
    {
        for (int index = 0; index < this.s.length; index++) 
        {
            if (this.s[index]==element)
            {
            return true;
            }
            
        }
        return false;
    }
    
    
    

}


