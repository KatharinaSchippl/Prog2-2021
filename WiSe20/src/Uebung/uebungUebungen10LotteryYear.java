package Uebung;

public class uebungUebungen10LotteryYear 
{
	private uebungUebungen10Lottery[] lotteryYear;

    public uebungUebungen10LotteryYear()
    {
        final int WEEKS = 52;
        this.lotteryYear = new uebungUebungen10Lottery[WEEKS];
        for (int index = 0; index < this.lotteryYear.length; index++)
        {
            this.lotteryYear[index] = new uebungUebungen10Lottery();
            this.lotteryYear[index].drawing();
            this.lotteryYear[index].sort();
        }
    }

    public int nrOfNumber(int number)
    {
        int nrOfNumber = 0;
        for (int index = 0; index < this.lotteryYear.length; index++)
        {
            if(this.lotteryYear[index].contains(number))
            {
                nrOfNumber++;
            }
        }
        return nrOfNumber;
    }

    public int[] frequency()
    {
        int[] frequency = new int[9];
        for(int index=0; index<9; index++)
        {
            int number = index +1;
            frequency[index] = this.nrOfNumber(number);
        }
        return frequency;
    }

    public void printFrequencyString()
    {
        int[] frequency = this.frequency();
        int summe = 0;
        System.out.print("[ ");
        for (int index = 0; index < frequency.length; index++)
        {
            summe += frequency[index];
            if(index<frequency.length-1)
            {
                System.out.print(frequency[index] +", ");
            }
            else
            {
                System.out.print(frequency[index]);
            }
        }
        System.out.println(" ]  --> " + summe);
    }


    public void printFrequencyDiagram()
    {
        int[] frequency = this.frequency();
        for (int index = 0; index < frequency.length; index++)
        {
            System.out.print((index +1) + " : ");
            for(int stars = 0; stars < frequency[index]; stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public boolean containsEquals()
    {
        for (int index1 = 0; index1 < this.lotteryYear.length; index1++)
        {
            for (int index2 = index1+1; index2 < this.lotteryYear.length; index2++)
            {
                if(this.lotteryYear[index1].equals(this.lotteryYear[index2]))
                {
                    return true;
                }           
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int index = 0; index < lotteryYear.length; index++)
        {
            s += String.format("%2d : %s %n", (index+1), this.lotteryYear[index].toString());
        }
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }


    public uebungUebungen10Lottery[] getArrayOfDoublets()
    {
    	uebungUebungen10Lottery[] loa = new uebungUebungen10Lottery[2];
        for (int index1 = 0; index1 < this.lotteryYear.length; index1++)
        {
            for (int index2 = index1+1; index2 < this.lotteryYear.length; index2++)
            {
                if(this.lotteryYear[index1].equals(this.lotteryYear[index2]))
                {
                    loa[0] = this.lotteryYear[index1];
                    loa[1] = this.lotteryYear[index2];
                    return loa;
                }           
            }
        }
        return loa;
    }
}
