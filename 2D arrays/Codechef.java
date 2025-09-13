import java.util.*;

public class Codechef {
    private static char helper1(char ch, char prev) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('R', 'G', 'B'));
        for (char c1 : set) {
            if (c1 != ch && c1 != prev) {
                return c1;
            }
        }
        return ch;
    }
    private static int helper2(char ch, char prev, String str) {
        int ct = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ct++;
            }
            char next = helper1(ch, prev);
            prev = ch;
            ch = next;
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char[] white = {'R', 'G', 'B'};

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ct = n;
            for (char a : white) {
                for (char b : white) {
                    if (a == b) continue;
                    int curr = 0;
                    if (a != s.charAt(0)){
                        curr += 1;
                    }
                    if (b != s.charAt(1)) {
                        curr += 1;
                    }
                    curr += helper2(helper1(b, a), b, s);
                    ct = Math.min(ct, curr);
                }
            }
            System.out.println(ct);
        }
    }
}