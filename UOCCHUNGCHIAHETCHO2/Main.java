import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc số lượng bộ test
        int T = sc.nextInt();

        ArrayList<Integer> acc = new ArrayList<>();
        
        // Xử lý từng bộ test
        for (int t = 0; t < T; t++) {
            // Đọc số nguyên N
            int N = sc.nextInt();
            acc.add(N);
            // Đếm số ước số của N chia hết cho 2
            // int count = countFactorsDivisibleBy2(N);
            
            // // In kết quả
            // System.out.println(count);
        }

        for (int i = 0; i < acc.size(); i++) {
            System.out.println(countFactorsDivisibleBy2(acc.get(i)));
        }
        
        sc.close();
    }
    
    // Hàm đếm số ước số của N chia hết cho 2
    public static int countFactorsDivisibleBy2(int N) {
        int count = 0;
        // Duyệt từ 2 đến căn bậc hai của N
        for (int i = 2; i * i <= N; i++) {
            // Nếu i chia hết cho 2 và là ước của N, tăng biến đếm
            if (i % 2 == 0 && N % i == 0) {
                count++;
            }
            // Nếu N/i chia hết cho 2 và là ước của N (không trùng với i), tăng biến đếm
            if (N / i != i && N % (N / i) == 0 && (N / i) % 2 == 0) {
                count++;
            }
        }
        // Kiểm tra xem N chính nó có chia hết cho 2 không
        if (N % 2 == 0) {
            count++;
        }
        return count;
    }
}
