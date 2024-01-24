import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FlughafenFlugzeugController {

    public static void selectFlughafenFlugzeug(){
        Connection connection = null;

        try{
            connection = MySQL.getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from flughafen_flugzeug");

            while (rs.next()) {
                int id = rs.getInt(1);
                int flughafenId = rs.getInt(2);
                int flugzeugtypId = rs.getInt(3);

                Flughafen flughafen = Flughafen.flughaefen.get(flughafenId);
                Flugzeugtyp flugzeugtyp = Flugzeugtyp.flugzeugtypen.get(flugzeugtypId);

                if(flughafen != null && flugzeugtyp != null){
                    new FlughafenFlugzeug(id, flughafen, flugzeugtyp);
                }else{
                    System.err.println("Fehler: Flughafen oder Flugzeugtyp nicht gefunden");
                }



            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
    }

    public static FlughafenFlugzeug createRoute(Flughafen flughafen, Flugzeugtyp flugzeug){
        FlughafenFlugzeug newRoute = null;
        int routeId = SQLController.insertFlughafen_Flugzeug(flughafen.getFlughafenId(), flugzeug.getId());

        if(routeId > 0){
            newRoute = new FlughafenFlugzeug(routeId, flughafen, flugzeug);
            selectFlughafenFlugzeug();
        }

        return newRoute;
    }

}
