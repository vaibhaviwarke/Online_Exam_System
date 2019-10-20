import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery extends DBConnection {

    public static ResultSet exeQuery(String query) {
        Connection con = createConnection();
        Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        

        ResultSet resultSet = null;

        try {
            resultSet = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("ExecuteQuery.java [Error] SQL Exception");
            ex.printStackTrace();
        }

        return resultSet;
    }
}
