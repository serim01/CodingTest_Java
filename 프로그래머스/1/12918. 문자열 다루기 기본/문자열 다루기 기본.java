class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String REGEX = "[0-9]+";
        if(s.matches(REGEX) && (s.length() == 4 || s.length() == 6)){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}