import java.util.HashMap;

public class Flugzeugtyp {

    public static HashMap<Integer, Flugzeugtyp> flugzeugtypen = new HashMap<>();

    private final int id;
    private String bezeichnung;
    private int anzahlSitzplaetze;
    private int reichweiteInKm;

    public Flugzeugtyp(int id, String bezeichnung, int anzahlSitzplaetze, int recihweiteInKm){
        this.id = id;
        this.bezeichnung = bezeichnung;
        this. anzahlSitzplaetze = anzahlSitzplaetze;
        this. reichweiteInKm = recihweiteInKm;

        flugzeugtypen.put(id, this);
    }

    // Getter für id
    public int getId() {
        return id;
    }

    // Getter und Setter für bezeichnung
    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    // Getter und Setter für anzahlSitzplaetze
    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }
    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    // Getter und Setter für reichweiteInKm
    public int getReichweiteInKm() {
        return reichweiteInKm;
    }
    public void setReichweiteInKm(int reichweiteInKm) {
        this.reichweiteInKm = reichweiteInKm;
    }
}
