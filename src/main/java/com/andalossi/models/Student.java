package com.andalossi.models;

public class Student {
	private int id;
	private String name;
	private boolean isActive;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.isActive = isActive;
	}
	public Student( String name, boolean isActive) {
		super();
		
		this.name = name;
		this.isActive = isActive;
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
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", isActive=" + isActive + "]";
	}
	

}
