package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 연습 {

}



class Solution2{
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(i * 6 % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

class Solution3 {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
			answer = (int) (price * 0.8);
		} else if (price >=300000) {
			answer = (int) (price * 0.95);
		} else if (price >=100000) {
			answer = (int) (price * 0.9);
		}
        return answer;
    }
}

class Solution6 {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
			if (array[i]>=height) {
				answer = array.length-i;
				break;
			}
		}
        return answer;
    }
}

class Solution7 {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){
            for (int i = 1; i <= n/2; i++) {
            	answer = answer + 2*i;
			}
        } else {
        	for (int i = 1; i <= (n-1/2); i++) {
        		answer = answer + 2*i;
		}
    }
		return answer;
}
}

class Solution8 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] >0) {
			answer = 1;
		}else if (dot[0] < 0 && dot[1] >0) {
			answer = 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else {
			answer = 4;
		}
        
        return answer;
    }
}

class Solution9 {
    public int solution(int hp) {
        int answer = 0;
       answer = hp/5 + (hp%5)/3 + ((hp%5)%3);
        return answer;
    }
}

class Solution10 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}

class Solution11 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
        	answer=1;
		} else {
			answer=2;
		}
        return answer;
    }
}

class Solution12 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 1; i <= cipher.length()/code; i++) {
			answer += cipher.charAt(code*i-1);
		}
        return answer;
    }
}

class Solution13 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
        	answer[i] = strlist[i].length();
		}
        return answer;
    }
}

class Solution14 {
	public int[] solution(int[] arr, int divisor) {
	     ArrayList<Integer> list = new ArrayList<Integer>();
	    	    	
	    	        for (int i = 0; i < arr.length; i++) {
	    				if (arr[i]%divisor == 0) {
	    					list.add(arr[i]);
	    				}
	    			}
	    	        
	    	        int[] answer = null;
	                
	    	        if(list.size() != 0) {
	    	        answer = new int[list.size()];
	    	        
	    	        for (int i = 0; i < answer.length; i++) {
	    				answer[i] = list.get(i);
	    			}
	    	        }
	                else if (list.size()==0){
	                	 answer = new int[1];
	    	        	answer[0] = -1;
	    	        }
	    	        
	                Arrays.sort(answer);
	                return answer;
	                }
	    	    }

class Solution15 {
		  public int[] solution(int[] numbers, int num1, int num2) {
		        int[] answer = null;
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        
		        for (int i = num1; i <= num2; i++) {
		        	list.add(numbers[i]);
				}
		        
		        for (int i = 0; i < num2-num1+1; i++) {
					answer = new int[num2-num1+1];
		        	answer[i] = list.get(i);
				}
		        
		        return answer;
		    }
		}




class Solution16 {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for (int i = 1; i <= count;) {
         
            total += (price * count);
            if(count != 0) {
                count--;
            }
        }
        if(total > money) {
            answer = total - money;
        } else {
            answer = 0;
        }
        
        
        return answer;
    }
}

class Solution17 {
	 public int solution(int n) {
	        int answer = 0;
	        int x = 1;
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	        	for (int j = 1; j <= n-i; j++) {
					sum += (x+i);
	        		x++;
	        		if (sum == n) {
		        		answer++;
	        			break;
		        		
		        	}
				}
	        	x = 1;
	        	sum = 0;
	        	
			}
	        
	        return answer;
	    }
	}