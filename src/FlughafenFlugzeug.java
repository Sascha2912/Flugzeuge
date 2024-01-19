import java.util.HashMap;

public class FlughafenFlugzeug {

    public static HashMap<Integer, FlughafenFlugzeug> ffListe = new HashMap<>();

    private final int id;
    private Flughafen flughafen;
    private Flugzeugtyp flugzeugtyp;

    public FlughafenFlugzeug(int id, Flughafen flughafen, Flugzeugtyp flugzeugtyp){

        this.id = id;
        this.flughafen = flughafen;
        this.flugzeugtyp = flugzeugtyp;

        ffListe.put(id, this);

    }

    // Getter für ffListe
    public static HashMap<Integer, FlughafenFlugzeug> getFfListe() {
        return ffListe;
    }

    // Getter für id
    public int getId(){
        return this.id;
    }

    // Getter und Setter für flughafen
    public Flughafen getFlughafen(){
        return this.flughafen;
    }
    public void setFlughafen(Flughafen flughafen){
        this.flughafen = flughafen;
    }

    // Getter und Setter für flugzeugtyp
    public Flugzeugtyp getFlugzeugtyp() {
        return this.flugzeugtyp;
    }
    public void setFlugzeugtyp(Flugzeugtyp flugzeugtyp) {
        this.flugzeugtyp = flugzeugtyp;
    }
}
