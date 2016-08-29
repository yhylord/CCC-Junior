import java.util.Scanner;

public class CCC16J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String raw = sc.nextLine();
        String s = "#";
        for (int i = 0; i < raw.length(); i++) {
            s += raw.substring(i, i + 1) + "#";
        }
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j)) {
                j++;
            }
            ans = Math.max(ans, j - 1);
        }
        System.out.println(ans);
    }
}