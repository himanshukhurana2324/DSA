class Solution {
    public int maxProduct(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        // HERE WE HAVE USED THE KADANE'S ALGORITHM TO OPTIMISED THE CODE
        for (int i = 1; i < nums.length; ++i) {
            maxCurrent = Math.max(nums[i], maxCurrent * nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
}

// class Solution {
// public int maxProduct(int[] arr) {
// int n = arr.length;
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < (1 << n); i++) {
// int product = 1;
// for (int j = 0; j < n; j++) {
// if ((i & (1 << j)) > 0) {
// product *= arr[j];
// }
// }
// max = Math.max(max, product);
// }
// return(max);
// }
// }
