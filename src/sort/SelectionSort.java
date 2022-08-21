import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

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
		
		
		for(int i = 0; i < list.size()-1;i++)
		{
			int min = i;
			
			for(int j = i +1; j < list.size();j++)
			{
				if(list.get(min).compareTo(list.get(j)) > 0)  //if min > j
				{
					min = j;              //min update
				}
			}
			
			if(list.get(i).compareTo(list.get(min)) > 0) //if(i != min) perform swaping
            {
	             int temp = list.get(i);
	             
	             list.set(i, list.get(min));
	             list.set(min, temp);
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
