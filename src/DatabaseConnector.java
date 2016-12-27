import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnector {

	
	public static Connection getConnection() throws SQLException{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepermarkt", "root", "password");
		return conn;
	}
	
	public static boolean isOlderThan(int age){
		"SELECT * FROM Kunde WHERE NAME = 'benutzer' AND ALTER >= 18;
	}
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sepermarkt", "root", "password");
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM MITARBEITER");
		ResultSet rs = pstmt.executeQuery(); //SELECTS
		
		//int a = pstmt.executeUpdate(); // INSERTS
		while(rs.next()){
			System.out.println(rs.getInt("MitarbeiterID"));
			System.out.println(rs.getString("Passwort"));
		}
		
	}
}
