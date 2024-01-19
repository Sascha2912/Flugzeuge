import java.util.HashMap;

public class Pilot {

    public static HashMap<Integer, Pilot> piloten = new HashMap<>();

    private final int id;
    private String vorname;
    private String nachname;

    public Pilot(int id, String vorname, String nachname){
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;

        piloten.put(id, this);
    }

    // Getter für piloten
    public static HashMap<Integer, Pilot> getPiloten() {
        return piloten;
    }

    // Getter für id
    public int getId() {
        return id;
    }

    // Getter und Setter für vorname
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    // Getter nd Setter für nachname
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
