package DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import Project.Stringexample;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Features {
	public Connection con = null;
	public Statement st = null;

	public Features() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway", "root", "@Rams9159513412");
		System.out.println("connection established with database");
		st = con.createStatement();
	}

	public boolean insertairline(HashMap<String, String> airline) {

		String query="INSERT INTO airline (id,name) values('"+airline.get("id")+"','"+airline.get("name")+"')";                   
		
		try {
			st.execute(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public HashMap<String, String> checkUser(String email, String password) {
		
		HashMap<String,String> user=null;
		String query="select * from user where email='"+email+"' and password='"+password+"'";
		try {
			ResultSet rs=st.executeQuery(query);
			if(rs.next()) {
				user=new HashMap<>();
				user.put("name", rs.getString("name"));
				user.put("email",rs.getString("email"));
				user.put("phno",rs.getString("phno"));
				user.put("adno",rs.getString("adno"));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	public boolean insertUser(HashMap<String, String> user) {

		String query="INSERT INTO user (email, password, name, phno, adno) values('"+user.get("email")+"','"+user.get("password")+"','"+user.get("name")+"','"+user.get("phno")+"','"+user.get("adno")+"')";                   
		
		try {
			st.execute(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkAdmin(String email, String password) {

		try {
			ResultSet rs = st
					.executeQuery("select * from admin where email='" + email + "' and password='" + password + "'");
			if (rs.next())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean changeAdminPassword(String email, String password) {

		try {
			ResultSet rs = st.executeQuery("select * from admin where email='" + email + "'");
			if (!rs.next()) {
				return false;
			}
			st.execute("update admin set password='" + password + "' where email='" + email + "'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertFlight(HashMap<String, String> flight) throws SQLException {
		
		String query1 = "INSERT INTO flights (id,name, fromf, tof, datef, timef, price) VALUES" + " ('"
				+ Stringexample.fixSqlFieldValue(flight.get("id")) + "'," + " '"
				+ Stringexample.fixSqlFieldValue(flight.get("name")) + "'," + " '"
				+ Stringexample.fixSqlFieldValue(flight.get("from")) + "'," + " '"
				+ Stringexample.fixSqlFieldValue(flight.get("to")) + "'," + " '"
				+ Stringexample.fixSqlFieldValue(flight.get("date")) + "'," + " '"
				+ Stringexample.fixSqlFieldValue(flight.get("time")) + "'," + " '"
				+ Stringexample.fixSqlFieldValue(flight.get("price")) + "')";

		
		System.out.println(flight.get("date"));
		System.out.println(flight.get("time"));
		
		try {
			
			st.execute(query1);
			return true;
		} catch (SQLException e) {
			System.out.print("error");
			e.printStackTrace();
		}
		return false;
	}

	public List<String[]> searchFlights(String Id, String travellers) {

		List<String[]> flightselect = new ArrayList<>();
		String query = "SELECT * FROM flyaway.flights where Id='" + Id + "' ";
		try {
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				String[] flight = new String[5];
				flight[0] = rs.getString("ID");
				flight[1] = rs.getString("name");
				flight[2] = rs.getString("timef");
				flight[4] = rs.getString("price");
				int t1 = Integer.parseInt(flight[4]);
				int t2 = Integer.parseInt(travellers);
				int r = t1 * t2;
				String s = String.valueOf(r);
				flight[3] = travellers;
				flight[4] = s;
				flightselect.add(flight);
				return flightselect;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}


