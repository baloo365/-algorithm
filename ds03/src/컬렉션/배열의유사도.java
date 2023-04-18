package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의유사도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] s1 = {"a", "b", "c"};
			String[] s2 = {"com", "b", "d", "p", "c"};
			Solution5 sol = new Solution5();
			int answer = sol.solution(s1,s2);
			System.out.println(answer);
		}
	}

	class Solution5 {
		public int solution(String[] s1, String[] s2) {
			int answer = 0;

			return answer;
		}
	}
	class Solution {
        public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	        ArrayList<String> list = new ArrayList();
	        for(int i=0; i<s2.length; i++) {
	            for(int j=0; j<s2.length; j++) {
                if(s1[j].equals(s2[i])){
	            answer++;
                }
                }
	        }
	        return answer;
	    }
	}
	
	class Solution9 {
		    public int solution(int num, int k) {
		        int answer = 0;
		        ArrayList<Integer> list = new ArrayList<Integer>();
		       
		        // 같은 값이 있는지 없는지 찾는다.
		        // 위치를 알아낸다.
		        // 알아낸 위치 중에 제일 작은 값을 반환한다.
		        for (int i=0; i<=answer; i++) {
		                list.add(num%10);
		                answer++;
		                if (num<10) {
		                	break;
		                }
		            num = num/10; //2918
		        }
		        
		        if (list.contains(k)) {
		            answer = answer-list.lastIndexOf(k)+1;
		        } else {
		        	answer = -1;
				}
		        return answer;   
		    }
		}
	
	class Solution7 {
		 public int[] solution(int[] arr) {
		        int[] answer = {};
		        Arrays.sort(arr);
		        
		        if (arr.length==1) {
		        	answer = new int[1];
		            answer[0] = -1;
		        } else {
					answer = new int[arr.length-1];
		        for (int i=0; i<arr.length-1; i++) {
		             answer[i] = arr[arr.length-2-i];
		        }
		        }
		        return answer;
		    }
		}
	
	class Solution8 {
		 public int[] solution(int[] arr) {
		        if (arr.length ==1) {
		        	arr[0] = -1;
		        	 return arr;
		        } 
		        	int[] arr2 = arr.clone();
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        Arrays.sort(arr2);
		        for (int i = 0; i < arr2.length; i++) {
					list.add(arr2[i]);
				}
		        for (int i = 0; i < arr2.length; i++)  {
		        if (arr2[i]==arr2[0]) {
		        	list.remove(i);
		        }
				}
		        
		        int[] answer = new int[list.size()];
		        for (int i = 0; i < list.size(); i++) {
					answer[i] = list.get(arr.length-i-1);
		        }
					
		        return answer;
		    }
		}
	
	