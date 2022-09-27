package Package1;

public class Employee1 
{
	String firstname;
	String lastname;
	int age;
	String designation;
	//setter method
	class Main
	{
		private int age;
		public void setAge(int age)
		{
			this.age=age;
		
		}
	}
	Employee1()
	{
		
	}
    //Parameterised Constructor
	Employee1(String fname,String lname,int age1, String desgntn)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.age=age1;
		this.designation=desgntn;

	}
	void display()
	{
		System.out.println(firstname+" "+lastname+" "+age+" "+designation);
	}
	@Override
	public String toString()
	{
		return this.firstname+" "+this.lastname+" "+this.age+" "+this.designation;
	}
	
   public static void main(String[] args)
	{
	   Employee1 emp=new Employee1();
	   emp.firstname="Alka";
    	 emp.lastname="Singh";
	   emp.age=22;
	   emp.designation="QE";
	   emp.display();
	 
	   Employee1 emp2=new Employee1();
	   emp2.firstname="Shipra";
	   emp2.lastname="Joshi";
	   emp2.age=22;
	   emp2.designation="QE";
	   emp2.display();
	   Employee1 emp1=new Employee1("Vivek","Gupta",23,"QE");
	   emp1.display();
	   System.out.print(emp2.toString());
	}

}
