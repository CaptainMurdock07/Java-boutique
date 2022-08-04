package pack.jdbc;

/*import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.sql.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "la300"; String passwrd = "secret";
		Connection cx = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			cx = DriverManager.getConnection(url, uid, passwrd);
			stmt = cx.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String requete = "UPDATE CLIENTS SET PAYS = ? WHERE PAYS = ?";
			PreparedStatement pstmt = cx.prepareStatement(requete);
			pstmt.setString(2, "France Metropol");
			pstmt.setString(1, "France");
			boolean b = pstmt.execute();
			System.out.println(b);
		} catch (ClassNotFoundException e) {
			//classe du pilote introuvable
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//acces a la base refuse
			System.out.println(e.getMessage());
		} finally {
			try {
					if (cx != null) cx.close();
					if (stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
