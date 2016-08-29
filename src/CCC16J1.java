import java.util.Scanner;

public class CCC16J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("W")) {
                ++count;
            }
        }
        int ans = 0;
        switch (count) {
            case 0:
                ans = -1; break;
            case 1:
            case 2:
                ans = 3; break;
            case 3:
            case 4:
                ans = 2; break;
            case 5:
            case 6:
                ans = 1; break;
        }
        System.out.println(ans);
    }
}
