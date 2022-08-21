//At a time only one exception occurs and at a time only one catch block is executed.
//order of catch block is important
public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a[] = new int[5];
			a[5] = 30/0;
		}
		catch(ArithmeticException e) //if in first catch i write ArrayIndexOutOfBoundsException then these will be printed
		{
			System.out.println("Arithmetic Exception occure");
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("(ArrayIndexOutOfBoundsException occure");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occure");
		}
		
		System.out.println("rest of the code");
		}
	

}

/*
 output
 
 Arithmetic Exception occure
rest of the code

*/
