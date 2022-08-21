import java.util.LinkedList;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> list = new LinkedList<>();
		
		list.add(56);
		list.add(99);
		list.add(88);
		list.add(53);
		list.add(11);
		list.add(1);
		
		System.out.println("list before sort");
		System.out.println(list);
		
		 for(int i = 0;i < list.size()-1; i++)    //we take size -1 because if i have 5 element then if i sort 4 element then bydefault 5th element on there right possition
		 {
			 for(int j = 0;j < list.size()-1;j++)
			 {
		         if(list.get(j).compareTo(list.get(j+1)) > 0)   //like array (arr[0]) we cant perforn operation array list
		         {
				    int  temp = list.get(j);                  //to acceess data we use get method

					 list.set(j, list.get(j+1));             //set() use to set value 
					 list.set(j + 1,temp);
				 }
			 }
			 
	       }
		 
		   System.out.println("list After Sorting");
		   System.out.println(list);

}
}

/*
output

list before sort
[56, 99, 88, 53, 11, 1]
list After Sorting
[1, 11, 53, 56, 88, 99]

*/

//using this for loop we can see how sorting is perform internally
//in the first iteration we get first largest element ,likewise in the second iteration we get second largest element

 /* int no = i +1;
  System.out.println("array after pass: "+ no);
  
  for(int k = 0; k <list.size();k++)
  {
  	System.out.println(list);
  }*/