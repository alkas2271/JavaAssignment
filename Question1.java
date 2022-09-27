package Package1;

public class Question1
{
    //Static Variable
	 static String FirstName="Alka";
     static String LastName="Singh";
     static int age=23;
	
   //Static Block
	 static
	   { String FirstName="Shipra";
	      String LastName="Raj";
	      int age=22;
	      System.out.println(FirstName+" "+LastName+" "+age);
	   }
  //Static Method
	 static void printfunction()
	    {
	      String FirstName="Vivek";
		  String LastName="Gupta";
		  int age=21;
		  System.out.println(FirstName+" "+LastName+" "+age);
	    }
	 public static void main(String[] args) 
		{
	       printfunction();
	       System.out.println(FirstName+" "+LastName+" "+age);
	    }
}
