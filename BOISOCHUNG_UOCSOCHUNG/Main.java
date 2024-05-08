import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger count = new BigInteger(sc.nextLine());

        Main main = new Main();

        ArrayList<BigIntPair> acc = new ArrayList<>();

        for (BigInteger i = BigInteger.ONE; i.compareTo(count) <= 0; i = i.add(BigInteger.ONE)) {
            String[] nums = sc.nextLine().split(" ");
            
            acc.add(new BigIntPair(new BigInteger(nums[0]), new BigInteger(nums[1])));
        }

        for (int i = 0; i < acc.size(); ++i) {
            System.out.printf("%s %s\n", acc.get(i).getFirst().multiply(acc.get(i).getSecond()).divide(main.UCNN(acc.get(i).getFirst(), acc.get(i).getSecond())), main.UCNN(acc.get(i).getFirst(), acc.get(i).getSecond()));
        }
    }

    public BigInteger UCNN(BigInteger x, BigInteger y) {
        while (x.compareTo(y) != 0) {
            if (x.compareTo(y) > 0) {
                x = x.subtract(y);
            } else {
                y = y.subtract(x);
            }
        }

        return x;
    }
}

class BigIntPair {
    public BigInteger first;
    public BigInteger second;

    public BigIntPair(BigInteger first, BigInteger second) {
        this.first = first;
        this.second = second;
    }

    public BigInteger getFirst() {
        return first;
    }

    public BigInteger getSecond() {
        return second;
    }

    public void setFirst(BigInteger first) {
        this.first = first;
    }

    public void setSecond(BigInteger second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}