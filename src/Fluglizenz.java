import java.util.HashMap;

public class Fluglizenz {

    public static HashMap<Integer, Fluglizenz> fluglizenzen = new HashMap<>();

    private int id;
    private Pilot pilot;
    private Flugzeugtyp flugzeugtyp;

    public Fluglizenz(int id, Pilot pilot, Flugzeugtyp flugzeugtyp){
        this. id = id;
        this.pilot = pilot;
        this.flugzeugtyp = flugzeugtyp;

        fluglizenzen.put(id, this);
    }

    // Getter für id
    public  int getId(){
        return this.id;
    }

    // Getter und Setter für Pilot
    public Pilot getPilot() {
        return this.pilot;
    }
    public void setPilot(){
        this.pilot = pilot;
    }

    // Getter und Setter für flugzeugtyp
    public Flugzeugtyp getFlugzeugtyp() {
        return this.flugzeugtyp;
    }
    public void setFlugzeugtyp(Flugzeugtyp flugzeugtyp) {
        this.flugzeugtyp = flugzeugtyp;
    }

}
