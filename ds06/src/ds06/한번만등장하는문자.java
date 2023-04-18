package ds06;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class 한번만등장하는문자 {

	public static void main(String[] args) {

				String s = "aaddsdfe";
		        String answer = "";
		        HashSet<String> set = new HashSet<>();
		        String[] s2 = s.split("");
		        Arrays.sort(s2);
		        for (String x : s2) {
		            set.add(x); // 중복된 것은 안 들어감
		        }
		        
		        Object[] set2 = set.toArray();
		        List<String> list = Arrays.asList(s2);
		        
		        //Collections.frequency(list, x)
		        Collections.sort(list);
		        Collections.reverse(list);
		        for (Object x :set2) {
		            if (Collections.frequency(list, x) ==1) { //frequency는 컬렉션만 사용할 수 있음.
		                answer += x;
		            }
		                
		        }
		        
		        System.out.println(answer);
		    }
		
	}

