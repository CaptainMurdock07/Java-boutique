package gestcom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	final String driver = "oracle.jdbc.OracleDriver";
	final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	final String uid = "la300"; final String psswrd = "secret";
	static DB instance = null;
	private Connection cx = null;
	private Statement stmt = null;
	
	public DB() throws SQLException, ClassNotFoundException {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, psswrd);
			stmt = cx.createStatement();
	}
	public static DB getDB() throws SQLException, ClassNotFoundException {
		if (instance == null)
			instance = new DB();
		return instance;
	}
	public int update (String requete) throws SQLException {
		return stmt.executeUpdate(requete);
	}
	public ResultSet select (String requete) throws SQLException {
		return stmt.executeQuery(requete);
	}
	public int insert (String requete) throws SQLException {
		stmt.executeUpdate(requete);
		ResultSet rs = stmt.getGeneratedKeys();
		return rs.getInt(1);
	}
}
