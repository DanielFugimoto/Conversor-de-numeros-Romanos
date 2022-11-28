import java.util.HashMap;
import java.util.Scanner;

public class Romano {
	  
    public static void main(String[] args)
    {
        String s;
        
        try (Scanner sc = new Scanner(System.in)) {
            solution vlr = new solution();
            System.out.print("Digite um número romano: ");
            s = sc.next();
            vlr.romanToInt(s);
        }
    }
}
class solution {
    int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0
                && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }
            else {
                result += map.get(s.charAt(i));
                System.out.print("O resultado da conversão é: ");
            }
            System.out.print(result);
        }
        return result;
    }
}
