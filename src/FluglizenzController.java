import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FluglizenzController {

    public static void selectFluglizenzen(){
        Connection connection = null;

        try{
            connection = MySQL.getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from fluglizenz");

            while (rs.next()) {
                int id = rs.getInt(1);
                int pilotId = rs.getInt(2);
                int flugzeugId = rs.getInt(3);

                Pilot pilot = Pilot.piloten.get(pilotId);
                Flugzeugtyp flugzeug = Flugzeugtyp.flugzeugtypen.get(flugzeugId);


                new Fluglizenz(id, pilot, flugzeug);

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

    public static Fluglizenz createFluglizenz(Pilot pilot, Flugzeugtyp flugzeug){
        Fluglizenz newFluglizenz = null;
        int lizenzId = SQLController.insertFluglizenz(pilot.getId(), flugzeug.getId());

        if(lizenzId > 0){
            newFluglizenz = new Fluglizenz(lizenzId, pilot, flugzeug);
            selectFluglizenzen();
        }

        return newFluglizenz;
    }

}
