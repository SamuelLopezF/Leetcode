import java.util.HashMap;

public class App {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> conversionTable = new HashMap<>();
        conversionTable.put('I', 1);
        conversionTable.put('V', 5);
        conversionTable.put('X', 10);
        conversionTable.put('L', 50);
        conversionTable.put('C', 100);
        conversionTable.put('D', 500);
        conversionTable.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i: " + i);

            int currentValue = conversionTable.get(s.charAt(i));
            System.out.println("currentValue: " + currentValue);
            if (i < s.length() - 1) {
                int nextValue = conversionTable.get(s.charAt(i + 1));
                System.out.println("nextValue: " + nextValue);
                if (nextValue > currentValue) {
                    int result = nextValue - currentValue;
                    total = result + total;
                    i++;
                    System.out.println("result: " + result);
                    System.out.println("total: " + total);
                    System.out.println("----------------------------");
                } else {
                    total = currentValue + total;
                    System.out.println("total: " + total);
                    System.out.println("----------------------------");
                }
            } else {
                total = currentValue + total;
                System.out.println("total: " + total);
                System.out.println("----------------------------");

            }

        }

        return total;
    }

    public static void main(String[] args) throws Exception {
        romanToInt("III");
    }
}
