
public class FinallyDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("try");
			System.exit(0);       //finally block dont be execute because jvm it self will be shutdown
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("Finally");
		}
	}

}

//output try
