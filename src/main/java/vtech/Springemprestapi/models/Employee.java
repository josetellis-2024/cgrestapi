package vtech.Springemprestapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //this help hibernate to create table // employee

public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long empId;

private String empFirstName;
private String empLastName;
private String empRole;
private String empImg;
private String empemail;
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpFirstName() {
	return empFirstName;
}
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
public String getEmpLastName() {
	return empLastName;
}
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
public String getEmpRole() {
	return empRole;
}
public void setEmpRole(String empRole) {
	this.empRole = empRole;
}
public String getEmpImg() {
	return empImg;
}
public void setEmpImg(String empImg) {
	this.empImg = empImg;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.empemail = empemail;
}

}
