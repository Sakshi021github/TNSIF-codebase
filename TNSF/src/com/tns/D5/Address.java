package com.tns.D5;

public class Address {

		// TODO Auto-generated method stub
		private String street;
        private String state;
		private String postalcode;
		
		public Address()
		{
			System.out.println("default......");
			}

		public Address(String street, String state, String postalcode) {
			super();
			this.street = street;
			this.state = state;
			this.postalcode = postalcode;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPostalcode() {
			return postalcode;
		}

		public void setPostalcode(String postalcode) {
			this.postalcode = postalcode;
		}
		
		

		
}
		
