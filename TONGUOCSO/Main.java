import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static final int MAX = 2000001; // Maximum number
    static int[] spf = new int[MAX]; // Smallest Prime Factor

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> tests = new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            tests.add(Integer.parseInt(sc.nextLine()));
        }

        sieve(); // Precompute smallest prime factors

        long sum = 0; // Use long to handle large sums

        for (int i = 0; i < tests.size(); i++) {
            sum += sumPrimeFactors(tests.get(i)); // Use the new function
        }

        System.out.println(sum);
    }

    // Function to precompute smallest prime factors
    static void sieve() {
        spf[1] = 1;
        for (int i = 2; i < MAX; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i < MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < MAX; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    // Function to find sum of prime factors
    static int sumPrimeFactors(int n) {
        int result = 0;

        while (n != 1) {
            result += spf[n];
            n /= spf[n];
        }

        return result;
    }
}
