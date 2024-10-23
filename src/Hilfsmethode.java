import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hilfsmethode {
    // finde Max im Array
    public static int findeMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int findeMaxMitglieder(Dojo[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getMitglieder() > max) {
                max = array[i].getMitglieder();
            }
        }
        return max;
    }
    //Finde Max mit Arraylist - primDT
    public static int findeMax(ArrayList<Integer> arrayList) {
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
    // ArrayList Mitglieder - Objekt
    public static int findeMaxMitglieder(ArrayList<Dojo> dojos) {
        int max = 0;
        for (int i = 0; i < dojos.size(); i++) {
            if (dojos.get(i).getMitglieder() > max) {
                max = dojos.get(i).getMitglieder();
            }
        }
        return max;
    }
}
