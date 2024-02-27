import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceManager extends DatabaseHandler {

    public void increaseBalance(String name, int amountToAdd) {
        updateBalance(name, getAmountByName(name) + amountToAdd);
    }

    public void decreaseBalance(String name, int amountToSubtract) {
        int currentBalance = getAmountByName(name);
        if (currentBalance >= amountToSubtract) {
            updateBalance(name, currentBalance - amountToSubtract);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public int getAmountByName(String name) {
        return getColumnValueInt("amount", "deposit_user", name);
    }

    private void updateBalance(String name, int newBalance) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = getDbConnection();

            String query = "UPDATE table_name SET amount = ? WHERE deposit_user LIKE ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, newBalance);
            statement.setString(2, "%" + name + "%");

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Balance updated successfully.");
            } else {
                System.out.println("Failed to update balance. User not found.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle the exception as needed
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception as needed
            }
        }
    }

    private int getColumnValueInt(String columnName, String userColumn, String userName) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            connection = getDbConnection();

            String query = "SELECT " + columnName + " FROM table_name WHERE " + userColumn + " LIKE ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, "%" + userName + "%");

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
        BalanceManager balanceManager = new BalanceManager();
        String nameToSearch = "Aidan"; // Replace with the actual name

        // Increase balance by 100
        balanceManager.increaseBalance(nameToSearch, 100);
        int updatedAmount = balanceManager.getAmountByName(nameToSearch);
        System.out.println("Updated Amount for " + nameToSearch + ": " + updatedAmount);

        // Decrease balance by 50 (corrected from 100 to 50)
        balanceManager.decreaseBalance(nameToSearch, 100);
        updatedAmount = balanceManager.getAmountByName(nameToSearch); // Update the updatedAmount variable
        System.out.println("Updated Amount for " + nameToSearch + ": " + updatedAmount);

        // Display the updated balance
        System.out.println("Updated Amount for " + nameToSearch + ": " + updatedAmount);
    }
}
