package ds06;

import java.util.Arrays;

public class 문자열내p와y개수 {

	public static boolean main(String[] args) {

		String s = "pPOOOyY";
        boolean answer = true;
        char[] c = s.toCharArray();
        int pp = 0;
        int yy = 0;
        
        for (int i = 0; i < c.length; i++) {
        	if (c[i] == 'P' || c[i]== 'p' ) {
        		pp++;
        	} else if (c[i] == 'y' || c[i]== 'Y') {
				yy++;
		}
        	
        	if (pp!=yy) {
				answer = false;
			} else {
				answer = true;
			}
        	
        

    }
		return answer;
}
    
}
