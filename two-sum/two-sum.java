class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numsSize = nums.length;
        int[] output={0,1};
        
    
            int mStartIndex, mEndIndex;
            
            for(int startIndex=0; startIndex<numsSize-1; startIndex++){
            mStartIndex = startIndex;
            for(int endIndex=startIndex + 1; endIndex<numsSize; endIndex++){
                mEndIndex = endIndex;
                int sum = nums[startIndex]+nums[endIndex];
                if(sum==target){
                    output = new int[]{mStartIndex, mEndIndex};
                    return output;
                }
            }
            }
        
        
        return output;
        
    }

}