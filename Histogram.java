import java.util.Scanner;

/**
 * Created by Vilcho on 2/11/2017.
 */
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numTo199Count = 0;
        int numTo399Count = 0;
        int numTo599Count = 0;
        int numTo799Count = 0;
        int numTo1000Count = 0;

        if (n >= 1 && n <= 1000) {
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(scanner.nextLine());

                if (num > 0 && num < 200) {
                    numTo199Count += 1;
                } else if (num >= 200 && num < 400) {
                    numTo399Count += 1;
                } else if (num >= 400 && num < 600) {
                    numTo599Count += 1;
                } else if (num >= 600 && num < 800) {
                    numTo799Count += 1;
                } else if (num >= 800 && num <= 1000) {
                    numTo1000Count += 1;
                }
            }
        }
        double p1 = (double)(numTo199Count) / n * 100.00;
        double p2 = (double)numTo399Count / n * 100.00;
        double p3 = (double)numTo599Count / n * 100.00;
        double p4 = (double)numTo799Count / n * 100.00;
        double p5 = (double)numTo1000Count / n * 100.00;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1, p2, p3, p4, p5);
    }
}
