package Uebung;

public class uebungUebungen11Punkt2D extends uebungUebungen11Punkt3D
{
    public uebungUebungen11Punkt2D(int x, int y)
    {
        super(x,y,0);
    }

    @Override
    public String toString()
    {
        return String.format("(%d,%d)", this.getX(), this.getY());
    }
}