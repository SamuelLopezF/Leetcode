import java.util.HashMap;

public class App {

    public static String addBinary(String a, String b)
    {
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        while(lengthA >= 0 || lengthB >= 0)
        {
            int sum = carry;
            System.out.println("sum: " + sum);
            if(lengthA >= 0)
            {
                sum += a.charAt(lengthA--) - '0';
                System.out.println("a.charAt(lengthA--): " + a.charAt(lengthA--));
            }
            {
                sum += b.charAt(lengthB--) - '0';
                System.out.println("b.charAt(lengthB--): " + b.charAt(lengthB--));
            }
            carry = sum > 1 ? 1 : 0;
            System.out.println("sum > 1 ? " + (sum > 1 ? 1 : 0));
            System.out.println("carry: " + carry);
            answer.append(sum%2);
            System.out.println("sum%2: " + sum%2);
            System.out.println("==========================");
        }        
        if(carry != 0){
            answer.append(carry);
        }
        return answer.reverse().toString();
    }




    public static void main(String[] args) throws Exception {
       String answer =  addBinary("1000011101", "110110");

       System.out.println("1000011101");
       System.out.println("+");
       System.out.println("110110000");
       System.out.println("==============");
       System.out.println(answer);
    }
}
