package com.company.NkandlaExercise;

public class EFFPoliticianFactory implements IPoliticianFactory {

	@Override
	public IVisitor createPolitician() {
		// TODO Auto-generated method stub
		return new JuliusMalema("Julius Malema", 55, "M", PersonType.Politician);
	}

}
