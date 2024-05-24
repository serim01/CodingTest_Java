class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long fee = 0;
        for(long i = 1; i<= count; i++){
            fee += price * i;
        }
        if(money - fee > 0){
            return 0;
        }else{
            answer = - (money - fee);
        }
        return answer;
    }
}