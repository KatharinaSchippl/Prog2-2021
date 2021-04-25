package Klausur;

import Uebung.uebungUebungenUhrzeit;

public class MyString 
{
	private char[] wort;
	private int length;

	public MyString()
	{
		char[] wort= new char[0];
	}

	public char[] MyString(String wort)
	{
		char[] wort = new char[1];
		for(int index=0; index< wort.length; index++)
		{
			wort[index] = (char) wort.length;
		}
		return wort;
	}
	public String MyString(String wort)
	{
		char[] wort = new char[wort.length()];

	    for (int index = 0; index < wort.length; index++)
	    {
	        wort[index] = wort.charAt(index);        
	    }
	    return ca;
	}
	@Override public String toString()
	{
		String s = String.valueOf(wort.length);
		return s;
	}
	public void print()
	{
		System.out.println(this.toString());
	}
	public int getLength()
	{
		return this.wort.length;
	}
	/* auch möglich:
	 * {
			char [] wort = this.wort;
			int wortLaenge = 0;
			wortLaenge = wort.length;
			return wortLaenge;
			
		}
	 */
	public int getCharAt(int index)
	{
		char c = ' ';
		for (int i = 0; i < this.wort.length; i++) 
		{
			if (this.wort[index] == this.wort[i])
			{
				return this.wort[index];
			}
		
		}return c;
		
	}
	public boolean contains (char c)
	{
		for (int index = 0; index < this.wort.length; index++) 
		{
			if (this.wort[index] == c)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean equals (Object o)
	{
	if (o == null) return false;
	if (this == o) return true;
	if (this.getClass() != o.getClass()) return false;

	MyString my = (MyString)o;
	if (my.getLength() == this.getLength())
	{
		return true;
	}
	return false;

	}
	
	//Teil2
	public int getAsciiCodeOfChar (int index)
	{
			if(index <= this.wort.length)
			{
				
			}
			return -1;
		
	}
	
	public void append (char c)
	{
		char[] newArray = new char[this.wort.length+1];
	       for(int index=0; index<this.wort.length; index++)
	       {
	           newArray[index]=this.wort[index];
	       }

	       newArray[newArray.length-1] = c;
	       //oder this.wort = this.newArray;
	}
	 public void append(MyString s)
	 {
		 
	 }
	
	public char [] concat(MyString s1, MyString s2) 
	   {
	      char[] concat = new char[s1.getLength()+s2.getLength()];

	       for(int index=0; index<s1.getLength(); index++)
	       {
	           concat[index] = s1[index];
	       }
	       for(int index=0; index<s2.getLength(); index++)
	       {
	           concat[index+s1.getLength()] = s2[index];
	       }
	       return concat;
	   }
	public int firstIndexOf (char c)
	{
		int i = -1;
		for (int index = 0; index < this.wort.length; index++) 
		{
			if(this.wort[index] == c)
			{
				index = i;
				return i;
			}
		}
		return i;
	}
	
	public int lastIndexOf (char c)
	{
		int i = -1;
		for (int index = 0; index > this.wort.length; index++) 
		{
			if(this.wort[index] == c)
			{
				index = i;
				return i;
			}
		}
		return i;
	} 
	
	public substring(int beginIndex)
	{
		String [] NeuMyString = new String[this.wort.length];
		for(int index=0; index<wort.length; index++)
		{
			if(beginIndex==wort[index])
			{
			
			}
		}
	}
	//Teil 3
	public int substring(int beginIndex, int endIndex)
	{
		
	}
	public static toUpperCase()
	{
		
		String Upper= "wort".toUpperCase();
	}
	
	public static int[] reverse(int[] iarr)
    {
        int[] iaNew = new int[iarr.length];

        for (int index = 0; index < iaNew.length; index++)
        {
            iaNew[index] = iarr[iarr.length-1 - index];
        }

        return iaNew;
    }
	public static boolean contains(MyString s)
	{
		boolean found = false;
	    for(int index=0; index<s.length && !found; index++)
	    {
	        if(wort[index]==s)
	        {
	            found = true;
	        }
	    }
	    return found; 
	}
	
}
