package pack.jdbc;

/*import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.sql.*;

public class Demo3 {

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
			cx.setAutoCommit(false);
			//Permet l'éxecution des requêtes dans la base de donées
			stmt = cx.createStatement();
			int n = stmt.executeUpdate("UPDATE EMPLOYES SET SALAIRE = SALAIRE - 2000 WHERE NO_EMPLOYE = 5");
			if (n == 1)
				n = stmt.executeUpdate("UPDATE EMPLOYES SET SALAIRE = SALAIRE + 2000 WHERE NO_EMPLOYE = 2");
			if (n == 1)
				cx.commit();
			else
				cx.rollback();
			//cx.commit();
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