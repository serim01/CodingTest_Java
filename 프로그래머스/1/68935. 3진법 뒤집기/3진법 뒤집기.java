class Solution {
    public int solution(int n) {
        int answer = 0;
        String anstr = "";
        do{
            anstr += (String.valueOf(n%3));
            n = n/3;
        }while(n!=0);
        answer = Integer.parseInt(anstr, 3);
        return answer;
    }
}