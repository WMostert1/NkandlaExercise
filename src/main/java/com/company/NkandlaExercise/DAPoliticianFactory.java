package com.company.NkandlaExercise;

public class DAPoliticianFactory implements IPoliticianFactory {

	@Override
	public IVisitor createPolitician() {
		// TODO Auto-generated method stub
		return new HelenZille("Helen Zille", 55, "F", PersonType.Politician);
	}

}
