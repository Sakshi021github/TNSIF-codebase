package com.tns.D8.Abstraction;

public class Square extends Shape {
	float side;
	
	public Square (float side) {
		this.side=side;
	}
	
	public Square () {
		side=5.0f;
	}
	
	public void calArea() {
		this.area=side*side;
		
	}
	
	

}
