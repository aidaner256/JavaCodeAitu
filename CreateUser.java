import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateUser extends DatabaseHandler {

    public void createUser(String bankName, String branchName, String depositUser, String userName, int userId, int amount) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = getDbConnection();

            String query = "INSERT INTO table_name (bank_name, branch_name, deposit_user, user, id, amount) VALUES (?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, bankName);
            statement.setString(2, branchName);
            statement.setString(3, depositUser);
            statement.setString(4, userName);
            statement.setInt(5, userId);
            statement.setInt(6, amount);

            statement.executeUpdate();

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

    public void deleteUser(String depositUser) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = getDbConnection();

            String query = "DELETE FROM table_name WHERE user = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, depositUser);

            statement.executeUpdate();

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

    public static void main(String[] args) {
        CreateUser createUser = new CreateUser();

        // Пример создания пользователя
        createUser.createUser("BankName", "BranchName", "DepositUser", "UserName", 1, 1000);

        // Пример удаления пользователя
        createUser.deleteUser("UserName");
    }
}
