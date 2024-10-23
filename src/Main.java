import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Arrays
        // Array mit primitiven Datentyp
        int[] zahlen = new int[4];
        zahlen[0] = 1;
        zahlen[1] = 10;
        zahlen[2] = 20;
        zahlen[3] = 2;

        // finde Max in Array
        int max1 = Hilfsmethode.findeMax(zahlen);
        System.out.println("\nDaten Array: ");
        System.out.println("--------------------");
        System.out.println("\nMax Zahl im Array ist: " + max1);

        // Array mit Referenzdatentyp, Erzeugung und Zuweisung
        Dojo[] dojos = new Dojo[4];
        dojos[0] = new Dojo("ASV Dachau", "Dachau", 200);
        dojos[1] = new Dojo("Budo Akademie", "München", 100);
        dojos[2] = new Dojo("KS Traunreut", "Traunreut", 300);
        dojos[3] = new Dojo("PSV Augsburg", "Augsburg", 50);


        // finde Mitglieder im Array
        int max2 = Hilfsmethode.findeMaxMitglieder(dojos);
        System.out.println("\nHöchste Mitgliederzahl ist: " + max2);

        // Komplette Objektdaten sind in einem Index gespeichert
        // einzeln
        System.out.println(dojos[0].toString());

        //ArrayList
        System.out.println("\nDaten ArrayList: ");
        System.out.println("--------------------");

        ArrayList<Integer> zahlenArrayList = new ArrayList<>();
        zahlenArrayList.add(2);
        zahlenArrayList.add(5);
        zahlenArrayList.add(8);
        zahlenArrayList.add(4);

        int max3 = Hilfsmethode.findeMax(zahlenArrayList);
        System.out.println("\nDie Max Zahl in ArrayList ist: "+ max3);

        // ArrayList mit Referenzdatentyp
        ArrayList<Dojo> dojoArrayList = new ArrayList<>();
        dojoArrayList.add(new Dojo("Asia Sports", "Waldkraitenburg", 200));
        dojoArrayList.add(new Dojo("Shogun", "Memmingen", 100));
        dojoArrayList.add(new Dojo("TSV Milbertshofen", "München", 30));
        dojoArrayList.add(new Dojo("Shotgun", "Shotthausen", 1));
        dojoArrayList.add(new Dojo("TV Fürth 1880", "Fürth", 70));

        int max4 = Hilfsmethode.findeMaxMitglieder(dojoArrayList);
        System.out.println("\nDie höchste Mitgliederzahl in ArrayList ist: " + max4);
        System.out.println("\nArrayList Inhalt ist: " + dojoArrayList);

    }
}