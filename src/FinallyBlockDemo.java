
public class FinallyBlockDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println(m1());
	}
	
	public static int m1()
	{
		try
		{
			return 777;
		}
		catch(Exception e)
		{
			return 888;
		}
		finally
		{
			return 999;
		}
		
	}

}

//output 999
