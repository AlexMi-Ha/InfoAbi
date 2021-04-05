
public class Sprechstunde {

    private Patient p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15;
    private Patientenwarteschlange patientenws = new Patientenwarteschlange();
    
    
    private void patientenErzeugen(){
        p1 = new Patient("Anger", "Kopfschmerzen");
        p2 = new Patient("Breitner", "Halsweh");
        p3 = new Patient("Carl", "Fieber");
        p4 = new Patient("D�rr", "U8");
        p5 = new Patient("Eich", "Bluthochdruck");
        p6 = new Patient("Fuchs", "Beinbruch");
        p7 = new Patient("Graf", "Ohrenschmerzen");
        p8 = new Patient("Huber", "Zeckenbiss");
        p9 = new Patient("Igel", "Impfung");
        p10 = new Patient("Jakob", "EKG");
        p11 = new Patient("Kaiser", "Gehirnersch�tterung");
        p12 = new Patient("Ludwig", "Schnittwunde");
        p13 = new Patient("Maier", "Erk�ltung");
        p14 = new Patient("Nagel", "Husten");
        p15 = new Patient("Orter", "Scharlach");
    }
    
    public void ablaufen(){
        patientenErzeugen();
        System.out.println("Das Wartezimmer ist leer: " + patientenws.istLeer());
        System.out.println("Die ersten 4 Patienten werden eingef�gt!");
        patientenws.hintenEinfuegen(p1);
        patientenws.hintenEinfuegen(p2);
        patientenws.hintenEinfuegen(p3);
        patientenws.hintenEinfuegen(p4);
        patientenws.alleAusgeben();
        
        System.out.println("Das Wartezimmer ist leer: " + patientenws.istLeer());
        
        System.out.println("Nun kommt der erste Patient dran:");
        Patient aktuellerP=patientenws.vorneEntnehmen();
        System.out.println(aktuellerP.nameGeben() + " ist in der Sprechstunde wegen "+ aktuellerP.anlassGeben());
        
        patientenws.alleAusgeben();
        System.out.println("Es sind " + patientenws.anzahlGeben() + " Patienten im Wartezimmer.");
        
        System.out.println("Weitere 11 Patienten wollen angemeldet werden:");
        patientenws.hintenEinfuegen(p5);
        patientenws.hintenEinfuegen(p6);
        patientenws.hintenEinfuegen(p7);
        patientenws.hintenEinfuegen(p8);
        patientenws.hintenEinfuegen(p9);
        patientenws.hintenEinfuegen(p10);
        patientenws.hintenEinfuegen(p11);
        patientenws.hintenEinfuegen(p12);
        patientenws.hintenEinfuegen(p13);
        patientenws.hintenEinfuegen(p14);
        patientenws.hintenEinfuegen(p15);
        
        patientenws.alleAusgeben();
   
        
        for( int i=0; i<14; i++) {
            System.out.println("Es sind " + patientenws.anzahlGeben() + " Patienten im Wartezimmer.");
            System.out.println("Nun kommt der naechste Patient dran:");
            aktuellerP=patientenws.vorneEntnehmen();
            if (aktuellerP!=null) {System.out.println(aktuellerP.nameGeben() + " ist in der Sprechstunde wegen "+ aktuellerP.anlassGeben());}
        }

        
        
    }
}
        
        
        
        
