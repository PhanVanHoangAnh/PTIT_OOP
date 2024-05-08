import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = new BigInteger(sc.nextLine());

        Main main = new Main();

        BigInteger curr = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            curr = curr.add(main.giaithua(i));
        }

        System.out.println(curr);
    }

    public BigInteger giaithua(BigInteger n) {
        BigInteger curr = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            curr = curr.multiply(i);
        }

        return curr;
    }
}