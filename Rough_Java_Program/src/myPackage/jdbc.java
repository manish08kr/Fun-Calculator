package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {

	String url = "jdbc:mysql://localhost:3306/mydatabase";
	String username = "root";
	String password = "2486";
	
	public void CreateTable() {
		try {
			Connection conn = DriverManager.getConnection(url, username, password);

			System.out.println("database connected successfully");

			Statement st = conn.createStatement();

			String query = "Create table Std_Info (Id int(5), Name varchar(15), Mob int(10))";

			st.execute(query);

			System.out.println("Table created ");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void CreateData() {

		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "2486";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			String query = "INSERT INTO std_info (Id, Name, Mob) VALUES (?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, 6555);
			ps.setString(2, "mridul");
			ps.setInt(3, 321564894);

			ps.execute();
			System.out.println("Data Inserted ");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ReadData() {

		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "2486";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			Statement st = con.createStatement();

			String query = "SELECT * FROM std_info";

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println("ID : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Mob num : " + rs.getInt(3));
			}
			System.out.println("Read data successfully ");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void UpdateData() {

		String url = "jdbc:mysql://localhost/mydatabase";
		String username = "root";
		String pass = "2486";

		try {
			Connection con = DriverManager.getConnection(url, username, pass);
			String query = "UPDATE std_info set Id = ? WHERE Name = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 655);
			ps.setString(2, "mridul");

			ps.executeUpdate();
			System.out.println("Data updated");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DeleteData() {

		String url = "jdbc:mysql://localhost/mydatabase";
		String username = "root";
		String pass = "2486";

		try {
			Connection con = DriverManager.getConnection(url, username, pass);
			String query = "DELETE FROM std_info WHERE Id = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 655);

			ps.execute();
			System.out.println("Data Deleted");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}