class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int prevMax=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                prevMax=max;
                max=arr[i];
            }else if(prevMax<arr[i] && arr[i]<max){
                prevMax=arr[i];
            }
        }
        
        return prevMax;
    }
}