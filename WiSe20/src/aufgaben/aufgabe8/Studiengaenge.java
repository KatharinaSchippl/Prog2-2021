package aufgaben.aufgabe8;

import java.util.Random;

public class Studiengaenge 
{

    //----------Objektvariablen---------
    private Studentin [] fiw;
    private Studentin [] ai;
        
    //----------Konstruktor---------
        
    public Studiengaenge (int fiwAnzahl, int aiAnzahl)
    {
        this.fiw = new Studentin [fiwAnzahl];
        this.ai = new Studentin [aiAnzahl];
    }
        
    //----------Objektmethoden---------
    public void immatrikulieren (int anzahl)
    {
        Random r = new Random ();
        int indexFIW = 0;
        int indexAI = 0;
        
        for (int i = 1; i <= anzahl; i++) //1 bis 20//wieso = wieso 1
        {
            int randomNumber = r.nextInt(3); 
            
            if (randomNumber == 0 ) //FIW
            {
                    if (indexFIW < this.fiw.length)
                    {
                        this.fiw[indexFIW] = new Studentin ("S"+i, 20+i, "FIW"); 
                        indexFIW++;
                    }
                    else 
                    {
                      System.out.println("FIW ist bereits voll");
                    }
            }
            else //AI
            {
                if (indexAI < this.ai.length)
                {
                    this.ai[indexAI] = new Studentin ("S"+i, 20+i, "AI");
                    indexAI++;
                }
                else
                {
                    System.out.println("AI ist bereits voll");
                }
            }
            
        }
    }
    
    public void printFIW()
    {
        System.out.print("FIW: [");
        for (int index = 0; index < this.fiw.length; index++) 
        {
            if (this.fiw[index] != null)
            {
            System.out.print(this.fiw[index].toString()+""); //erster Teil ist studentin obejekt --> hat methode to String
            }
        }
        System.out.println(" ]");
        //System.out.println(this.name+ ", "+ this.getAlter() + ", " + this.studiengang + ", " );
        //String string1 = String.format("(%s, %d, %s, %d", Studentin [] fiw, getAlter(), this.studiengang);
        //return string1;
    }
    
    public void printAI ()
    {
        System.out.print("AI: [");
        for (int index = 0; index < this.ai.length; index++) 
        {
            if (this.ai[index] != null)
            {
            System.out.print(this.ai[index].toString()+""); //erster Teil ist studentin obejekt --> hat methode to String
            }
        }
        System.out.println(" ]");
        //System.out.println("(%s, %d, %s, %d", String studentin, getAlter(), this.studiengang);
    }
    
    public double durchschnittsalterFIW ()
    {
        double sum = 0.0;
        int anzahl = 0; //kann auch double sein
        //oder double durchschnitt = sum / anzahl;
        for (int index = 0; index < this.fiw.length; index++) 
        {
            if (this.fiw[index] != null)
            {
                sum = sum + this.fiw[index].getAlter();
                anzahl++;
            }
        }
        return sum / anzahl;
    }
    
    public double durchschnittsalterAI ()
    {
        double sum = 0.0;
        int anzahl = 0; //kann auch double sein
        //oder double durchschnitt = sum / anzahl;
        for (int index = 0; index < this.ai.length; index++) 
        {
            if (this.ai[index] != null) //WICHTIIIG
            {
                sum = sum + this.ai[index].getAlter();
                anzahl++;
            }
        }
        return sum / anzahl;
    }
    
    public void printDurchschnittsalter ()
    {
        System.out.println("Durchschnittsalter FIW: " + this.durchschnittsalterFIW());
        System.out.println("Durchschnittsalter AI: " + this.durchschnittsalterAI());
        
        if (this.durchschnittsalterAI()< this.durchschnittsalterFIW())
        {
            System.out.println("AI ist im Durchschnitt jünger");
        }
        else if (this.durchschnittsalterAI()> this.durchschnittsalterFIW())
        {
            System.out.println("FIW ist im Durchschnitt jünger");
        }
        else
        {
            System.out.println("FIW und AI Studierende sind im Durchschnitt gleich alt");
        }
    }

}
