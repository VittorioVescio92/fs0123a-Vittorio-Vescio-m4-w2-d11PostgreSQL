package App;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import App.entities.Student;

public class Application {
	static Connection conn = null;

	public static void main(String[] args) {

		Student student1 = new Student("Aldo", "Baglio", "M", Date.valueOf("1992-04-15"), 8.0, 10.0);
		Student student2 = new Student("Giacomo", "Poretti", "M", Date.valueOf("2000-04-15"), 5.0, 7.0);

		String url = "jdbc:postgresql://localhost:5432/fs0123a-Vittorio-Vescio-m4-w2-d11PostgreSQL?useSSL=false";
		String username = "postgres";
		String password = "test";
		try {
			System.out.println("Connecting to PG...");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		insertStudent(student1);
		insertStudent(student2);
	}

	public static void insertStudent(Student student) {
		String sqlInsert = "INSERT INTO public.school_students("
				+ "name, lastname, gender, birthdate, min_vote, max_vote)" + "	VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sqlInsert);
			stmt.setString(1, student.getName());
			stmt.setString(2, student.getLastname());
			stmt.setString(3, student.getGender());
			stmt.setDate(4, student.getBirthdate());
			stmt.setDouble(5, student.getMin_voto());
			stmt.setDouble(6, student.getMax_voto());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}