package App.entities;

import java.sql.Date;

public class Student {
	private int id;
	private String name;
	private String lastname;
	private String gender;
	private Date birthdate;
	private double avg;
	private double min_voto;
	private double max_voto;

	public Student(String name, String lastname, String gender, Date birthdate, double min_voto, double max_voto) {
		setName(name);
		setLastname(lastname);
		setGender(gender);
		setBirthdate(birthdate);
		setMin_voto(min_voto);
		setMax_voto(max_voto);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getMin_voto() {
		return min_voto;
	}

	public void setMin_voto(double min_voto) {
		this.min_voto = min_voto;
	}

	public double getMax_voto() {
		return max_voto;
	}

	public void setMax_voto(double max_voto) {
		this.max_voto = max_voto;
	}

}
