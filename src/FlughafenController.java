import java.sql.*;
public class FlughafenController {

    public static void selectFlughaefen(){
        Connection connection = null;

        try{
            connection = MySQL.getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from de_flughafen");

            while (rs.next()) {
                int id = rs.getInt(1);
                String bezeichnung = rs.getString(2);
                String straße = rs.getString(3);
                String hausnummer = rs.getString(4);
                int plz = rs.getInt(5);
                String ort = rs.getString(6);

                new Flughafen(id, bezeichnung,straße,hausnummer,plz,ort);

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
