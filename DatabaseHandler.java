import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Config {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();  // Corrected driver class name
            dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        } catch(Exception e){
            System.out.println(e);
        }
        return dbConnection;
    }

    public static void main(String[] args) {
        try {
            DatabaseHandler databaseHandler = new DatabaseHandler();
            Connection connection = databaseHandler.getDbConnection();
            // Do something with the connection, if needed
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }
}
