import java.sql.*;

public class DriverTest {

	public static void main(String[] args) {
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lostfound_db?serverTimezone=UTC", "root", "mirim");
			System.out.println("Success");
		}catch(SQLException ex) { System.out.println("SQLException " + ex); }
		catch(Exception e) { System.out.println("SQLException " + e); }

	}

}
