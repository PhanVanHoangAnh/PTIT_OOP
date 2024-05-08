import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        double a = Double.parseDouble(input);
        double b = Double.parseDouble(sc.next());

        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            double result = -b / a;
            System.out.printf("%.2f\n", result);
        }

        sc.close();
    }
}
