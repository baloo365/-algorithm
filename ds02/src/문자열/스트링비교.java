package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all = "국어, 영어, 수학, 컴퓨터";
		String all2[] = all.split(",");
		for (int i = 0; i < all2.length; i++) {
			all2[i] = all2[i].trim();
		}	
		System.out.println("과목수는 >> " + all2.length);
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("컴퓨텅 위치는 인덱스 : " + i);
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명이 3글자 미만인 과목수 >> " + count);
	}

}
