import java.util.Scanner;
import java.util.ArrayList;

public class Bscusc {
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    static long lcm(long a, long b) {
        return a*b/gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        ArrayList<String> collect = new ArrayList<String>();

        for (int i = 0; i < cnt; ++i) {
            String input = sc.nextLine();
            collect.add(input);
        }

        for (int i = 0; i < collect.size(); ++i) {
            String test = collect.get(i);
            String[] parts = test.split(" ");

            int a = Integer.parseInt(parts[0]), b = Integer.parseInt(parts[1]);
            System.out.printf("%d %d\n", lcm(a, b), gcd(a, b));
        }

        sc.close();
    }
}