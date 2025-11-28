class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
         int count = 0; // index for placing non-zero numbers


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }
}