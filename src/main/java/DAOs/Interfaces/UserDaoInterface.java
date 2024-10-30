package DAOs.Interfaces;
import Models.User;

import java.sql.SQLException;

public interface UserDaoInterface {
    void createUser () throws SQLException;
}
