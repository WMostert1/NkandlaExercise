package com.company.NkandlaExercise;

public abstract class Person {
	
	public Person(String name, int age, String gender, PersonType type) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public PersonType getType() {
		return type;
	}
	public void setType(PersonType type) {
		this.type = type;
	}
	private String name;
	private int age;
	private String gender;
	private PersonType type;
	
	
}
