class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1){
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for (int j : arr) {
            min = Math.min(min, j);
        }
        int idx = 0;

        for (int j : arr) {
            if (min == j) {
                continue;
            } else {
                answer[idx++] = j;
            }
        }
        return answer;
    }
}