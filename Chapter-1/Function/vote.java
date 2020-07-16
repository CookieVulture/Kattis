package Function;

import java.util.Scanner;

public class vote {
    public static void main(String[] args){
        new vote().work();
    }

    private void work() {
        Scanner s = new Scanner(System.in);
        int[] k = new int[10];
        int[] v = new int[10];
        int nc = s.nextInt();
        for (int tc = 1; tc <= nc; tc++) {
            int n = s.nextInt();
            int sc = 0;
            for (int i = 0; i < n; i++) {
                k[i] = i + 1;
                sc += v[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j > i; j--) {
                    if (v[j] > v[j - 1]) {
                        int t = v[j];
                        v[j] = v[j - 1];
                        v[j - 1] = t;
                        t = k[j];
                        k[j] = k[j - 1];
                        k[j - 1] = t;
                    }
                }
            }

            if (2 * v[0] > sc) {
                System.out.println("majority winner " + k[0]);
            } else if (v[0] == v[1]) {
                System.out.println("no winner");
            } else {
                System.out.println("minority winner " + k[0]);
            }
        }
        s.close();
    }

}
