package aufgaben.aufgabe2;

/*
 * Katharina Schippl
 * 
 * bearbeitet mit @Thao Trang Le (Anny)
 */

public class MyInteger 
{ //-----------------Objektvariablen-------------------//
//1)
static static final int MAX_VALUE = 2147483647;  
static static final int MIN_VALUE = -2147483648;
// 2) 
private int value;
// 3)
public static int parseInt(String s) throws IllegalArgumentException
{
	if(s.length()==0) throw new IllegalArgumentException("Leere Eingabe.");
	boolean negative=false;
	if(s.charAt(0)=='+')
	{
		s=s.substring(1);
	}
	else if(s.charAt(0)=='-')
	{
		s=s.substring(1);
		negative= true;
	}
	if(s.length()==0) throw new IllegalArgumentException("Eingabe ist nur +/-. Es muss eine Zahl sein.");
	s=removeLeadingzeros(s);
	if(!inputIsNumber(s)) throw new IllegalArgumentException("Die Eingabe ist keine Zahl.");
	int zahl=0;
	int exponent =1;
	for(int i= s.length()-1; i>=0; i--)
	{
		zahl= zahl+ charToInt(s.charAt(i)*exponent);
		exponent*=10;
	}
	if(negative) return -zahl;
	else return zahl;
}
/*public static void parseInt(String s)
{
try
{
	for(int index=0; index < s.length(); index++)
	{
		if((s.charAt(index) == 43 || s.charAt(index) == 45) && (s.charAt(index) >= 48 || s.charAt(index) <= 57 ))
		{
			for(int index2 = 0; index2 < s.length(); index++)
			{
				char c = s.charAt(index2);
				int i = (int)c;
			}
		}
		}

	
    }
    catch (Exception e)
    {
       System.out.println(" Es handelt sich um keine Zahl");
    }
}
 * 
 */



// 4)
public MyInteger(int value) 
{
	this.value=value;
}
// 4)
public MyInteger(String s) throws IllegalArgumentException
{
	this.value= parseInt(s);
}
/*
 * 
public MyInteger(String s) throws IllegalArgumentException
	{
		if(!MyInteger.isInteger(s))
		{
			throw new IllegalArgumentException("Der String muss eine Zahl sein!");
		}
		this.value = MyInteger.parseInt(s);
	}

 */

// 5)
public int intValue() 
{
 return this.value;
}
// 6)
public double doubleValue() 
{	
	return this.value;
}
// 7)
static MyInteger valueOf(String s) throws IllegalArgumentException
{
	return new MyInteger(s);
}
// 8)
public static MyInteger valueOf(int value)
{
	return new MyInteger(value);
}
 
//public int valueOf(int value)
//{
	//int i1= Integer.valueOf(MyInteger);
	//return value;
//}
static String removeLeadingzeros(String s)
{
	while(s.charAt(0)=='0')
	{
		s = s.substring(1);
	}
	return s;
}
static boolean charIsDigit(char c)
{
	return (c=='0'|| c=='1'||c=='2'|| c=='3'||c=='4'|| c=='5'||c=='6'|| c=='7'||c=='8'||c=='9');
}
static boolean inputIsNumber(String s)
{
	for(int i=0; i<s.length();i++)
	{
		if(!charIsDigit(s.charAt(i)))
		{
			return false;
		}
	}
	return true;
}
/* public boolean zahl (char c)
{
	if(c >= 48 || <= 57)
	{
		return true;
	}
	else
	{ 
		return false;
	}
}
 * 
 */
static int charToInt(int i)
{
	int charAsciiValue=i;
	int intValue= charAsciiValue-48;
	return intValue;
}

@SuppressWarnings("deprecation")
Integer MyInteger = new Integer (value); 

public void Integer(int value) 
{
    this.value = value;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((MyInteger == null) ? 0 : MyInteger.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MyInteger other = (MyInteger) obj;
	if (MyInteger == null) {
		if (other.MyInteger != null)
			return false;
	} else if (!MyInteger.equals(other.MyInteger))
		return false;
	return true;
}

}

