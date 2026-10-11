class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int [2*nums.length];
        int i = 0;
        for (int count = 0; count < 2; count++){
            for (int j = 0; j < nums.length; j++){
                ans[i] = nums[j];
                i++;
            }
        }
        return ans;
    }
}