import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Long> nums = new ArrayList<>();

        int count = Integer.parseInt(sc.nextLine());

        while (count > 0) {
            long t = Long.parseLong(sc.nextLine());
            nums.add(t);

            count -= 1;
        }

        for (long num : nums) {
            System.out.println((num * (num + 1)) / 2);
        }

        sc.close();
    }
}