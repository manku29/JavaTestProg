
public class FinallyDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("try");
			return;
		}
		catch(Exception e)
		{
			System.out.println("catch");
			return;
		}
		finally
		{
			System.out.println("finally");
		}
	}

}

/*
 output
 
 try
finally

*/
