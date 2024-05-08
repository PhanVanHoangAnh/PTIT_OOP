import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> acc = new ArrayList<>();

        while (cnt > 0) {
            String input = sc.nextLine();

            acc.add(Integer.parseInt(input));

            cnt--;
        }

        for(int i = 0; i < acc.size(); i++) {
            System.out.println(main.findFib(acc.get(i)));
        }
    }

    public long findFib(int n) {
        if (n < 2) {
            return n;
        }

        long a = 1, b = 1; // Khởi tạo a và b với giá trị Fibonacci đầu tiên và thứ hai

        for (int i = 3; i <= n; ++i) { // Bắt đầu tính từ F(3)
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
