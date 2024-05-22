import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i%2 ==0){
                ans.add("수");
            }else{
                ans.add("박");
            }
        }
        for (String s : ans) {
            answer += s;
        }

        return answer;
    }
}