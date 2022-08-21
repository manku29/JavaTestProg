import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

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
		
		for(int i = 1; i < list.size();i++)     //consider first element is sorted start comparing from the second elemnet
		{
			int key = list.get(i);
			int j = i - 1;
			
			 while(j >= 0 && list.get(j).compareTo(key) > 0)     // compare index(j >= 0) and value( j > key) when both condition satisfy then only loop execute 
			 {
				list.set(j+1, list.get(j));                    // copy value j into j+1
				
				j = j-1;                                       //j--
			 }
			 
			 list.set(j+1,key);                          //copy  value of key into j+1
		}
		
		System.out.println("list after sort");
		System.out.println(list);
	}

}


/*
list before sort
[56, 99, 88, 53, 11, 1]
list after sort
[1, 11, 53, 56, 88, 99]

*/