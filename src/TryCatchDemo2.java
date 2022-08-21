
public class TryCatchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start 1");
		
		try
		{
			System.out.println(10/0);     //if we not handl exception  then start2 will not print and stop execution abnormally 
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		System.out.println("start 2");
	}

}

/*
output
start 1
java.lang.ArithmeticException: / by zero
start 2

*/
