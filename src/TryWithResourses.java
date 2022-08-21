//in these program closing of resources done automatically ,not need to close explicitly

import java.io.FileOutputStream;

public class TryWithResourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(FileOutputStream fos = new FileOutputStream("F:/Java_Programs/data.txt"))
		{
			 String msg = "welcome to the world of programming";
			
			 byte arr[] = msg.getBytes();
			 
			 fos.write(arr);
			 System.out.println("message written to file successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


//output:  message written to file successfully

//in the file (welcome to the world of programming),but previous data is erased (not available in the file)