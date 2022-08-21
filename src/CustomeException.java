import java.util.Scanner;

class InvalidAge extends RuntimeException  //or extends Exception
{
 public InvalidAge(String str)
 {
	 //calling super class constructor
	 
	 super(str);
 }
}
public class CustomeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age < 18)
		{
			throw new InvalidAge("you are not eligible for vote");
		}
		else
		{
			System.out.println("you are eligible for vote");
		}
	}

}

/*
 output
 
 Enter your age
12
Exception in thread "main" InvalidAge: you are not eligible for vote
	at CustomeException.main(CustomeException.java:24)



Enter your age
24
you are eligible for vote
*/
