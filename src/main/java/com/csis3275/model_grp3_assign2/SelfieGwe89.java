package com.csis3275.model_grp3_assign2;

public class SelfieGwe89 extends HomeModel{
	private String description;
	
	public SelfieGwe89(String firstName, String lastName, String studentNumber, String description) {
		super(firstName, lastName, studentNumber);
		this.description = description;
	}
	
	public SelfieGwe89() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}