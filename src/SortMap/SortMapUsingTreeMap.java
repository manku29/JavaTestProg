
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapUsingTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     HashMap<Integer,String> map = new HashMap<Integer,String>();
	    
	    map.put(23,"Yash");   //insertion order is not preserve depend on hashcode
		map.put(17,"Arun");
		map.put(15,"Swarit");
		map.put(9,"Neelesh");
		
		System.out.println("map before sorting");
		for(Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		Map<Integer,String> tm = new TreeMap<Integer,String>(map);
		
		System.out.println("map after sorting");
		for(Entry m: tm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		//Collections.sort(map);   sort method does not work on map
		
		
	}

}


