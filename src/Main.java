import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try{
            MySQL.getConnection();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}