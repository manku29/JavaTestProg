
public class MethodToPrintExpcpInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("nikita"); 
			System.out.println(10/0); 
		}
		catch(ArithmeticException  ae)
		{
			ae.printStackTrace();        //java.lang.ArithmeticException: / by zero
			System.out.println(ae.toString());   //at MethodToPrintExpcpInfo.main(MethodToPrintExpcpInfo.java:10)
			System.out.println(ae.getMessage());  //java.lang.ArithmeticException: / by zero
		}
	}

}
