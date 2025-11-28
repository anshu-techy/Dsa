class Solution {
    static boolean isPerfect(int n) {
        // 1 is not a perfect number
        if (n == 1) return false;
        
        int sum = 1; // start with 1 (always a divisor)
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i; // add the pair divisor
                }
            }
        }
        
        return sum == n;
    }
}
