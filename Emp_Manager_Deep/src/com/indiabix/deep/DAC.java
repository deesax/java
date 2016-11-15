package com.indiabix.deep;

public class DAC extends Student
{
	String Inst_Name;
	int PRN;
	int Lab_Marks;
	int End_Module_Marks;
	

	 public DAC(String inst_Name, int pRN, int lab_Marks, int end_Module_Marks)
	{
		super();
		Inst_Name = inst_Name;
		PRN = pRN;
		Lab_Marks = lab_Marks;
		End_Module_Marks = end_Module_Marks;
	}

	public DAC()
	 {   super();
		 this.Inst_Name="DEFAULT INST.";
		 this.PRN=000000;
				 
	 }
	

	public int getLab_Marks()
	{
		return Lab_Marks;
	}

	public void setLab_Marks(int lab_Marks)
	{
		Lab_Marks = lab_Marks;
	}

	public int getEnd_Module_Marks()
	{
		return End_Module_Marks;
	}

	public void setEnd_Module_Marks(int end_Module_Marks)
	{
		End_Module_Marks = end_Module_Marks;
	}

	public String getInst_Name()
	{
		return Inst_Name;
	}

	public void setInst_Name(String inst_Name)
	{
		Inst_Name = inst_Name;
	}

	public int getPRN()
	{
		return PRN;
	}

	public void setPRN(int pRN)
	{
		PRN = pRN;
	}
	
	public void display()
	{
		System.out.println("This is Derived(DAC) Class");
		System.out.println("Insttitue Name "+this.Inst_Name);
		System.out.println("Studnt Name "+this.Name);
		System.out.println("Roll Number "+this.Roll_No);
		System.out.println("Gender "+this.Gender);
		System.out.println("PRN "+this.PRN);
		System.out.println("LabMarks "+this.Lab_Marks);
		System.out.println("EndModuleMarks "+this.End_Module_Marks);
		
		
	}
	
	public int CalMarks()
	{
		System.out.println("THIS IS DAC CalMarks");
		int total=this.DAC_Score+this.End_Module_Marks+this.Lab_Marks;
		return total;
	}

	public static void main(String[] args)
	{
		Student s1=new DAC("IACSD",0125433,34,90);
		
		System.out.println(s1.CalMarks());
		
		/*Student s1 = new Student();
		System.out.println(s1.CalMarks());*/
		
		/*DAC d1=new DAC("IACSD",25433,34,90);
		d1.display();*/
		//System.out.println(d1.CalMarks());

	}

}
