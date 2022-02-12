public class App {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length ==1)
        {
            return nums[0];
        }
        int current = 0;
            for(int i = 1; i < nums.length; i++)
                {
                    if(nums[i] > nums[current])
                    {
                        current++;
                        nums[current] = nums[i];
                    }

                }
        return ++current;
    }

    public static void main(String[] args) throws Exception {
        int[] poop = {0,0,1,1,1,2,2,3,3,4};
        int shit = removeDuplicates(poop);
        for (int i = 0; i < shit; i++) {
            System.out.print(poop[i]);
        }
    }
}
