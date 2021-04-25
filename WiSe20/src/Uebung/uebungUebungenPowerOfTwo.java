package Uebung;

public class uebungUebungenPowerOfTwo extends uebungUebungenPower
{
	public uebungUebungenPowerOfTwo(int exp)
    {
        super(2, exp);
    }

    public void printBinary()
    {
        if(this.getExp()<0)
        {
            System.out.println("Zahl ist kleiner als 1");
        }
        else
        {
            String s = "1";
            for(int i=1; i<=this.getExp(); i++)
            {
                s += " 0";
            }
            System.out.println(s);
        }
    }
}
