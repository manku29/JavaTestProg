
class Demo
{
   void m1(int age)
   {
	   if(age < 18)
	   {
		   throw new ArithmeticException("your are not eligible for vote");  //throw new exception_class("error message");  
	   }
	   else
	   {
		   System.out.println("you are eligible for vote");
	   }
   }
}

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d  = new Demo();
		d.m1(13);
	}

}


/*

Exception in thread "main" java.lang.ArithmeticException: your are not eligible for vote
at Demo.m1(TestThrow.java:8)
at TestThrow.main(TestThrow.java:23)

*/