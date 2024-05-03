import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> intList = new ArrayList<>();
        while(n>0){
            intList.add(n % 10);
	        n /= 10;
        }
        
        for(int i=0; i<intList.size(); i++){
                answer += intList.get(i);
        }
        return answer;
    }
}