package speedkey.hello;

import java.util.ArrayList;
import java.util.List;

public class exercise2 {
    private static final String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        helper(digits, 0, "", result);
        return result;
    }

    private void helper(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        for (char ch : mapping[digits.charAt(index) - '2'].toCharArray()) {
            helper(digits, index + 1, current + ch, result);
        }
    }

    public static void main(String[] args) {
        exercise2 solution = new exercise2();
        String digits = "23";
//        System.out.println(exercise2(letterCombinations(digits)));
    }
}
