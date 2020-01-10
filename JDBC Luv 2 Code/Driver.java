import java.sql.*;

public class Driver {
	static boolean userRequestsData;

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";

		try {
			//1. Get connection to database
			Connection myConn = DriverManager.getConnection(url, user, password);

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute a SQL update
			String sql = "insert into employees "
						+ " (last_name, first_name, email)"
						+ " values ('Brown', 'David', 'david.brown@home.com')";

			myStmt.executeUpdate(sql);

			System.out.println("Insert complete.");

/*			//3. Execute a SQL query
			ResultSet myRs = myStmt.executeQuery("Select * from employees");

			//4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
*/
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
