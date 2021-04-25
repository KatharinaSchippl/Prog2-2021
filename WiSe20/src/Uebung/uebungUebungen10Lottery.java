package Uebung;

import java.util.Random;

public class uebungUebungen10Lottery 
{
	 private int[] drawingResults;

	    public uebungUebungen10Lottery()
	    {
	        this.drawingResults = new int[5];
	    }

	    public boolean contains(int number)
	    {
	        for (int index = 0; index < this.drawingResults.length; index++)
	        {
	            if(this.drawingResults[index] == number)
	            {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void drawing()
	    {
	        Random r = new Random();
	        for (int index = 0; index < this.drawingResults.length; index++)
	        {
	            int zufZahl = r.nextInt(9) + 1;
	            while(this.contains(zufZahl))
	            {
	                zufZahl = r.nextInt(9) + 1;
	            }
	            this.drawingResults[index] = zufZahl;
	        }
	    }

	    public void sort()
	    {
	        for(int bubble=1; bubble<this.drawingResults.length; bubble++)
	        {
	            for(int index=0; index<this.drawingResults.length-bubble; index++)
	            {
	                if(this.drawingResults[index] > this.drawingResults[index+1])
	                {
	                    int tmp = this.drawingResults[index];
	                    this.drawingResults[index] = this.drawingResults[index+1];
	                    this.drawingResults[index+1] = tmp;
	                }
	            }
	        }
	    }

	    @Override
	    public String toString()
	    {
	        this.sort();
	        String s = "( ";
	        int index = 0;
	        for(int number = 1; number <10; number++)
	        {
	            if(index<5 && this.drawingResults[index] == number)
	            {
	                s += this.drawingResults[index] + " ";
	                index++;
	            }
	            else
	            {
	                s += "- ";
	            }
	        }
	        s += ")";
	        return s;
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }

	    @Override
	    public boolean equals(Object o)
	    {
	        if(o == null) 
	        {
	            return false;
	        }
	        if(this == o)
	        {
	            return true;
	        }
	        if(this.getClass() != o.getClass())
	        {
	            return false;
	        }

	        uebungUebungen10Lottery lo = (uebungUebungen10Lottery)o;
	        lo.sort();
	        this.sort();
	        for (int index = 0; index < this.drawingResults.length; index++)
	        {
	            if(this.drawingResults[index] != lo.drawingResults[index])
	            {
	                return false;
	            }
	        }
	        return true;
	    }
}
