package DAOs;
import DAOs.Interfaces.UserDaoInterface;
import Database.ApplicationDb;
import Models.User;
import java.util.UUID;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class UserDao implements UserDaoInterface {
    Connection connection = null;

    @Override
    public void createUser() throws SQLException {

        this.connection = ApplicationDb.connect();
        UUID uuid = UUID.randomUUID();
        String query = "INSERT INTO USERS (id, email, username, psw, picture, balance) VALUES " +
                "(?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = this.connection.prepareStatement(query);
        stm.setString(1, uuid.toString());
        stm.setString(2, "teste@teste.com");
        stm.setString(3, "teste");
        stm.setString(4, "teste");
        stm.setString(5, "teste");
        stm.setFloat(6, 0);
        stm.executeQuery();
        this.connection.close();
    }
}
