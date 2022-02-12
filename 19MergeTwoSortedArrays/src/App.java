public class App {

     public static void merge(int[] nums1, int m,int[] nums2, int n)
     {  
        if(m == 0 )
        {
            nums1[0] = nums2[0];
        }
        for(int j = m+n; j > 0 && m >= 0 && n >= 0; j --)
        {
            if(nums1[m-1] >= nums2[n-1])
            {
                nums1[m+n-1] = nums1[m-1];
                m--;
            }else
            {
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
     }

    public static void main(String[] args) throws Exception {
        int a[] = {2,0};
        int b[] = {1};
        merge(a, 1, b, 1);
    }
}
