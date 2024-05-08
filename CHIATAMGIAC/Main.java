import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Tam giác cân
        // Cạnh đáy = 1
        Scanner sc = new Scanner(System.in);

        // Bộ test
        int cnt = Integer.parseInt(sc.nextLine());

        ArrayList<IntPair> pairs = new ArrayList<>();

        while (cnt > 0) {
            String[] nums = sc.nextLine().split(" ");

            pairs.add(new IntPair(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));

            cnt--;
        }

        for (int i = 0; i < pairs.size(); ++i) {
            int N = pairs.get(i).getFirst();
            int H = pairs.get(i).getSecond();
            double sAll = 0.5 * H * 1; // Diện tích tam giác to

            double sPerSection = sAll / N; // Diện tích mỗi phần

            for (int j = 1; j < N; ++j) {
                double currS = sPerSection * j;

                double currH = (currS / sAll) * H; 
                
                System.out.printf("%.6f", currH);

                if (j == N - 1) {
                    System.out.printf("\n");
                } else {
                    System.out.printf(" ");
                }
            }
        }
    }
}

class IntPair {
    public int first;
    public int second;

    public IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}