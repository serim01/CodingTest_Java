class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int sum=n;

        while(true){
            answer += (sum/a)*b;
            sum = (sum/a)*b + sum%a;

            if(sum/a==0){
                break;
            }

        }
        return answer;
    }
}