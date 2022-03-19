import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Assignment6FindFirstNonRepeatingChar {
    public static void main(String[] args) {

        System.out.println(findFirstNonRepeatingChar("a green apple"));

    }
    public static char findFirstNonRepeatingChar(@NotNull String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        var chars = str.toCharArray();
        //O(n)
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else {//first time we see ch (character)
                map.put(ch, 1);
            }
        }
        //O(n)
        for (Character ch : chars) {
            if (map.get(ch) == 1) return ch;
        }
        //O(n) + O(n) => O(n) this is constance so it is O(n)
        return Character.MIN_VALUE;
    }
}
