package com.doctors.appointment.entities;

import java.util.Date;

public class Patient {
public int pid,age,mobile;
public String name,bloodGroup,address,email;
public Date dateOfAppointment;

@Override
public String toString() {
	return "Patient [pid=" + pid + ", age=" + age + ", mobile=" + mobile + ", name=" + name + ", bloodGroup="
			+ bloodGroup + ", address=" + address + ", email=" + email + ", dateOfAppointment=" + dateOfAppointment
			+ "]";
}
public Patient(int pid, int age, int mobile, String name, String bloodGroup, String address, String email,
		Date dateOfAppointment) {
	super();
	this.pid = pid;
	this.age = age;
	this.mobile = mobile;
	this.name = name;
	this.bloodGroup = bloodGroup;
	this.address = address;
	this.email = email;
	this.dateOfAppointment = dateOfAppointment;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDateOfAppointment() {
	return dateOfAppointment;
}
public void setDateOfAppointment(Date dateOfAppointment) {
	this.dateOfAppointment = dateOfAppointment;
}

}
