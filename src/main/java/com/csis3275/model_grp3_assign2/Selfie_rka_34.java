package com.csis3275.model_grp3_assign2;

public class Selfie_rka_34 extends HomeModel {
		
		private String description;
		
		public Selfie_rka_34(String firstName, String lastName, String studentNumber, String description) {
			super(firstName, lastName, studentNumber);
			this.description = description;
		}
		
		public Selfie_rka_34() {
			
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
