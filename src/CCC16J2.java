import java.util.Scanner;

public class CCC16J2 {
    private static int a[][] = new int[4][4];

    private static int sumRow(int r) {
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            ret += a[r][i];
        }
        return ret;
    }

    private static int sumCol(int c) {
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            ret += a[i][c];
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = sumRow(0);
        for (int i = 1; i < 4; i++) {
            if (sumRow(i) != sum) {
                System.out.println("not magic");
                return;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (sumCol(i) != sum) {
                System.out.println("not magic");
                return;
            }
        }
        System.out.println("magic");
    }
}
