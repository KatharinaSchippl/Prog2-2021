package aufgaben.aufgabe8;

public class Studentin extends Mensch
{	
    //----------Objektvariablen---------
    private int semester;
    private String studiengang;
    
    //----------Konstruktor---------
    
    public Studentin (String name, int alter, String studiengang)
    {
        super (name, alter);
        this.studiengang = studiengang;
        this.semester = 1;
    }
    
    //----------Objektmethoden---------
    @Override
    public String toString ()
    {
        String string= String.format ("(%s , %d , %s , %d )", this.getName(), this.getAlter(), this.studiengang, this.semester);
        return string;
    }

	}


	