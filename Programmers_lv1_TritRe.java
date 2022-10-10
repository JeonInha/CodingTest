// https://school.programmers.co.kr/learn/courses/30/lessons/68935

public class Programmers_lv1_TritRe {
    public static int solution(int n) {
        int answer = 0;
        String index3 = "";
        
        while (n>=3) {
            index3 = index3.concat(String.valueOf(n%3));
            n = n/3;
        }
        
        index3 = index3.concat(String.valueOf(n));
        int[] thi = new int[index3.length()];
        
        for (int i=0; i<index3.length(); i++) {
        	int a = 1;
        	for (int j=0; j<i; j++) {
        		a *=3;
        	}
        	thi[i]=a;
        }
        
        for (int i=0; i<index3.length(); i++) {
            int a = Character.getNumericValue(index3.charAt(i));         
           answer += a*thi[index3.length()-1-i];
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(solution(45));
    }
}