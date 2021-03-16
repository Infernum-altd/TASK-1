import java.sql.*;

public class AccountDAO {
    public static void main(String[] args) {


        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc-test", "postgres", "admin");
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("select * from account");) {

            while (rs.next()) {
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //int result = statement.executeUpdate("INSERT into account values(1, 'firstname', 'lastname', 10000)");
        //System.out.println(result);


        /*int result = statement.executeUpdate("update account set bal = 10 where accno=1");
        System.out.println(result);*/

        /*int result = statement.executeUpdate("delete from account where accno=1");
        System.out.println(result);*/


    }
}
