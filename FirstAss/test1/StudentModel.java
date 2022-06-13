package com.java.app2;

public class StudentModel {
	private int RollNUmber,age,Totalmark;
	private String id,name,grade;
	public int getRollNumber() {
		return RollNUmber;
	}
	public void setRollNumber(int rollNUmber) {
		RollNUmber = rollNUmber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalmark() {
		return Totalmark;
	}
	public void setTotalmark(int totalmark) {
		Totalmark = totalmark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
