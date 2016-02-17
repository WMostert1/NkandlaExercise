package com.company.NkandlaExercise;

import junit.framework.TestCase;
public class TestPerson extends TestCase {
	
	private IPoliticianFactory DAFactory  = new DAPoliticianFactory();
	private IPoliticianFactory EFFFactory = new EFFPoliticianFactory();
	
	private JacobZuma Jz;
	private Person Hz;
	private Person Jm;


public void testJz () {
	assertNotNull(Jz.getArchitect());
	assertNotNull(Jz.getLawyer());
	
	assertTrue(Jz.getName().compareTo("Jacob Zuma") == 0);
	assertTrue(Jz.getGender().compareTo("M") == 0);
	assertTrue(Jz.getType() == PersonType.Politician);
	assertTrue (Jz.getAge() >= 20);
	assertTrue (Jz.getAge() <= 100);
	}

@Override
protected void setUp() throws Exception {
	// TODO Auto-generated method stub
	super.setUp();
	Jz = new JacobZuma("Jacob Zuma", 55, "M", PersonType.Politician, new Architect("John", 21, "M", PersonType.Architect), new Lawyer("James", 25, "F", PersonType.Lawyer));
	Hz = (Person)DAFactory.createPolitician();
	Jm = (Person)EFFFactory.createPolitician();
}

public void testHz () {
	assertTrue(Hz.getName().compareTo("Helen Zille") == 0);
	assertTrue(Hz.getGender().compareTo("F") == 0);
	assertTrue(Hz.getType() == PersonType.Politician);
	assertTrue (Hz.getAge() >= 20);
	assertTrue (Hz.getAge() <= 100);
	}

public void testJm () {
	assertTrue(Jm.getName().compareTo("Julius Malema") == 0);
	assertTrue(Jm.getGender().compareTo("M") == 0);
	assertTrue(Jm.getType() == PersonType.Politician);
	assertTrue (Jm.getAge() >= 20);
	assertTrue (Jm.getAge() <= 100);
	}
}
