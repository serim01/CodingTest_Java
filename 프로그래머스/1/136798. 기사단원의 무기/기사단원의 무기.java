import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> intList = new ArrayList<>();
        for(int i= 1; i<=number; i++){
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) count++;
                else if (i % j == 0) count += 2;
            }
            intList.add(count);
        }
        for(int i:intList) {
            if (i>limit){
                answer += power;
            }else{
                answer += i;
            }
        }
        return answer;
    }
}