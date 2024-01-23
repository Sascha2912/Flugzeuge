import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FlugzeugtypController {

    public static void selectFlugzeugtypen(){
        Connection connection = null;

        try{
            connection = MySQL.getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from flugzeugtyp");

            while (rs.next()) {
                int id = rs.getInt(1);
                String bezeichnung = rs.getString(2);
                int anzahlSitzplaetze = rs.getInt(3);
                int reichweiteInKm = rs.getInt(4);


                new Flugzeugtyp(id, bezeichnung,anzahlSitzplaetze,reichweiteInKm);

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

}
