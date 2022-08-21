
public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start1");
		System.out.println(10/0);           //handle exception by default handler which is part of jvm
		System.out.println("start2");  //not print
		
	}

}

/*
output
start1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at TryCatchDemo.main(TryCatchDemo.java:8)

*/