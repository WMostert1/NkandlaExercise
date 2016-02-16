package com.company.NkandlaExercise;

public class JuliusMalema extends Person implements IVisitor {

	public JuliusMalema(String name, int age, String gender, PersonType type) {
		super(name, age, gender, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visit(Homestead hs) throws Auwa {
		// TODO Auto-generated method stub
		throw new Auwa();
	}

}
