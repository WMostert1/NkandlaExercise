package com.company.NkandlaExercise;

public class Homestead {

	public Homestead() {
		// TODO Auto-generated constructor stub
	}
	
	public Homestead(String name, String district, String province, String country) {
		super();
		this.name = name;
		this.district = district;
		this.province = province;
		this.country = country;
	}

	private String name;
	private String district;
	private String province;
	private String country;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void accept(IVisitor visitor) throws Auwa{
			visitor.visit(this);
	}
	

}
