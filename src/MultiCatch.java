//1  order of exception imp catch(ArrayIndexOutOfBoundsException | ArithmeticException | Exception e) then give error
//2 catch(Exception e)  is the right order 
//3 catch(ArrayIndexOutOfBoundsException | ArithmeticException e) is the right  order
//if order change then give error exception is already handle

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a[] = new int[5];
			a[5] = 30/0;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) //if we write (ArithmeticException | Exception e ) then give error exception already catch
		{
			e.printStackTrace();                                                  
		}
	}

}

/*
output
java.lang.ArithmeticException: / by zero
at MultiCatch.main(MultiCatch.java:10)

*/