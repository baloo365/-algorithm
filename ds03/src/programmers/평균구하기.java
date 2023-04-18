package programmers;

public class 평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for (int j = 0; j < arr.length; j++) {
        	answer += arr[j];
		} 
        answer = answer/arr.length;
        return answer;
    }
}