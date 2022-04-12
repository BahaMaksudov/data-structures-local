import java.util.HashSet;
import java.util.Set;

public class Assignment7FindFirstRepeatedChar {
    public static void main(String[] args) {
        System.out.println(findFirstReapetingChar("a green apple"));
    }

    public static char findFirstReapetingChar(String str) {
        Set<Character> set =new HashSet<>();
        var chars = str.toCharArray();

        for (Character ch : chars) {
            if(set.contains(ch)) return ch;
            set.add(ch);
        }
       return Character.MIN_VALUE;

    }
}
