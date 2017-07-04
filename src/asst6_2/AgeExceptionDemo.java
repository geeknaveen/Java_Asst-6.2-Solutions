/*Generating NegativeAgeException if user inputs negative value for age.  */

package asst6_2;

import java.util.Scanner;

public class AgeExceptionDemo {
	static void checkAge(int inputAge) throws NegativeAgeException     //Function to check age and to throw Exception if it is negative. 
	{
		if(inputAge < 0)      //Checking weather age is negative or not.
		{
			throw new NegativeAgeException();     //If age is negative then throw exception.
		}
		else
		{
			System.out.println("Age of User is "+inputAge);       //Printing statement.
		}
		
	}      //End of function.
	
	public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
	{
		int ageOfUser;           //int variable to store age of user.
		
		System.out.println("Please Enter your Age: ");
				
		// For taking input from the user, we have to make the object of Scanner class.
      	Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		ageOfUser=sc.nextInt();       //Initializing variable by input integer by user.
		
		try       //try block.
		{
			checkAge(ageOfUser);     //Calling the checkAge function to check weather age is possible or not.
		}
		catch(NegativeAgeException e)          //catch block.
		{
			System.out.println(e);      //Printing Exception Statement.
		}
		
		sc.close();         
	}      

}      