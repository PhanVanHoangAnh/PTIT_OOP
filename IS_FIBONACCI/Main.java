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
            BigInteger test1 = acc[i].multiply(acc[i]).multiply(BigInteger.valueOf(5)).add(BigInteger.valueOf(4));
            BigInteger test2 = acc[i].multiply(acc[i]).multiply(BigInteger.valueOf(5)).subtract(BigInteger.valueOf(4));
            System.out.println(isSquareNum(test1) || isSquareNum(test2) ? "YES" : "NO");
        }
    }

    public static boolean isSquareNum(BigInteger num) {
        BigInteger sqrt = sqrt(num);
        return sqrt.multiply(sqrt).equals(num);
    }

    public static BigInteger sqrt(BigInteger num) {
        BigInteger left = BigInteger.ZERO;
        BigInteger right = num;
        BigInteger result = BigInteger.ZERO;
        
        while (left.compareTo(right) <= 0) {
            BigInteger mid = left.add(right).divide(BigInteger.valueOf(2));
            BigInteger midSquare = mid.multiply(mid);
            
            if (midSquare.compareTo(num) == 0) {
                return mid;
            } else if (midSquare.compareTo(num) < 0) {
                left = mid.add(BigInteger.ONE);
                result = mid;
            } else {
                right = mid.subtract(BigInteger.ONE);
            }
        }
        
        return result;
    }
}
