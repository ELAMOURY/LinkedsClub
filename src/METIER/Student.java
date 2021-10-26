package METIER;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.jdbc.Blob;

@Entity
@Table(name="Student")
public class Student implements Serializable{
	@Id
	private String CNE;
	private String fullName;
	private String gender;
	private String email;
	private String level;
	private String birthDate;
	private String major;
	private String password;
	private String image;
	private String studentBio;
	
	//Constructor
	public Student() {}
	public Student(String cNE, String fullName,String gender, String email, String level, String birthDate, String major,String password, String image, String studentBio) {
		super();
		CNE = cNE;
		this.fullName = fullName;
		this.gender=gender;
		this.email = email;
		this.level = level;
		this.birthDate = birthDate;
		this.major = major;
		this.password = password;
		this.image = image;
		this.studentBio = studentBio;
	}
	
	
	//Getters && Setters
	public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStudentBio() {
		return studentBio;
	}
	public void setStudentBio(String studentBio) {
		this.studentBio = studentBio;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
}
