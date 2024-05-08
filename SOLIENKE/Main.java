import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer count = Integer.parseInt(sc.nextLine());

        ArrayList<Long> tests = new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            tests.add(Long.parseLong(sc.nextLine()));
        }

        for (int i = 0; i < tests.size(); i++) {
            System.out.println(check(tests.get(i)) == 1 ? "YES" : "NO");
        }
    }

    public static int check(Long n) {
        long base = 0;

        while(n > 0) {
            if (base == 0) {
                base = n % 10;

                if (Math.abs(base - ((n / 10) % 10)) > 1 || Math.abs(base - ((n / 10) % 10)) == 0) {
                    return 0;
                }

                base = (n / 10) % 10;
                n = n / 100;
            }

            if (Math.abs(base - (n % 10)) > 1 || Math.abs(base - (n % 10)) == 0) {
                return 0;
            }

            base = n % 10;
            
            n /= 10;
        }

        return 1;
    }
}