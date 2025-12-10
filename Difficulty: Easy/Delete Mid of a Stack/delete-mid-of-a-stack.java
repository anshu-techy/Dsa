class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
          int mid=(int)Math.floor((s.size()+1)/2.0);
        
        delete(s,mid);
    }
    
    public static void delete(Stack<Integer>s,int mid){
         if(s.size()==mid){
            s.pop();
            return;
        }
        
        //recursively popping the remaining elements
        int top=s.peek();
         s.pop();
        delete(s,mid);
        s.push(top);
    }
}