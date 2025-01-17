class Solution {
  public boolean ispossible(int nums[], int maxOperations, int k) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > k) {
            maxOperations -= (nums[i] - 1) / k; // Calculate splits needed
        }
        if (maxOperations < 0) {
            return false; // Too many splits required
        }
    }
    return true;
}
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1,r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(nums,maxOperations,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}