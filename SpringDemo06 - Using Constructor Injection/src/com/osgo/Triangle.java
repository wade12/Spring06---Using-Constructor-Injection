package com.osgo;


public class Triangle
{
	private String type;
	private int height;
	
	// method overloading
	public Triangle(String type)
	{
		this.type = type;
	} // end 1-argument String constructor
	
	
	public Triangle(int height)
	{
		this.height = height;
	} // end 1-argument height constructor
	
	
	public Triangle(String type, int height)
	{
		this.type = type;
		this.height = height;
	} // end 2-argument constructor
	
	
	public String getType()
	{
		return type;
	} // end method getType

/*
	public void setType(String type)
	{
		this.type = type;
	} // end method setType
*/	
	
	public int getHeight()
	{
		return height;
	} // end method getHeight
	

	public void draw()
	{
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
		
	} // end method draw()
	
} // end Class Triangle
