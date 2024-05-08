import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;

class Test {
    int n;
    List<Integer> items;

    Test(int n, List<Integer> items) {
        this.n = n;
        this.items = items;
    }
}

public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List<Test> tests = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(sc.nextLine());
            List<Integer> items = new ArrayList<Integer>();
            String stringItems = sc.nextLine();
            String[] parts = stringItems.split(" ");

            for (int j = 0; j < parts.length; ++j) {
                int newItem = Integer.parseInt(parts[j]);
                items.add(newItem);
            }

            Test test = new Test(n, items);

            tests.add(test);
        }

        for (int i = 0; i < tests.size(); i++) {
            System.out.printf("Test %d:\n", i + 1);

            Map<Integer, Integer> m = new HashMap<Integer, Integer>();

            int n = tests.get(i).items.size();

            for (int j = 0; j < n; j++) {
                int number = tests.get(i).items.get(j);

                if (m.get(number) == null) {
                    m.put(number, 1);
                } else {
                    m.put(number, m.get(number) + 1);
                }
            }

            for (int number : tests.get(i).items) {
                if (m.containsKey(number)) {
                    if (m.get(number) > 0) {
                        System.out.printf("%d xuat hien %d lan\n", number, m.get(number));
                        m.put(number, 0);
                    }
                }
            }

            Iterator<Map.Entry<Integer, Integer>> iterator = m.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();

                if (entry.getValue() == 0) {
                    iterator.remove();
                }
            }
        }

        sc.close();
    }
}
