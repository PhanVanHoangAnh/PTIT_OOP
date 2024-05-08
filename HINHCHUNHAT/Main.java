import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] numbers = line.split(" ");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        if (num1 <= 0 || num2 <= 0) {
            System.out.print(0);
            return;
        } else {
            System.out.print((num1 + num2) * 2);
            System.out.print(" ");
            System.out.print(num1 * num2);
        }

        sc.close();
    }
}