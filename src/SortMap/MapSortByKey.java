import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortByKey {

	public static void main(String[] args) {
		

	     Map<Integer,String> map = new LinkedHashMap();
		    
		    map.put(222,"Yash");   //insertion order is not preserve depend on hashcode
			map.put(17,"Arun");
			map.put(153,"Swarit");
			map.put(9,"Neelesh");
			
			System.out.println("map before sorting");
			for(Entry m: map.entrySet())
			{
				System.out.println(m.getKey()+"=="+m.getValue());
			}
			
			List<Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
			
			Collections.sort(list, new MyComparator2());
			
			System.out.println("\n");
			System.out.println("map After sorting");
			for(Map.Entry<Integer,String> entry : list)
			{
				System.out.println(entry.getKey()+ "==="+ entry.getValue());
			}

	}

}

class MyComparator2 implements Comparator<Entry<Integer,String>>
{

	@Override
	public int compare(Entry<Integer,String> o1, Entry<Integer,String> o2)
	{
		return (o2.getKey()).compareTo(o1.getKey());
	}

}

/*
output

map before sorting
222==Yash
17==Arun
153==Swarit
9==Neelesh


map After sorting
222===Yash
153===Swarit
17===Arun
9===Neelesh
*/