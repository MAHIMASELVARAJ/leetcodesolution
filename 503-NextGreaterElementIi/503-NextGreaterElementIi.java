// Last updated: 2/4/2026, 3:30:05 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s=new Stack();
        int n=nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n*2;i++){
            int x=nums[i%n];
            while(!s.empty() && x> nums[s.peek()]){
                res[s.peek()] = x;
                s.pop();
            }
            s.push(i%n);
        }
        return res;
    }
}