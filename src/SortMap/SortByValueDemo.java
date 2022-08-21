import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Map<String,Integer> map = new LinkedHashMap<>();
	
	     map.put("java",20);
	     map.put("c++",45);
	     map.put("java2Novice",2);
	     map.put("Unix",67);
	     map.put("Mac",26);
	     map.put("Why",20);
			
			System.out.println("map before sorting");
			
			for(Entry m: map.entrySet())
			{
				System.out.println(m.getKey()+""+m.getValue());
			}
			
			System.out.println("\n");
			System.out.println("map after sorting");
			
			List<Entry<String,Integer>> list =new  ArrayList<>(map.entrySet());
			
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
					{

						@Override
						public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
						{
							return (o2.getValue()).compareTo(o1.getValue());
						}
					});
			
			for(Map.Entry<String,Integer> entry : list)
			{
				System.out.println(entry.getKey()+ "==="+ entry.getValue());
			}
			}

}



