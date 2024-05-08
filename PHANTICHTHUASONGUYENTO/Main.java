import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());

        BigInteger[] acc = new BigInteger[cnt];

        for (int i = 0; i < cnt; i++) {
            String input = sc.nextLine();
            acc[i] = new BigInteger(input);
        }

        for(int i = 0; i < acc.length; i++) {
            System.out.printf("Test %d: ", i + 1);

            BigInteger curr = acc[i];
            BigInteger currDevide = BigInteger.valueOf(2);
            BigInteger count = BigInteger.ZERO;

            while (curr.compareTo(BigInteger.ONE) > 0) {
                if (curr.mod(currDevide).equals(BigInteger.ZERO)) {
                    curr = curr.divide(currDevide);
                    count = count.add(BigInteger.ONE);
                } else {
                    if (count.compareTo(BigInteger.ZERO) > 0) {
                        System.out.printf("%d(%d) ", currDevide, count);
                    }
                    count = BigInteger.ZERO; // Reset count
                    currDevide = currDevide.add(BigInteger.ONE);
                }
            }

            // Xử lý cho trường hợp còn lại sau khi vòng lặp kết thúc
            if (count.compareTo(BigInteger.ZERO) > 0) {
                System.out.printf("%d(%d) ", currDevide, count);
            }

            System.out.println();
        }
    }
}
