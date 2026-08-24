class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count =0;
        while(i<=j){
            int sum = 0;
            sum = nums[i] + nums[j];
            if(sum <= limit){
                count++;
                i++;
                j--;
            }
            else if(sum > limit){
                j--;
                count++;
            }
            
        }
        return count;
    }
}