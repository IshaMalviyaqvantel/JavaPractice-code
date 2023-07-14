package jdbc_learn;
import java.beans.Statement;
import java.sql.*;





public class javademo {
	public static void main(String args[]) throws ClassNotFoundException 
	{ 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "isha1234");
			Statement st=(Statement) con.createStatement();
			ResultSet rs=((java.sql.Statement) st).executeQuery("select * from employee");
			
			while(!rs.next()) {
				System.out.println(rs.getString("name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		}

		
	}


