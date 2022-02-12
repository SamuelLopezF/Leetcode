public class App {


    public static int maxSubArray(int[] nums)
    {   
        for (int i : nums) {
            System.out.print(i);
        }
        System.out.println("\n==============");
        if(nums[0] < 0)
        {
            int[] subArray = new int[nums.length -1];
            System.arraycopy(nums, 1, subArray, 0, nums.length-1);
            maxSubArray(subArray);
        }else if(nums[nums.length-1] < 0){
            int[] subArray = new int[nums.length-1];
            System.arraycopy(nums, 0, subArray, 0, nums.length-1);
            maxSubArray(subArray);
        }

        int sum = 0;
        for (int i : nums) {
            sum = i + sum;
        }
        int nextSum = 0;
        for(int i = 0; i < nums.length-1; i++)
        {
            nextSum = nextSum + i;
        }
        if(nextSum > sum)
        {
            
        }
        for(int i = 1; i  < nums.length; i++)
        {
            nextSum = nextSum + i;
        }
    }
    public static void main(String[] args) throws Exception {
        int[] nums = {-4,-3,-2,-1,0,1,2,3,4,5,-1,-1,-2,-3,-4};
        maxSubArray(nums);
    }
}
