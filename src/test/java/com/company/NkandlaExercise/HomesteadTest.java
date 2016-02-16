package com.company.NkandlaExercise;

import org.junit.Test;

import junit.framework.TestCase;


public class HomesteadTest extends TestCase {

	private Homestead hs;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();

		hs = new Nkandla("Nkandla Homestead", "Nkandla", "KZN", "RSA");
	}

	public void testNkandlaSetUp() {
		assertTrue(hs.getCountry().equals("RSA"));
		assertTrue(hs.getDistrict().equals("Nkandla"));
		assertTrue(hs.getProvince().equals("KZN"));
		assertTrue(hs.getName().equals("Nkandla Homestead"));
	}

	public void testNkandlaComposition() {
		Nkandla nk = (Nkandla) hs;
		assertNotNull(nk.getAmpitheater());
		assertNotNull(nk.getChickenRun());
		assertNotNull(nk.getSwimmingPool());
	}


	public void testHelen() {

		try {
			hs.accept(new HelenZille("Helen Zille", 55, "F", PersonType.Politician));
			fail("Exception not thrown.");
		} catch (Auwa e) {
			
		}

	}


	public void testMalema() {
		try {
			hs.accept(new JuliusMalema("Julius Malema", 55, "M", PersonType.Politician));
			fail("Exception not thrown.");
		} catch (Auwa e) {
			
		}
	}
}

