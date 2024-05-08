import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau số lượng test cases

        int[] results = new int[testCases]; // Mảng lưu kết quả của từng test case

        for (int t = 0; t < testCases; t++) {
            String A = scanner.nextLine();
            String B = scanner.nextLine();

            results[t] = countPossibleNumbers(A, B);
        }

        // In ra kết quả của từng test case
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    public static int countPossibleNumbers(String A, String B) {
        int count = 0;

        // Xác định vị trí "?" trong số A và loại bỏ chúng
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '?') {
                sb.deleteCharAt(i);
                i--; // Giảm chỉ số để duyệt qua lại kí tự vừa loại bỏ
            }
        }

        // Chuyển đổi số A thành số nguyên
        int numberA = Integer.parseInt(sb.toString());

        // Duyệt qua các chữ số từ 0 đến 9
        for (int i = 0; i <= 9; i++) {
            // Thay thế chữ số "?" bằng giá trị i
            String replacedA = A.replace('?', (char) (i + '0'));

            // So sánh số đã thay thế với số B
            if (Integer.parseInt(replacedA) > Integer.parseInt(B)) {
                count++;
            }
        }

        return count;
    }
}
