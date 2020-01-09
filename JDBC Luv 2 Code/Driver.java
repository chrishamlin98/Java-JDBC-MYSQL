import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try {
			//1. Get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			//3. Execute an SQL query
			ResultSet myRs = myStmt.executeQuery("Select * from employees");
			//4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}

			//  NEED TO INSERT DATA INTO THE MYSQL DATABASE TO SEE IF IT WORKS //

		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
