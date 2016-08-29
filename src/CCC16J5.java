import java.util.Scanner;

public class CCC16J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        int[] letters = new int[26];
        int asterisks = 0;
        for (int i = 0; i < a.length(); ++i) {
            ++letters[a.charAt(i) - 'a'];
        }
        for (int i = 0; i < b.length(); ++i) {
            char ch = b.charAt(i);
            if (ch == '*') {
                ++asterisks;
            } else {
                --letters[ch - 'a'];
            }
        }
        int diff = 0;
        for (int i = 0; i < 26; ++i) {
            diff += Math.abs(letters[i]);
        }
        System.out.println(diff <= asterisks ? "A" : "N");
    }
}
