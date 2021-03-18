package com.techelevator;

public class SquareWall extends RectangleWall
{
	//Constructor

	public SquareWall(String name, String color, int sideLength)
	{
		super(name, color, sideLength, sideLength);
		
	}
	
	//Method
	@Override
	public String toString() 
	{
		return getName() + " " +  "(" + this.getLength()  + "x" +  this.getHeight() + ") square";
	}
	
}
