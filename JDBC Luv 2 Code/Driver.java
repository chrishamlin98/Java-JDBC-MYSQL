import java.sql.*;

public class Driver {
	static boolean userRequest;

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "root";
		String password = "root";

		try {
			//1. Get connection to database
			Connection myConn = DriverManager.getConnection(url, user, password);

			//2. Create a statement
			Statement myStmt = myConn.createStatement();

			//3. Execute SQL delete
			String sql = "delete from employees where last_name='Brown'";

			int rowsAffected = myStmt.executeUpdate(sql);

			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Delete complete.");

/*
 * import java.sql.*;

/**
 * Test calling stored procedure with IN parameters
 *
 * @author www.luv2code.com
 *
 *
public class IncreaseSalariesForDepartment {

    public static void main(String[] args) throws Exception {

        Connection myConn = null;
        CallableStatement myStmt = null;

        try {
            // Get a connection to database
            myConn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "student", "student");
            String theDepartment = "Engineering";
            int theIncreaseAmount = 10000;

            // Show salaries BEFORE
            System.out.println("Salaries BEFORE\n");
            showSalaries(myConn, theDepartment);
            // Prepare the stored procedure call
            myStmt = myConn
                    .prepareCall("{call increase_salaries_for_department(?, ?)}");
            // Set the parameters
            myStmt.setString(1, theDepartment);
            myStmt.setDouble(2, theIncreaseAmount);
            // Call stored procedure
            System.out.println("\n\nCalling stored procedure.  increase_salaries_for_department('" + theDepartment + "', " + theIncreaseAmount + ")");
            myStmt.execute();
            System.out.println("Finished calling stored procedure");
            // Show salaries AFTER
            System.out.println("\n\nSalaries AFTER\n");
            showSalaries(myConn, theDepartment);
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myConn, myStmt, null);
        }
    }

    private static void showSalaries(Connection myConn, String theDepartment) throws SQLException {

        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            // Prepare statement
            myStmt = myConn
                    .prepareStatement("select * from employees where department=?");
            myStmt.setString(1, theDepartment);

            // Execute SQL query
            myRs = myStmt.executeQuery();
            // Process result set
            while (myRs.next()) {
                String lastName = myRs.getString("last_name");
                String firstName = myRs.getString("first_name");
                double salary = myRs.getDouble("salary");
                String department = myRs.getString("department");

                System.out.printf("%s, %s, %s, %.2f\n", lastName, firstName, department, salary);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myStmt, myRs);
        }
    }

    private static void close(Connection myConn, Statement myStmt,
            ResultSet myRs) throws SQLException {
        if (myRs != null) {
            myRs.close();
        }
        if (myStmt != null) {
            myStmt.close();
        }
        if (myConn != null) {
            myConn.close();
        }
    }

    private static void close(Statement myStmt, ResultSet myRs)
            throws SQLException {
        close(null, myStmt, myRs);
    }
}

**

			//3. Execute SQL update
			String sql = "update employees "
					+ " set email='demo@myhome.com'"
					+ " where id=5";
			myStmt.executeUpdate(sql);

			System.out.println("Update complete.");
 *
		//3. Execute a SQL create new data
			String sql = "insert into employees "
					+ " (last_name, first_name, email)"
					+ " values ('Brown', 'David', 'david.brown@home.com')";

			myStmt.executeUpdate(sql);

			System.out.println("Insert complete.");
*

			//3. Execute a SQL query
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
