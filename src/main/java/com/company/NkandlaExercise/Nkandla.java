package com.company.NkandlaExercise;

public class Nkandla extends Homestead {	
	
	public Nkandla(String name, String district, String province, String country) {
		super(name, district, province, country);
		// TODO Auto-generated constructor stub
		this.ampitheater = new Ampitheater();
		this.chickenRun = new ChickenRun();
		this.swimmingPool = new SwimmingPool();
	}

	private ChickenRun chickenRun;
	private Ampitheater ampitheater;
	private SwimmingPool swimmingPool;
	public ChickenRun getChickenRun() {
		return chickenRun;
	}
	public void setChickenRun(ChickenRun chickenRun) {
		this.chickenRun = chickenRun;
	}
	public Ampitheater getAmpitheater() {
		return ampitheater;
	}
	public void setAmpitheater(Ampitheater ampitheater) {
		this.ampitheater = ampitheater;
	}
	public SwimmingPool getSwimmingPool() {
		return swimmingPool;
	}
	public void setSwimmingPool(SwimmingPool swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	
	

}
