package Uebung;

import java.util.Random;

public class uebungUebungen11Testklasse 
{

	public static void main(String[] args) 
	{
		 System.out.printf("%n%n---------------- Punkt2D und Punkt3D ---------------%n%n");
	        Random r = new Random();
	        uebungUebungen11Punkt2D[] pa = new  uebungUebungen11Punkt2D[3];
	        int anz2D = 0;
	        while(anz2D < 3)
	        {
	            int x = r.nextInt(10);
	            int y = r.nextInt(10);
	            int z = r.nextInt(10);
	            uebungUebungen11Punkt3D p;
	            if(z==0)
	            {
	                pa[anz2D] = new  uebungUebungen11Punkt2D(x,y);
	                pa[anz2D].print();
	                anz2D++;
	            }
	            else
	            {
	                p = new  uebungUebungen11Punkt3D(x,y,z);
	                p.print();
	            }
	        }

	        System.out.printf("%n%n-------------------- Strecke -----------------------%n%n");
	        uebungUebungen11Strecke s1 = new  uebungUebungen11Strecke(pa[0], pa[1]);
	        uebungUebungen11Strecke s2 = new  uebungUebungen11Strecke(pa[1], pa[2]);
	        uebungUebungen11Strecke s3 = new  uebungUebungen11Strecke(pa[2], pa[0]);
	        s1.print();
	        s2.print();
	        s3.print();

	        System.out.printf("%n%n------------------ PunkteArray ---------------------%n%n");
	        uebungUebungen11PunkteArray parr = new  uebungUebungen11PunkteArray(15);
	        parr.fillArray();
	        parr.print();
	        parr.printStrecken();
	}

}
