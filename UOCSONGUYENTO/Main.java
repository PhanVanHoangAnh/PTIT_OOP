import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        ArrayList<Long> acc = new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            acc.add(Long.parseLong(sc.nextLine()));
        }

        for (int i = 0; i < acc.size(); i++) {
            System.out.println(solve(acc.get(i)));
        }
    }

    public static long solve(long n) {
        long res = -1; // Khởi tạo biến res với giá trị mặc định là -1

        // Vòng lặp từ 2 đến căn bậc hai của n
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                res = i; // Cập nhật giá trị của res khi tìm thấy ước số nguyên tố i
                n /= i;
            }
        }

        // Kiểm tra nếu n là số nguyên tố lớn nhất
        if (n > 1) {
            res = n;
        }

        return res;
    }

}
