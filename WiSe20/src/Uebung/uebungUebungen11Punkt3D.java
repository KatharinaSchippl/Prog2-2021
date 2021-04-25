package Uebung;

public class uebungUebungen11Punkt3D 
{
	private int x;
    private int y;
    private int z;

    public uebungUebungen11Punkt3D(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public int getZ()
    {
        return this.z;
    }

    @Override
    public String toString()
    {
        return String.format("(%d,%d,%d)", this.x, this.y, this.z);
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null) return false;
        if(this == o) return true;
        if(this.getClass() != o.getClass()) return false;

        uebungUebungen11Punkt3D p = (uebungUebungen11Punkt3D)o;
        return this.x == p.x && this.y == p.y && this.z == p.z;
    }

    public boolean xIsSmaller(uebungUebungen11Punkt3D p)
    {
        return this.x < p.x;
    }   

    public boolean yIsSmaller(uebungUebungen11Punkt3D p)
    {
        return this.y < p.y;
    }

    public boolean zIsSmaller(uebungUebungen11Punkt3D p)
    {
        return this.z < p.z;
    }
}
