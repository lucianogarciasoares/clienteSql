package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection createConnection() throws Exception {

		String driver = "org.postgresql.Driver";
		String server = "jdbc:postgresql://localhost:5432/bd_projeto05";
		String user = "postgres";
		String password = "coti";

		Class.forName(driver);
		return DriverManager.getConnection(server, user, password);

	}
}
