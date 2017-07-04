/*1. Write a program to generate a user-defined exception called NegativeAgeException 
if the user inputs negative value for age.   */

package asst6_2;

/*
 * User defined exception needs to inherit (extends) Exception class in order to act as an exception.
 * throw keyword is used to throw such exceptions.
 * */
class NegativeAgeException extends Exception      //Creating class NegativeAgeException as a child of Exception inbuilt class.
{
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public String toString()
	{
		return "\nGenerating NegativeAgeException - The user has inputed negative value for age.";         //returning String when exception occurs.
	}
	
}    //End of class. 

