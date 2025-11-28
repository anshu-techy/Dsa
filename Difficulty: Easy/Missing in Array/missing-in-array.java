 class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;           // total numbers should be n
        long sum = (long)n * (n + 1) / 2; // expected sum of 1..n

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];                // subtract actual elements
        }

        return (int) sum;                 // remaining value is missing number
    }
}
