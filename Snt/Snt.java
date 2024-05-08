import java.util.Scanner;
import java.util.ArrayList;

public class Snt {
    static boolean isNt(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> collect = new ArrayList<Integer>();

        for (int i = 0; i < cnt; ++i) {
            int num = Integer.parseInt(sc.nextLine());
            collect.add(num);
        }

        for (int i = 0; i < collect.size(); ++i) {
            System.out.println(isNt(collect.get(i)) ? "YES" : "NO");
        }
    }
}