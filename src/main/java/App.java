import DAOs.UserDao;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World");
        UserDao user = new UserDao();
        user.createUser();
    }
}
