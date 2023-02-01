package HomeWork5.Ex1.personal.database;

import java.io.File;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseManager {

	private Connection connection;
    private String fileName;
	public DatabaseManager(String fileName) {
		this.fileName = fileName;
		openConnection();
		loadTables();
	}

	public boolean idExists(String id) {
		ResultSet resultSet =  getResult("SELECT * FROM users WHERE id=" + id + "");
		try {
			if (resultSet.next())
				return true;
		} catch (SQLException e) {
		}
		return false;
	}
	private void openConnection() {
		if (!isConnected()) {
			try {
				Class.forName("org.sqlite.JDBC");
				connection = DriverManager.getConnection("jdbc:sqlite:" + Paths.get("").toAbsolutePath().toString() + File.separator + fileName);
			} catch (SQLException ex) {
			} catch (ClassNotFoundException ex) {
			}
		}
	}

	private void loadTables() {

		if (isConnected()) {

			update("CREATE TABLE IF NOT EXISTS users(id INT(64), firstName VARCHAR(64), lastName VARCHAR(64), phone VARCHAR(16), PRIMARY KEY (id))");
		}
	}

	public void closeConnection() {
		if (isConnected()) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException ex) {
			}
		}
	}

	public void update(String query) {
		if (isConnected()) {
			try {
				connection.prepareStatement(query).executeUpdate();

			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	public ResultSet getResult(String query) {
		if (isConnected()) {
			try {
				return connection.prepareStatement(query).executeQuery();
			} catch (SQLException ex) {
			}
		}
		return null;
	}


	public Connection getConnection() {
		return connection;
	}

	public boolean isConnected() {
		return connection != null;
	}
}
