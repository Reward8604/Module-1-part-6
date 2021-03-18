package com.techelevator;

public abstract class Wall 
{


	//Instance Variables
	
	 private String name;
	 private String color;
	
	//Constructor
	
	public   Wall(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	//Method 
	
	public  String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public abstract int getArea();
	
	
}
