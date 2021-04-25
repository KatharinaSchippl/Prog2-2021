package Uebung;

public class uebungUebungen11Strecke 
{
	private uebungUebungen11Punkt2D start;
    private uebungUebungen11Punkt2D ende;

    public uebungUebungen11Strecke(uebungUebungen11Punkt2D start, uebungUebungen11Punkt2D ende)
    {
        this.start = start;
        this.ende = ende;
    }

    public uebungUebungen11Strecke(int x1, int y1, int x2, int y2)
    {
        this.start = new uebungUebungen11Punkt2D(x1, y1);
        this.ende = new uebungUebungen11Punkt2D(x2, y2);
    }

    public double laenge()
    {
        int diffX = Math.abs(start.getX() - ende.getX());
        int diffY = Math.abs(start.getY() - ende.getY());
        int diffX2 = diffX * diffX;
        int diffY2 = diffY * diffY;
        double laenge = Math.sqrt(diffX2 + diffY2);
        return laenge;
    }

    @Override
    public String toString()
    {
        String s = String.format("Strecke [start=%s, ende=%s, Laenge=%7.4fcm]", start.toString(), ende.toString(), this.laenge());
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }
}
