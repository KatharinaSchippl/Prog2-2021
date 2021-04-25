package Uebung;

public class uebungUebungenNotebook extends uebungUebungenComputer
{
	protected int monitor;

    public uebungUebungenNotebook(String hersteller, int ram, int platte, int monitor)
    {
        super(hersteller, ram, platte);
        this.monitor = monitor;
    }

    @Override
    public String toString()
    {
        return "(" + this.hersteller + ", " + this.ram + ", " + this.platte + ", " + this.monitor +")";
    }
}
