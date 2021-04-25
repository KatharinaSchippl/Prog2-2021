package Uebung;

public class uebungUebungenUhrzeitTestklasse 
{

	public static void main(String[] args) 
	{
		System.out.printf("%n%n---------------------- Test Uhrzeit --------------------------%n%n");
		uebungUebungenUhrzeit z1 = new uebungUebungenUhrzeit(83);
		uebungUebungenUhrzeit z2 = new uebungUebungenUhrzeit(3662);
		uebungUebungenUhrzeit z3 = new uebungUebungenUhrzeit(86399);
		uebungUebungenUhrzeit z4 = new uebungUebungenUhrzeit(172799);

        System.out.print("z1 : "); 
        z1.print();
        System.out.print("z2 : "); 
        z2.print();
        System.out.print("z3 : "); 
        z3.print();
        System.out.print("z4 : "); 
        z4.print();

        System.out.println("z1 frueher als z2 ? " + z1.frueher(z2));
        System.out.println("z3 frueher als z4 ? " + z3.frueher(z4));

        System.out.println("z1 plus   40 Sekunden : " 
        + z1.jetztPlusXSekunden(40));
        System.out.println("z2 plus 3598 Sekunden : " 
        + z2.jetztPlusXSekunden(3598));

        System.out.println("z3-z2 in Sekunden : " 
        + z3.differenzInSekunden(z2));

        System.out.printf("%n%n------------------- Test UhrzeitArray ------------------------%n%n");
        uebungUebungenUhrzeitArray ua = new uebungUebungenUhrzeitArray(10);
        ua.fill();
        ua.print();
        System.out.println("frueheste : " + ua.frueheste());

        uebungUebungenUhrzeit frueh = new uebungUebungenUhrzeit(36000);
        uebungUebungenUhrzeit spaet = new uebungUebungenUhrzeit(72000);
        uebungUebungenUhrzeitArray zwischen = ua.zwischen(frueh, spaet);

        System.out.print("frueh    : "); frueh.print();
        System.out.print("spaet    : "); spaet.print();
        System.out.print("zwischen : "); zwischen.print();

        ua.sortieren();
        ua.print();

        uebungUebungenUhrzeitArray kleinsterAbstand = ua.kleinsterAbstand();
        System.out.print("kleinster Abstand : ");
        kleinsterAbstand.print();   

	}

}
