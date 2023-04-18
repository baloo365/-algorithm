package 컬렉션2;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] all = {"apple", "banana", "apple", "banana", "melon"};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String x : all) {
			map.put(x, map.getOrDefault(x, 0) +1);
			
		}
		
		System.out.println(map);

		
		System.out.println("apple의 득표수: " + map.get("apple"));
		System.out.println("banana의 득표수: " + map.get("banana"));
		System.out.println("melon의 득표수: " + map.get("melon"));
		
		int maxValue = 0;
		String maxKey = "";
		for (String x : map.keySet()) {
			if (map.get(x) > maxValue) {
				maxValue = map.get(x);
				maxKey = x;
			}
			
		}
		
		System.out.println(maxKey + "의 득표수는 : " + maxValue);
	}

}
