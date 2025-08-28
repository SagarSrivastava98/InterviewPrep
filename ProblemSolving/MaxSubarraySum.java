class MaxSubarraySum {
    public static void main(String[] args) {
        //Example:1

        MaxSubarraySum obj = new MaxSubarraySum();
        int sum = obj.maxSubArray(new int[]{-2,1,-3,4,-1,3,-5,4});
        System.out.println("Maximum Sum is " + sum);

    }
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;

        int[] result = getMaxArray(0, nums);
        int max = result[0];
        for(int num: result){
            max = num>max?num:max;
        }
        return max;
    }
    public int[] getMaxArray(int index, int[] max) {
        if(index == (max.length-1))
            return max;

        int[] arr = getMaxArray(index+1, max);
        arr[index] = Math.max(arr[index], arr[index+1]+arr[index]);

        return arr;
    }
}