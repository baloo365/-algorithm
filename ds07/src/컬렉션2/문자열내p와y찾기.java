package 컬렉션2;

import java.util.HashMap;

public class 문자열내p와y찾기 {

	public static void main(String[] args) {
		String s = "pPooyY";
		//p와 y의 개수가 대소문자 상관없이 동일하면 true/false
		//대소문자 상관없다 ==> 대문자, 소문자로 바꾸세요.
		String s2 = s.toLowerCase(); //소문자로 바꿔줌.
		String[] s3 = s2.split("");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String x: s3) {
			map.put(x, map.getOrDefault(x, 0) +1); // 값을 갖고 올 수 있으면 갖고 오고, 값이 없으면 0을 가져와라.
		}
		// for문 돌때마다 값이 있으면 +1이됨
		
		System.out.println(map);
		System.out.println(map.get("p") == map.get("y"));
		
	}

}
