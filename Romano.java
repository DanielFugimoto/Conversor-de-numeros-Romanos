import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com um número Romano: ");

            String input = scanner.nextLine();

            int result = romanToInt(input);

            System.out.println(result);
        }
    }


    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> roman = getRomanMap();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = roman.get(c);

            if (i + 1 < s.length() && roman.get(s.charAt(i + 1)) > value) {
                result -= value;
            } else {
                result += value;
            }
        }

        System.out.print("O seu número romano em Indio-Arabio é: ");

        return result;
    }

    public static Map<Character, Integer> getRomanMap() {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        return roman;
    }
}
