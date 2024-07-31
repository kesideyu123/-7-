package speedkey.hello;

import java.util.ArrayList;
import java.util.List;

public class exercise3 {
    public static void main(String[] args) {
    }
    private static final String[] CHAR_MAPS = {
            "", // for empty string
            "abc", "def", "ghi",
            "jkl", "mno", "pqrs",
            "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        int len = digits.length();
        List<String> res = new ArrayList<>();
        letterCombinationHelper(res, "", digits, len - 1);
        return res;
    }

    private void letterCombinationHelper(List<String> res, String prefix, String remaining, int index) {
        if (index < 0) {
            res.add(prefix);
            return;
        }

        char digit = remaining.charAt(index);
        String letters = CHAR_MAPS[digit - '0'];
        for (char letter : letters.toCharArray()) {
            letterCombinationHelper(res, prefix + letter, remaining.substring(0, index) + remaining.substring(index + 1), index - 1);
        }
    }
}