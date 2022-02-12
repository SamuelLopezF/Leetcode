public class App {

    public static int strStr(String haystack, String needle)
    {   
        if(needle.length() > haystack.length())
        {
            return -1;
        }
        int start = -1;
        for(int i = 0; i < haystack.length(); i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {
                
                for(int j = 0; j+i < needle.length(); j++)
                {
                    System.out.println("needle.charAt(j): " + needle.charAt(j));
                    System.out.println("haystack.charAt(j+i): " + haystack.charAt(j+i));
                    if(needle.charAt(j) != haystack.charAt(j+i))
                    {
                        start = -1;
                    }
                    start = i;
                }
            }
        }
        return start;
    }



    public static void main(String[] args) throws Exception {

        int result = strStr("hello", "ll");
        System.out.println("result =  "+  result);
    }
}
