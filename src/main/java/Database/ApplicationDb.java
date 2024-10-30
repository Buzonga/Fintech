package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApplicationDb {
    public static Connection connection;

    public static Connection connect() {

        connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM558164",
                    "010902");
            System.out.println("Conexão realizada!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }

    public static void Disconnect() {
        try {
            connection.close();
        } catch (SQLException exception){
            System.out.print("Erro de conexão");
        }

    }
}
