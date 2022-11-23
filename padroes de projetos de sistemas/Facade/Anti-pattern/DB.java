import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() throws SQLException, IOException {
		if (conn == null) {

			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			conn = DriverManager.getConnection(url, props);

		}
		return conn;
	}

	public static void closeConnection() throws SQLException {
		if (conn != null) {

			conn.close();
		}
	}

	private static Properties loadProperties() throws IOException {
		FileInputStream fs = new FileInputStream("db.properties");
		Properties props = new Properties();
		props.load(fs);
		return props;

	}

	public static void closeStatement(Statement st) throws SQLException {
		if (st != null) {

			st.close();

		}
	}

	public static void closeResultSet(ResultSet rs) throws SQLException {
		if (rs != null) {

			rs.close();

		}
	}
}
