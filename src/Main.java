import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        FlughafenController.selectFlughaefen();

        for(Flughafen fh : Flughafen.flughaefen.values()){
            System.out.println("\nFlughäfen: " + fh.getBezeichnung() + " => " + fh.getFlughafenId());
        }

    }
}