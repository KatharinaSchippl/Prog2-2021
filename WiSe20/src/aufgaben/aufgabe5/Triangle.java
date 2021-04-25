package aufgaben.aufgabe5;
/*
 * @author Katharina Schippl
 * @author Thao Trang Le (Anny)
 */

public class Triangle {
    
    //-----Objektvariablen-----
    //private int a;
    //private int b;
    //private int c;                //Seiten unseres Dreiecks
     private int a,b,c;
    
     //-----Konstruktor-----
    public Triangle (int pA, int pB, int pC)
    {
        a = pA;  //this.a = a;
        b = pB;
        c = pC;
    }
    
    //-----Objektmethoden-----
    public void print()
    {
        System.out.println("Seiten         :a= " + a + ", b= " + b + ", c= " + c);
        System.out.println("Umfang         :" + circumference());  // Aufruf Objektmethode
        System.out.println("Flaecheninhalt :" + area());   // Aufruf Objektmethode
        if (equilateral()==true) //true ist nicht nötig
        {
            System.out.println("Das Dreieck ist gleichseitig");
        }
        
        else if(isosceles()== true) //true ist nicht nötig
        {
            System.out.println("Das Dreieck ist gleichschenklig");
        }
        else 
        {
            System.out.println("Das Dreieck ist unregelmäßig");
        }
        
        if (isRightAngled()==true)
        {
            System.out.println("Das Dreieck ist rechtwinklig");
        }
        else
        {
        System.out.println("Das Dreieck ist nicht rechtwinklig");
        }
        System.out.println();
        
        //Zusatzbedingung
        //System.out.println("Das Dreieck ist unregelmäßig");
        /*if (equilateral() &&isosceles()== false )
        {
            System.out.println("Das Dreieck ist unregelmäßig");
        }
        */
        
        
        
    }
    
    public int circumference() //Umfang
    {
        return a+b+c;
    }
    
    public double area() //Flächeninhalt //Beachte: Beachten Sie, dass in einem Dreieck keine Seite länger sein darf als die Summe der beiden anderen. Für die oben in der main()-Methode erstellten Objekte gilt das aber. Wir müssen deshalb nichts weiter beachten.
    {
         double s = (a + b + c) /2.0; //BEACHTE: entweder mit /2.0 oder *0.5
         double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
         return A;
         
         //oder: 
         //double s = 0.5*(a+b+c);
         //double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
         //return area;
        
         
    }
    
    public boolean equilateral() //gleichseitig
    {
        if (a==b && b==c && a ==c)
        {
            return true;
        }
        return false;
        
       
    }
    
    public boolean isosceles() //gleichschenklig
    {
        if (a == b || b == c || a == c)
        {
            return true;
        }
        return false;
        
      
    }
    
    public boolean sameCircumference(Triangle t) //gleicher Umfang
    {
       
        
        return (circumference() ==t.circumference());
        //oder: return t.circumference () == circumrefernce();
    }
    
    public boolean isSmaller(Triangle t)
    {
        
        return (area()<t.area()); 
    }
   
    public boolean isBigger(Triangle t)
    {
        
        
        return (area()>t.area()); 
    }
    
    
    //ab hier Zusatzaufgabe:
    public boolean sidesAreEqual (Triangle t)
    {
        return (a==t.a && b==t.b && c==t.c) ||
                (a==t.b && b==t.c && c==t.a) ||
                (a==t.c && b==t.a &&c==t.b);
    }
    
    public boolean isRightAngled()
    {
        return ((a*a == (b*b+c*c)) ||
                (b*b == (c*c+a*a)) ||
                (c*c == (b*b+a*a)));
    }
    
}
