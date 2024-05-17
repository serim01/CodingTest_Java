class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] find = {0,1,2,3,4,5,6,7,8,9};
        for(int a:numbers){
            find[a] = 0;
        }

        for(int b:find){
            answer += b;
        }
        return answer;
    }
}