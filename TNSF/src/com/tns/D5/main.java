package com.tns.D5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating address object
		Address address=new Address("405 Laxmi road", "Maharashtra", "432140" );
				
				//accessing person
				person p=new person("Sakshi",address);
		        p.displayInfo();
		        
		        //displaying output
		        
		        p.displayInfo();
		        
		        //displaying output using ToString it only display name and memory address
		        
		        System.out.println(p);

	}

}
