import java.io.IOException;

public class TestThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("Hello");
		}
		
		catch(ArithmeticException e)   //  if we write IOException e then error This exception is never thrown from the try statement body IOException
		{
			
		}
	}

}

//in the try block if there is no chance of raising exception  then
//we cant write catch block for exception
//other wise exception throw This exception is never thrown from the try statement body
//if we write catch(ArithmeticException e)  then program run properly
//we write UnChecked, partially checked but not CheckedException