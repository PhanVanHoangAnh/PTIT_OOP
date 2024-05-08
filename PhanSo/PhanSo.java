import java.util.Scanner;

public class PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int tuso = Integer.parseInt(parts[0]);
        int mauso = Integer.parseInt(parts[1]);
        Fraction fraction = new Fraction(tuso, mauso);

        System.out.printf("%s",fraction.toigian());

        sc.close();
    }
}

class Fraction {
    private int tu;
    private int mau;

    public Fraction(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int ucln(int a, int b) {
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public String toigian() {
        int ucln = this.ucln(tu, mau);
        int tuToiGian = tu / ucln;
        int mauToiGian = mau / ucln;

        return tuToiGian + "/" + mauToiGian;
    }
}