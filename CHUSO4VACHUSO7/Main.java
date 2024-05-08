import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long tests = Long.parseLong(sc.nextLine());

        if (count(tests) == 4 || count(tests) == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int count(Long n) {
        int count = 0;

        while (n > 0) {
            if (n % 10 == 4 || n % 10 == 7) {
                count += 1;
            }

            n /= 10;
        }

        return count;
    }
}