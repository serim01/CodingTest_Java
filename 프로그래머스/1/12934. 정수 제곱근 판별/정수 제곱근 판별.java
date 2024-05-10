class Solution {
    public long solution(long n) {
        if (n < 0) {
            return -1;
        }
        
        long sqrt = (long) Math.sqrt(n);
        
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }
}