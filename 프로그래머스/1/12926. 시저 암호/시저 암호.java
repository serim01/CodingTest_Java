class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char charat = s.charAt(i);

            if(charat == ' '){
                answer += charat;
                continue;
            }

            if(Character.isLowerCase(charat)){
               if(charat + n > 'z'){
                   answer += (char)(charat - 26 + n);
               }else{
                   answer += (char)(charat +n);
               }
            }else{
                if(charat +n >'Z'){
                    answer += (char)(charat -26 +n);
                }else{
                    answer += (char)(charat +n);
                }
            }
        }
        return answer;
    }
}