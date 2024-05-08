import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public Boolean checkNT(Long num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        int count = Integer.parseInt(sc.nextLine());

        ArrayList<Long> acc = new ArrayList<>();

        while(count > 0) {
            acc.add(Long.parseLong(sc.nextLine()));
            count--;
        }

        for (long i : acc) {
            if (main.checkNT(i)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}