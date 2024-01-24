import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.SQLException;

public class SQLController {

    public static void initDatabase(){
        PilotController.selectPiloten();
        FlugzeugtypController.selectFlugzeugtypen();
        FlughafenController.selectFlughaefen();
        FluglizenzController.selectFluglizenzen();
        FlughafenFlugzeugController.selectFlughafenFlugzeug();
    }

    public  static int insertDataToDatabase(String bezeichnung, String straße, String hausnummer, int plz, String ort ){

        try(
                Connection connection = MySQL.getConnection();
                CallableStatement statement = connection.prepareCall(
                        "CALL insertFlughafen(?, ?, ?, ?, ?, ?)"
                )
        ){
            statement.setString(1,bezeichnung);
            statement.setString(2, straße);
            statement.setString(3, hausnummer);
            statement.setInt(4, plz);
            statement.setString(5,ort);

            statement.registerOutParameter(6, JDBCType.INTEGER);

            if(statement.executeUpdate() > 0){
                return statement.getInt(6);
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return -1;
    }

    public  static int insertDataToDatabase(String bezeichnung, int anzahlSitzplaetze, int reichweiteInKm){

        try(
                Connection connection = MySQL.getConnection();
                CallableStatement statement = connection.prepareCall(
                        "CALL insertFlugzeugtyp(?, ?, ?, ?)"
                )
        ){
            statement.setString(1,bezeichnung);
            statement.setInt(2, anzahlSitzplaetze);
            statement.setInt(3, reichweiteInKm);


            statement.registerOutParameter(4, JDBCType.INTEGER);

            if(statement.executeUpdate() > 0){
                return statement.getInt(4);
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return -1;
    }

    public  static int insertDataToDatabase(String vorname, String nachname){

        try(
                Connection connection = MySQL.getConnection();
                CallableStatement statement = connection.prepareCall(
                        "CALL insertPilot(?, ?, ?)"
                )
        ){
            statement.setString(1,vorname);
            statement.setString(2, nachname);

            statement.registerOutParameter(3, JDBCType.INTEGER);

            if(statement.executeUpdate() > 0){
                return statement.getInt(3);
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return -1;
    }

    public  static int insertFlughafen_Flugzeug(int flughafenId, int flugzeugId){

        try(
                Connection connection = MySQL.getConnection();
                CallableStatement statement = connection.prepareCall(
                        "CALL insertFlughafen_Flugzeug(?, ?, ?)"
                )
        ){
            statement.setInt(1,flughafenId);
            statement.setInt(2, flugzeugId);

            statement.registerOutParameter(3, JDBCType.INTEGER);

            if(statement.executeUpdate() > 0){
                return statement.getInt(3);
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return -1;
    }

    public  static int insertFluglizenz(int pilotId, int flugzeugId){

        try(
                Connection connection = MySQL.getConnection();
                CallableStatement statement = connection.prepareCall(
                        "CALL insertPilot(?, ?, ?)"
                )
        ){
            statement.setInt(1,pilotId);
            statement.setInt(2, flugzeugId);

            statement.registerOutParameter(3, JDBCType.INTEGER);

            if(statement.executeUpdate() > 0){
                return statement.getInt(3);
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return -1;
    }

}
