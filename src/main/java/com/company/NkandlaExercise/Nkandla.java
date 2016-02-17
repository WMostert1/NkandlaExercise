package com.company.NkandlaExercise;

public class Nkandla extends Homestead {	
	private Nkandla() {
		super("Nkandla Homestead", "Nkandla", "KZN", "RSA");
		// TODO Auto-generated constructor stub
		this.ampitheater = new Ampitheater();
		this.chickenRun = new ChickenRun();
		this.swimmingPool = new SwimmingPool();
	}
	
	public static Nkandla getInstance() {
        if (instance == null ) {
            synchronized (Nkandla.class) {
                if (instance == null) {
                    instance = new Nkandla();
                }
            }
        }

        return instance;
    }

	private ChickenRun chickenRun;
	private Ampitheater ampitheater;
	private SwimmingPool swimmingPool;
	private static volatile Nkandla instance;
	
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
