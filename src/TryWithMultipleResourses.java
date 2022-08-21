import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithMultipleResourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fos = new FileOutputStream("F:/Java_Programs/data.txt");
			FileInputStream fis = new FileInputStream("F:/Java_Programs/data.txt"))
		{
			 String msg = "welcome to the world of programming";
			
			 byte arr[] = msg.getBytes();
			 
			 fos.write(arr);
			 System.out.println("message written to file successfully");
			 
			 
			 //code to read data from the file
			 
			 DataInputStream inst = new DataInputStream(fis);
			 
			 int data = fis.available();
			 
			 byte arr2[] = new byte[data];
			 
			 inst.read(arr2);
			 
			 String str = new String(arr2);
			 
			 System.out.println("data from the file");
			 System.out.println(str);
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

/*

message written to file successfully
data from the file
welcome to the world of programming

*/