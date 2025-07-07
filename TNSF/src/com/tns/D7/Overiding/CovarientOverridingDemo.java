package com.tns.D7.Overiding;

//parent class
class Colour{
	protected Colour getColour()
	{
		Colour s= new Colour();
		return s;
	}
}

//child class
class Red extends Colour{
	//@override
	protected Colour getColour()
	{
		Red s = new Red();
		return s;
	}
}

//child class
class Blue extends Colour{
	//@override
	protected Colour getColour()
	{
		Blue s = new Blue();
		return s;
	}
}


public class CovarientOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
