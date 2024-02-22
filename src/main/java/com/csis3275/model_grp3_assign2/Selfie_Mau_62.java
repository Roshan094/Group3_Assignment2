package com.csis3275.model_grp3_assign2;

public class Selfie_Mau_62 extends HomeModel {
	
	private String description;
	
	public Selfie_Mau_62(String firstName, String lastName, String studentNumber, String description) {
		super(firstName,lastName,studentNumber);
		this.description=description;
	}
	
	public Selfie_Mau_62() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
