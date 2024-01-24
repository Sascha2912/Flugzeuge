import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        SQLController.initDatabase();
        FlughafenController.createFlughafen("München Mitte", "Flugstraße", "44-67", 12345, "München");

        for(Flughafen fh : Flughafen.flughaefen.values()){
            System.out.println("Flughäfen: " + fh.getBezeichnung() + " => " + fh.getFlughafenId());
        }

        System.out.println(" ");

        for(Flugzeugtyp fz : Flugzeugtyp.flugzeugtypen.values()){
            System.out.println("Flugzeugtypen: " + fz.getBezeichnung() + " => " + fz.getAnzahlSitzplaetze());
        }

        System.out.println(" ");

        for(Pilot p : Pilot.piloten.values()){
            System.out.println("Piloten: " + p.getVorname() + " => " + p.getNachname());
        }

        System.out.println(" ");

        for(FlughafenFlugzeug ff : FlughafenFlugzeug.ffListe.values()){
            System.out.println("Flughäfen_Flügzeuge Flughäfen: " + ff.getFlughafen().getBezeichnung() + " => " + ff.getFlugzeugtyp().getBezeichnung());
        }

        System.out.println(" ");

        for(Fluglizenz fl : Fluglizenz.fluglizenzen.values()){
            System.out.println("Flugzeuglizenzen: " + fl.getFlugzeugtyp().getBezeichnung() + " => " + fl.getPilot().getNachname());
        }

    }
}