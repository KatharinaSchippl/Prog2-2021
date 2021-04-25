package aufgaben.aufgabe8;


public class Mensch
{
    //----------Objektvariablen--------
    private String name;
    private int alter;
    
    //----------Konstruktor--------
    public Mensch (String name, int alter)
    {
        this.name = name;
        this.alter = alter;
    }
    
    //----------Objektmethoden--------
    public String getName ()
    {
        return this.name;
    }
    
    public int getAlter ()
    {
        return this.alter;
    }
    
    public void geburtstag()
     {
      this.alter++;
     }
    
    
    /*public int geburtstag ()
    {
        int alterNeu = this.alter+1;
        this.alter = alterNeu;
        return this.alter;
    }*/
    
    @Override
    public String toString ()
    {
        String string= String.format ("%s ist %d Jahre alt", getName(), getAlter());
        return string;
    }
    
    public void print ()
    {
        System.out.println(this.toString());
    }
    
    
}

