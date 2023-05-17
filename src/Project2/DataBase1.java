package Project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase1 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/project";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from informations");

            while(rs.next()){
                System.out.println(rs.getString(2));
            }
            connection.close(); // closing the connection
        }
        catch(Exception e){
            System.out.println("Wazzup");
        }


    }
}
