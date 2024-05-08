import java.util.Scanner;
import java.util.ArrayList;

public class Tsnt {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> collect = new ArrayList<Integer>();

        for (int i = 0; i < cnt; ++i) {
            int num = Integer.parseInt(sc.nextLine());
            collect.add(num);
        }

        for (int i = 0; i < collect.size(); ++i) {
            System.out.printf("Test %d: ", i + 1);

            int x = collect.get(i);
            int a = (int) Math.sqrt((double)x);

            for (int j = 2; j <= a; ++j) {
                int count = 0;

                while (x % j == 0) {
                    x /= j;
                    count++;
                }

                if (count > 0) {
                    System.out.printf("%d(%d) ", j, count);
                }
            }

            if (x > 1) System.out.printf("%d(1)", x);

            System.out.println("");
        }

        sc.close();
    }
}