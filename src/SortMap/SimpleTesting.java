import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SimpleTesting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 1020);
		map.put(3, 300);
		map.put(1, 100);
		map.put(5, 500);
		map.forEach((k,v)->System.out.println(k+"="+v));
		System.out.println("After Sorting by value");
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		list.forEach(System.out::println);
	}

}


/*
output

1=100
2=1020
3=300
5=500
After Sorting by value
1=100
3=300
5=500
2=1020
*/