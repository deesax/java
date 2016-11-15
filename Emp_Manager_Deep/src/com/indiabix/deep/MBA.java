package com.indiabix.deep;

public class MBA extends Student 
{
	
	int GD_Marks;

	
	public MBA()
	{
		
		this.GD_Marks =00;
	}

	
	public MBA(int gD_Marks)
	{
		super();
		GD_Marks = gD_Marks;
	}

	public int getGD_Marks()
	{
		return GD_Marks;
	}

	public void setGD_Marks(int gD_Marks)
	{
		GD_Marks = gD_Marks;
	}
	
	public int CalMarks()
	{
		System.out.println("Total Marks of MBA Student");
		int total=this.DAC_Score+this.GD_Marks;
		return total;
		
	}
	
	public static void main(String[] args)
	{
		Student s1=new MBA(25);
		System.out.println(s1.CalMarks());
		//MBA m1=new Student();//Error
		

	}
	
	

}
