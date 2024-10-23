public class Dojo {
    private String name;
    private String stadt;
    private int mitglieder;

    // Konstruktor
    public Dojo(String name, String stadt, int mitglieder) {
        this.name = name;
        this.stadt = stadt;
        this.mitglieder = mitglieder;
    }
    // Methoden
    public int getMitglieder() {
        return mitglieder;
    }

    public String toString() {
        return "\n" + "Vereinsname: " + name + " - Stadt: " + stadt + " - Mitglieder: " + mitglieder;
    }

}
