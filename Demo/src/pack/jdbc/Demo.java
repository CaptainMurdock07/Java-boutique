package pack.jdbc;

/*import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.sql.*;

public class Demo {

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
			stmt = cx.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
									  ResultSet.CONCUR_UPDATABLE);
			String requete = "SELECT CODE_CLIENT, PAYS FROM CLIENTS";
			ResultSet rs = stmt.executeQuery(requete);
			/*rs.absolute(3);
			rs.updateString(6, "France");*/
			while (rs.next()) {
				String code_client = rs.getString("CODE_CLIENT");
				if (code_client.equals("SUPRD")) {
					rs.updateString("PAYS", "France");
					rs.updateRow();
				}
				//System.out.println(societe + "/" + pays);
			}
			/*rs.insertRow();
			rs.deleteRow();
			rs.updateRow();*/
			/*while (rs.previous()) {
				String societe = rs.getString("SOCIETE");
				String pays = rs.getString("Pays");
				System.out.println(societe + "/" + pays);
			}*/
			/*String requete = "UPDATE CLIENTS SET PAYS = 'France Metropol' WHERE PAYS = 'France'";
			int r = stmt.executeUpdate(requete);
			System.out.println(r);*/
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
