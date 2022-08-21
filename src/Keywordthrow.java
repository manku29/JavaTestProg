
public class Keywordthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		throw new ArithmeticException("/ by zero");
		
		//System.out.println("hello"); Unreachable code give compile time error
	}

}

/*

Exception in thread "main" java.lang.ArithmeticException: / by zero
at Keywordthrow.main(Keywordthrow.java:7)

*/