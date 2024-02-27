import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchByName extends DatabaseHandler {

    public String getAmountByName(String name) {
        return String.valueOf(getColumnValueInt("amount", name));
    }

    public String getCityByName(String name) {
        return getColumnValue("bank_name", name);
    }

    public String getBranchByName(String name) {
        return getColumnValue("branch_name", name);
    }

    public String getIdByName(String name) {
        return String.valueOf(getColumnValueInt("id", name));
    }

    private String getColumnValue(String columnName, String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            connection = getDbConnection();

            String query = "SELECT " + columnName + " FROM table_name WHERE deposit_user LIKE ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, "%" + name + "%");

            results = statement.executeQuery();

            if (results.next()) {
                // Return the result as a String
                return results.getString(columnName);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle the exception as needed
        } finally {
            try {
                if (results != null) results.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception as needed
            }
        }
        return "0"; // Return "0" as a String if no result or an error occurred
    }

    private int getColumnValueInt(String columnName, String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            connection = getDbConnection();

            String query = "SELECT " + columnName + " FROM table_name WHERE deposit_user LIKE ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, "%" + name + "%");

            results = statement.executeQuery();

            if (results.next()) {
                // Return the result as an integer
                return results.getInt(columnName);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle the exception as needed
        } finally {
            try {
                if (results != null) results.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception as needed
            }
        }
        return 0; // Return 0 as an integer if no result or an error occurred
    }


    public static void main(String[] args) {
        SearchByName searchByName = new SearchByName();
        String nameToSearch = "Aidan"; // Replace with the actual name

        String amount = searchByName.getAmountByName(nameToSearch);
        System.out.println("Amount for " + nameToSearch + ": " + amount);

        String branch = searchByName.getCityByName(nameToSearch);
        System.out.println("branch for " + nameToSearch + ": " + branch);

        String city = searchByName.getBranchByName(nameToSearch);
        System.out.println("City for " + nameToSearch + ": " + city);

        String id = searchByName.getIdByName(nameToSearch);
        System.out.println("ID for " + nameToSearch + ": " + id);
    }
}
