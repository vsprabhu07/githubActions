package javaDSA;
import java.util.*;

public class Decode {
    // Public helper: returns list of all decodings
    public static List<String> decodeAll(String s) {
        List<String> results = new ArrayList<>();
        if (s == null || s.length() == 0) return results;
        backtrack(s, 0, new StringBuilder(), results);
        return results;
    }

    // Backtracking recursion
    private static void backtrack(String s, int index, StringBuilder path, List<String> results) {
        int n = s.length();
        if (index == n) {
            results.add(path.toString());
            return;
        }

        // Single digit (must not be '0')
        if (s.charAt(index) != '0') { // '0' cannot be decoded alone
            int val = s.charAt(index) - '0';
            path.append((char)('A' + val - 1));
            backtrack(s, index + 1, path, results);
            path.setLength(path.length() - 1);
        }

        // Two-digit (index+1 < n and number between 10 and 26)
        if (index + 1 < n) {
            char c1 = s.charAt(index);
            char c2 = s.charAt(index + 1);
            // disallow strings like "06" because leading zero invalidates
            if (c1 != '0') {
                int num = (c1 - '0') * 10 + (c2 - '0');
                if (num >= 10 && num <= 26) {
                    path.append((char)('A' + num - 1));
                    backtrack(s, index + 2, path, results);
                    path.setLength(path.length() - 1);
                }
            }
        }
    }

    // Example runner
    public static void main(String[] args) {
        String[] tests = {"12", "226", "11106", "0", "10", "06"};
        for (String t : tests) {
            List<String> decodings = decodeAll(t);
            System.out.println("Input: \"" + t + "\"");
            if (decodings.isEmpty()) {
                System.out.println("  No valid decodings (0).");
            } else {
                System.out.println("  Total: " + decodings.size());
                for (String s : decodings) {
                    System.out.println("   - " + s);
                }
            }
            System.out.println();
        }
    }
}
