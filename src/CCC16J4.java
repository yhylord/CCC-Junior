import java.util.Scanner;

public class CCC16J4 {
    private static int hour2minute(int hour) {
        return hour * 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] raw = sc.nextLine().split(":");
        int hh = Integer.parseInt(raw[0]);
        int mm = Integer.parseInt(raw[1]);

        for (int remain = 120; remain > 0; --remain) {
            boolean rush = (hh >= 7 && hh < 10) || (hh >= 15 && hh < 19);
            /*
            only works when mm % 2 == 0, as it'll be 00, 20, or 40,
            or it will count 1 more minute in the rush hours
            */
            mm += rush ? 2 : 1;
            if (mm >= 60) {
                mm -= 60;
                ++hh;
            }
            if (hh >= 24) {
                hh -= 24;
            }
        }

        System.out.println(String.format("%02d", hh) + ":" + String.format("%02d", mm));
    }
}