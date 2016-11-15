package com.indiabix.deep;

public class Student
{
	int Roll_No;
	String Name;
	String Gender;
	
	int DAC_Score;
	
	
	
	public int getDAC_Score()
	{
		return DAC_Score;
	}


	public void setDAC_Score(int dAC_Score)
	{
		DAC_Score = dAC_Score;
	}

	
	

	public Student()
	{
		
		Roll_No = 0001;
		Name ="DEFAULT NAME";
		Gender ="DEFAULT GENDER";
		this.DAC_Score=300;
	}


	public Student(int roll_No, String name, String gender,int DAC_Score)
	{
		
		Roll_No = roll_No;
		Name = name;
		Gender = gender;
		DAC_Score=DAC_Score;
	}


	public int getRoll_No()
	{
		return Roll_No;
	}


	public void setRoll_No(int roll_No)
	{
		Roll_No = roll_No;
	}


	public String getName()
	{
		return Name;
	}


	public void setName(String name)
	{
		Name = name;
	}


	public String getGender()
	{
		return Gender;
	}


	public void setGender(String gender)
	{
		Gender = gender;
	}

	public void display()
	{
		System.out.println("This is Base(STUDENT) Class");
		System.out.println(this.Name);
		System.out.println(this.Roll_No);
		System.out.println(this.Gender);
		
	}
	
	
	public int CalMarks()
	{
		
		System.out.println("THIS IS STUDENT CalMarks");
		int total=this.DAC_Score;
		return total;
		
	}

	public static void main(String[] args)
	{
		
	}

}
