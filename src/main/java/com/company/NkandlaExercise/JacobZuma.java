package com.company.NkandlaExercise;

public class JacobZuma extends Person {
	
	private Lawyer lawyer;
	private Architect architect;
	
	
	public Lawyer getLawyer() {
		return lawyer;
	}


	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}


	public Architect getArchitect() {
		return architect;
	}


	public void setArchitect(Architect architect) {
		this.architect = architect;
	}


	public JacobZuma(String name, int age, String gender, PersonType type, Architect architect, Lawyer lawyer) {
		super(name, age, gender, type);
		// TODO Auto-generated constructor stub
		this.lawyer = lawyer;
		this.architect = architect;
	}

}
