import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PilotController {

    public static void selectPiloten(){
        Connection connection = null;

        try{
            connection = MySQL.getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from pilot");

            while (rs.next()) {
                int id = rs.getInt(1);
                String vorname = rs.getString(2);
                String nachname = rs.getString(3);


                new Pilot(id, vorname,nachname);

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
