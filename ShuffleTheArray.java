class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int i=0,j=n,suffle=0;
        for(;j<nums.length;)
        {
            res[suffle++]=nums[i++];
            res[suffle++]=nums[j++];
        }
        return res;
    }
}
