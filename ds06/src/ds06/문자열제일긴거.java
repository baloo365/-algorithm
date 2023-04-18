package ds06;

public class 문자열제일긴거 {

	public static void main(String[] args) {

			String s = "i am a boy";
			String[] s2 = s.split(" ");
			int max = s2[0].length();
			String maxString = s2[0];
			
			for (String result : s2) {
				if (max < result.length()) {
					max = result.length();
					maxString = result;
			}
		}
			System.out.println(maxString);
	}	
}
