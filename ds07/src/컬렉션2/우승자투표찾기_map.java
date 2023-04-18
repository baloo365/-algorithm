package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동",	"홍길동"};
		String[] find = {"홍길동", "김길동", "정길동"};
		
		HashMap<String, Integer> map = new HashMap<>();
		//       key타입 value타입
		
		for (String x : find) {
			map.put(x, 0); //명단을 map에 넣자
		}
		System.out.println(map);
		System.out.println(map.get("홍길동")); // value : 0
		System.out.println(map.get("홍길동") +1); // value : 1
		// map.put("홍길동", 10); //같은 key로 다시 put하면 덮어씀.
		System.out.println(map);
		
		for (String x : all) {
			//System.out.println(map.get(x) + 1);
			map.put(x, map.getOrDefault(x, 0) +1); //처음에 하나도 없을 때는 0을 넣고 다음에 있으면 해당 키를 1 증가시켜라 
		} //map.getOrDefault(key, 0)
		  //map.get(key)가 이미 저장되어 있는 경우 값을 꺼내어 사용 - key에 대한 값이 이미 저장되어 있으면 get
		  //map.get(key)가 없는 경우는 0을 사용
		
		System.out.println(map);
		
		int max = 0;
		for (String key : map.keySet()) {
			// key의 목록을 구해서, 하나씩 꺼내온다.
			System.out.println(key + ": " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key); //2
				System.out.println("현재까지 우승자: " + key );
			}
		}
		System.out.println(map);
		
		
		String answer = "";
		
		

	}

}
