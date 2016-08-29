import java.util.Scanner;

public class CCC15J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == 1 || (a == 2 && b < 18)) {
            System.out.println("Before");
        } else if (a == 2 && b == 18) {
            System.out.println("Special");
        } else {
            System.out.println("After");
        }
    }
}